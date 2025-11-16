import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;       
public class SIMPLE_CALCULATOR implements ActionListener{  
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4, clear; 
    SIMPLE_CALCULATOR(){
    JFrame f = new JFrame("Simple Calculator | ACTIVITY 1 ");
    f.setSize(400,1000);
    Color c = new Color(200, 220, 255);
    f.getContentPane().setBackground(c.gray);
    JLabel t1 = new JLabel("Enter First Digit/s :");
    JLabel t2 = new JLabel("Enter Second Digit/s :");
    JLabel t3 = new JLabel("Result:");
    t1.setBounds(40, 10, 150, 30);
    t2.setBounds(40, 70, 150, 30);
    t3.setBounds(40, 130, 150, 30);
    tf1 = new JTextField(); 
    tf1.setBounds(50,50,150,20);
    tf2 = new JTextField();
    tf2.setBounds(50,100,150,20);
    tf3 = new JTextField();
    tf3.setBounds(50,150,150,20);
    tf3.setEditable(false);
    b1 = new JButton("+");
    b1.setBounds(50,200,50,50);
    b2 = new JButton("-");
    b2.setBounds(120,200,50,50);
    b3 = new JButton("*");
    b3.setBounds(190,200,50,50);
    b4 = new JButton("/");
    b4.setBounds(260,200,50,50);
    clear = new JButton("Clear");
    clear.setBounds(50,260,260,30);
    clear.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    f.add(t1);
    f.add(t2); 
    f.add(t3);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(clear);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == clear) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            return;
         }
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        double a = Integer.parseInt(s1);
        double b = Integer.parseInt(s2);   
        double r = 0;
        if(e.getSource() == b1){
            r = a + b;
        }
        else if(e.getSource() == b2){
            r = a - b;
        }
        else if(e.getSource() == b3){
            r = a * b;
        }
        else if(e.getSource() == b4){
            if (b == 0) {
                tf3.setText("SYNTAX ERROR!!!");
                return;
            }
            r = a / b;
        }
        String result = String.valueOf(r);
        tf3.setText(result);
    }
    public static void main(String[] args) {
        new SIMPLE_CALCULATOR();
    }



}
