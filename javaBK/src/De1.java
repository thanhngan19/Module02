package De1_2022;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;

public class De1 extends JFrame implements ActionListener {
    JLabel lbData, lbKey;
    JTextField txtdata, txtKey;
    JButton btFile, btRanking, btSearch, btWon;
    JTextArea area;
    JPanel pn, pn1;
    JComboBox comboBox1;

    public void GUI() {
        lbData = new JLabel("Import data");
        lbKey = new JLabel("Keyword");
        txtdata = new JTextField(7);
        txtKey = new JTextField(7);
        btFile = new JButton("Import file");
        btRanking = new JButton("Ranking");
        btSearch = new JButton("Search");
        btWon = new JButton("Won teams");
        area = new JTextArea();
        comboBox1= new JComboBox<>();
        JScrollPane areaScrollPane = new JScrollPane(area);
        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));

        btFile.addActionListener(this);
        btRanking.addActionListener(this);
        btSearch.addActionListener(this);
        btWon.addActionListener(this);

        pn = new JPanel(new GridLayout(2, 1, 2, 2));
        pn1 = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

//		gbc.weightx = 1.0;
//		gbc.weighty = 1.0;
//		gbc.ipadx = 30;
//		gbc.ipady = 10;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pn1.add(lbData, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        pn1.add(txtdata, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        pn1.add(btFile, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        pn1.add(lbKey, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        gbc.gridx = 1;
        gbc.gridy = 1;
        pn1.add(txtKey, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        pn1.add(btRanking, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        pn1.add(btSearch, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        pn1.add(btWon, gbc);

        pn.add(pn1);
        pn.add(areaScrollPane);

        add(pn);
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == btFile) {
            String filePath = txtdata.getText();
            if (!filePath.isEmpty()) {
                try (BufferedReader br = new BufferedReader(new FileReader("D://" + filePath))) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://127.0.0.1:3306/dethamkhao";
                        Connection con = DriverManager.getConnection(url, "root", "");

                        String line;
                        area.setText("");
                        while ((line = br.readLine()) != null) {
                            String[] fields = line.split(",");
                            String teamName = fields[0];
                            String universityName = fields[1];
                            String problemID = fields[2];
                            String time = fields[3];
                            String result = fields[4];

                            area.append(line + "\n");

                            String insertQuery = "INSERT INTO ICPC (TeamName, UniversityName, ProblemID, Time, Result) "
                                    + "VALUES (?, ?, ?, ?, ?)";
                            PreparedStatement pstmt = con.prepareStatement(insertQuery);
                            pstmt.setString(1, teamName);
                            pstmt.setString(2, universityName);
                            pstmt.setString(3, problemID);
                            pstmt.setInt(4, Integer.parseInt(time));
                            pstmt.setString(5, result);
                            pstmt.executeUpdate();
                        }
                    } catch (Exception ex2) {
                        // TODO: handle exception
                        System.err.format("Exception: %s%n", ex2);
                    }
                } catch (Exception ex1) {
                    // TODO: handle exception
                    System.err.format("Exception: %s%n", ex1);
                }
            } else
                JOptionPane.showMessageDialog(txtdata, "Chua nhap import data");
        }

        if (e.getSource() == btRanking) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://127.0.0.1:3306/icpc";
                Connection con = DriverManager.getConnection(url, "root", "");

                Statement stmt = con.createStatement();
                String query = "SELECT TeamName, UniversityName, COUNT(*) AS TotalProblems, SUM(Time) AS TotalTime "
                        + "FROM ICPC " + "WHERE Result = 'AC' " + "GROUP BY TeamName, UniversityName "
                        + "ORDER BY TotalProblems DESC, TotalTime";
                ResultSet resultSet = stmt.executeQuery(query);
                int rank = 1;
                area.setText("");
                while (resultSet.next()) {
                    String teamName = resultSet.getString("TeamName");
                    String universityName = resultSet.getString("UniversityName");
                    int totalProblems = resultSet.getInt("TotalProblems");
                    int totalTime = resultSet.getInt("TotalTime");

                    // Hiển thị kết quả phân hạng trong text area
                    area.append(rank + "," + teamName + "," + universityName + "," + totalProblems + "," + totalTime
                            + "\n");

                    rank++;
                }
                stmt.close();
            } catch (Exception e2) {
                // TODO: handle exception

            }
        }
        if (e.getSource() == btSearch) {
            String txtName = txtKey.getText();
            if (!txtName.isEmpty()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://127.0.0.1:3306/dethamkhao";
                    Connection con = DriverManager.getConnection(url, "root", "");

                    Statement stmt = con.createStatement();
                    String query = "SELECT TeamName, UniversityName, COUNT(*) AS TotalProblems, SUM(Time) AS TotalTime "
                            + "FROM ICPC " + "WHERE Result = 'AC' " + "GROUP BY TeamName, UniversityName "
                            + "ORDER BY TotalProblems DESC, TotalTime";
                    ResultSet resultSet = stmt.executeQuery(query);
                    int rank = 1;
                    area.setText("");
                    while (resultSet.next()) {
                        String teamName = resultSet.getString("TeamName");
                        String universityName = resultSet.getString("UniversityName");
                        int totalProblems = resultSet.getInt("TotalProblems");
                        int totalTime = resultSet.getInt("TotalTime");

                        // Hiển thị kết quả phân hạng trong text area
                        if (universityName.equals(txtName)) {
                            area.append(rank + "," + teamName + "," + universityName + "," + totalProblems + ","
                                    + totalTime + "\n");
                        }

                        rank++;
                    }
                    stmt.close();
                } catch (Exception e2) {
                    // TODO: handle exception

                }
            } else
                JOptionPane.showMessageDialog(txtdata, "Chua nhap ten truong");
        }
        if (e.getSource() == btWon) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://127.0.0.1:3306/dethamkhao";
                Connection con = DriverManager.getConnection(url, "root", "");

                Statement stmt = con.createStatement();
                String query = "SELECT TeamName, UniversityName, COUNT(*) AS TotalProblems, SUM(Time) AS TotalTime "
                        + "FROM ICPC " + "WHERE Result = 'AC' " + "GROUP BY TeamName, UniversityName "
                        + "ORDER BY TotalProblems DESC, TotalTime";
                ResultSet resultSet = stmt.executeQuery(query);
                int rank = 1;
                area.setText("");
                java.util.List<String> chuoi = new ArrayList<>();
                Boolean check = false;
                while (resultSet.next()) {
                    String teamName = resultSet.getString("TeamName");
                    String universityName = resultSet.getString("UniversityName");
                    int totalProblems = resultSet.getInt("TotalProblems");
                    int totalTime = resultSet.getInt("TotalTime");

                    for (String str : chuoi) {
                        if (str.equals(universityName))
                            check = true;
                    }
                    if (!check) {
                        // Hiển thị kết quả phân hạng trong text area
                        area.append(rank + "," + teamName + "," + universityName + "," + totalProblems + "," + totalTime
                                + "\n");
                        chuoi.add(universityName);
                    }

                    rank++;
                }
                stmt.close();
            } catch (Exception e2) {
                // TODO: handle exception

            }
        }
    }

    public De1(String str) {
        super(str);
        GUI();
    }

    public static void main(String[] args) {
        new De1("Quan Ly ket qua ICPC");
    }
}
