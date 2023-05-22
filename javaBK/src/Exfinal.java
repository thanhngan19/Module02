import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exfinal extends JFrame implements ActionListener{
    JLabel lb1, lb2, lb3;
    JTextField txt1, txt2;
    JButton bt1, bt2;
    JPanel pn, pn1, pn2, pn3, pn4, pn5, pn6, pn11;
    JComboBox comboBox;
    public void GUI() {
        this.setTitle(" ");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("Nhập số tự nhiên n ");
        lb2 = new JLabel("Tách theo chiều ");
        lb3 = new JLabel("Kết quả tách được ");

        txt1 = new JTextField(20);
        txt2 = new JTextField(20);

        bt1 = new JButton("Xoá");
        bt2 = new JButton("Tách số");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        pn = new JPanel(new BorderLayout());
        pn1 = new JPanel(new FlowLayout());
        pn2 = new JPanel(new FlowLayout());
        pn3 = new JPanel(new FlowLayout());
        comboBox= new JComboBox<>();
        comboBox.addItem("từ phải sang trái");
        comboBox.addItem("từ trái sang phải");
        pn1.add(lb1);pn1.add(txt1); pn1.add(bt1);
        pn2.add(lb2); pn2.add(bt2);pn2.add(comboBox);
        pn3.add(lb3);pn3.add(txt2);
        pn11= new JPanel(new GridLayout(3,1));
        pn11.add(pn1);pn11.add(pn2);pn11.add(pn3);
        pn.add(pn11);
        add(pn);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== bt2) {
            txt1.setText("");
            txt2.setText("");
        }
        if(e.getSource()== bt1) {
            if(!txt1.getText().isEmpty()) {
//					 if(comboBox.getText()==)
//				 }
            }
        }
    }
}
