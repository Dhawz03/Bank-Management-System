package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    Login(){
        super("Bank Management System");

        // First image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bankImage = new JLabel(i3);
        bankImage.setBounds(350, 10, 100, 100);
        add(bankImage);

        // Second image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel cardImage = new JLabel(ii3);
        cardImage.setBounds(630, 350, 100, 100);
        add(cardImage);

        label1=new JLabel("Welcome to ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("Card No.");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3=new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);

        // Background image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel backGround = new JLabel(iii3);
        backGround.setBounds(0,0, 850, 480);
        add(backGround);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true); // This should be at the end, else the images won't be visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==button1){

            } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource()==button3) {
                new Signup();
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}


