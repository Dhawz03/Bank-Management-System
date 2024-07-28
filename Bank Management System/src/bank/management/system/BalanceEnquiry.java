package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel l3;
    JButton b1;
    BalanceEnquiry(String pin){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1550,790);
        add(l1);

        this.pin=pin;

        JLabel l2=new JLabel("Your Current Balance is Rs.");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,180,700,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        b1=new JButton("Back");
        b1.setBounds(700,406,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l1.add(b1);

        l3=new JLabel();
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(430,220,400,35);
        l3.setForeground(Color.white);
        l1.add(l3);

        int balance=0;
        try{
            Con c=new Con();
            String q="select * from bank where pin='"+pin+"'";
            ResultSet resultSet=c.statement.executeQuery(q);
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        l3.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new main_Class(pin);
        setVisible(false);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
