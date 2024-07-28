package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    Mini(String pin){
        this.pin=pin;

        JLabel l1=new JLabel();
        l1.setBounds(20,140,400,200);
        add(l1);

        JLabel l2=new JLabel("Dhawal Bansal");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3=new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);

        JLabel l4=new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try {
            Con c=new Con();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (resultSet.next()){
                l3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4)+"-XXXX-XXXX"+resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            Con c=new Con();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='" + pin + "'");
            int balance = 0;
            while (resultSet.next()) {
                l1.setText(l1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            l4.setText("Your Total Balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }
        b1=new JButton("EXIT");
        b1.setBounds(20,500,100,25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        add(b1);

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLayout(null);
        setLocation(20,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}
