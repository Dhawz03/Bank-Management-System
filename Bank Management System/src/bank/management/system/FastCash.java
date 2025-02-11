package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1550,790);
        add(l1);

        JLabel l2=new JLabel("Select Withdrawal Amount");
        l2.setFont(new Font("System",Font.BOLD,28));
        l2.setBounds(460,140,700,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        b1=new JButton("Rs. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(410,250,150,35);
        l1.add(b1);

        b2=new JButton("Rs. 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        b2.setBounds(700,250,150,35);
        l1.add(b2);

        b3=new JButton("Rs. 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        b3.setBounds(410,297,150,35);
        l1.add(b3);

        b4=new JButton("Rs. 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        b4.setBounds(700,297,150,35);
        l1.add(b4);

        b5=new JButton("Rs. 5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        b5.setBounds(410,344,150,35);
        l1.add(b5);

        b6=new JButton("Rs. 10000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        b6.setBounds(700,344,150,35);
        l1.add(b6);

        b7=new JButton("BACK");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        b7.setBounds(700,391,150,35);
        l1.add(b7);

        this.pin=pin;

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            new main_Class(pin);
            setVisible(false);
        }else{
            String amount=((JButton)e.getSource()).getText().substring(4);
            Con c=new Con();
            Date date=new Date();
            try {
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='" + pin + "'");
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
            }catch (Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
