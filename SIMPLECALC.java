import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SIMPLECALC implements ActionListener {

    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4, clear;
    JFrame f;

    SIMPLECALC() {

      
        f = new JFrame("Simple Calculator");
        f.setSize(380, 400);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(240, 248, 255)); // light blue background
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");
        l1.setBounds(40, 30, 150, 30);
        l2.setBounds(40, 90, 150, 30);
        l3.setBounds(40, 150, 150, 30);
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        l3.setFont(new Font("Arial", Font.BOLD, 14));

       
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf3.setEditable(false); // result cannot be edited
        tf1.setBounds(180, 30, 150, 30);
        tf2.setBounds(180, 90, 150, 30);
        tf3.setBounds(180, 150, 150, 30);

        Font tfFont = new Font("Arial", Font.PLAIN, 16);
        tf1.setFont(tfFont);
        tf2.setFont(tfFont);
        tf3.setFont(tfFont);

        // BUTTONS
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        clear = new JButton("C");

        b1.setBounds(40, 220, 60, 50);
        b2.setBounds(110, 220, 60, 50);
        b3.setBounds(180, 220, 60, 50);
        b4.setBounds(250, 220, 60, 50);
        clear.setBounds(320, 220, 40, 50);

        JButton[] buttons = {b1, b2, b3, b4, clear};
        for (JButton b : buttons) {
            b.setFont(new Font("Arial", Font.BOLD, 18));
            b.setBackground(new Color(220, 220, 220));
            b.setFocusPainted(false);
            b.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        }

       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        clear.addActionListener(this);

      
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(clear);

        f.setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            return;
        }

        try {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double r = 0;

            if (e.getSource() == b1) {
                r = a + b;
            } else if (e.getSource() == b2) {
                r = a - b;
            } else if (e.getSource() == b3) {
                r = a * b;
            } else if (e.getSource() == b4) {
                if (b == 0) {
                    tf3.setText("Cannot divide by zero");
                    return;
                }
                r = a / b;
            }

            tf3.setText(String.valueOf(r));

        } catch (NumberFormatException ex) {
            tf3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SIMPLECALC ();
    }
}
