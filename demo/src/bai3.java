import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner; // Import the Scanner class to read text files



public class bai3 extends JFrame implements ActionListener{
    JLabel lb1, lb2,lb3;
    JTextField txt1, txt2;
    JButton bt1, bt2,bt3, bt4;
    JPanel pn, pn1, pn2, pn3, pn22, pn11, pn4 ,pn33;
    JTextArea area1;


    public void GUI() {
        this.setTitle("Quan Ly Ket Qua ICPC");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("Import Data ");
        lb2 = new JLabel("KeyWord");
        lb3 = new JLabel("              ");

        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        area1 =new JTextArea(30,30);


        bt4 = new JButton("Won Teams");
        bt1 = new JButton("Import File");
        bt2 = new JButton("Ranking");
        bt3 = new JButton("Sreach");

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt1.setBounds(240,190,200,30);
        bt2.setBounds(240,240,200,30);

//		    model = new DefaultTableModel(column, 0);
//			table = new JTable(model);
//			table.setBounds(30, 40, 480, 300);

//		    JScrollPane areaScrollPane = new JScrollPane(area1);
        pn = new JPanel(new BorderLayout());
        pn1 = new JPanel(new FlowLayout());
        pn2 = new JPanel(new FlowLayout());
        pn3 = new JPanel(new FlowLayout());
        pn11= new JPanel(new GridLayout(2,2));
        pn22= new JPanel(new GridLayout(3,2));
        pn33 = new JPanel(new FlowLayout());

        pn1.add(lb1); pn1.add(txt1); pn1.add(bt1);
        pn2.add(lb2); pn2.add(txt2);pn2.add(lb3);
        pn3.add(bt2); pn3.add(bt3); pn3.add(bt4);

        pn11.add(pn1); pn11.add(pn2);
        pn22.add(pn11);pn22.add(pn3);
        pn.add(pn22,BorderLayout.NORTH);
        pn.add(area1,BorderLayout.CENTER);

        add(pn);
        this.setVisible(true);
    }
    public  void connection () {
        String filePath = txt1.getText();
        String fileContents = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath)); // create a BufferedReader for reading the file
            String line;
            while ((line = reader.readLine()) != null) { /
                fileContents += line + "\n";
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        area1.setText(fileContents);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== bt1) {
            if(txt1.getText()!= " ") {
                String input = txt1.getText();
            connection();


//            }
        }
    }

    public static void main(String[] args) {
        bai3 show=  new bai3();
        show.GUI();
    }

}

