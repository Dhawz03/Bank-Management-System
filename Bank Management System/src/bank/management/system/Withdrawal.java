package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Withdrawal(String pin){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1550,790);
        add(l1);

        this.pin=pin;

        JLabel l2=new JLabel("MAXIMUM WITHDRAWAL IS Rs. 10,000");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(460,180,700,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        JLabel l3=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(460,220,400,35);
        l3.setForeground(Color.white);
        l1.add(l3);

        textField=new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(textField);

        b1=new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        l1.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();
                    String q = "select * from bank where pin='" + pin + "'";
                    ResultSet resultSet = c.statement.executeQuery(q);
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawn Successfully");
                    new main_Class(pin);
                    setVisible(false);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2) {
            new main_Class(pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
