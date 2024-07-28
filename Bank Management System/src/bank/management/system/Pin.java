package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Pin extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    Pin(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1550,790);
        add(l1);

        JLabel l2=new JLabel("Change Your PIN");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,180,400,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        JLabel l3=new JLabel("New PIN: ");
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(430,220,400,35);
        l3.setForeground(Color.white);
        l1.add(l3);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(430,250,200,35);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(p1);

        JLabel l4=new JLabel("Re-Enter New PIN: ");
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(430,280,400,35);
        l4.setForeground(Color.white);
        l1.add(l4);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(430,310,200,35);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(p2);

        b1=new JButton("CHANGE");
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
        if(e.getSource()==b2){
            new main_Class(pin);
            setVisible(false);
        }else{
            try{
                char[] password = p1.getPassword();
                String pin1= new String(password);
                Arrays.fill(password, ' ');
                char[] password1 = p2.getPassword();
                String pin2= new String(password1);
                Arrays.fill(password1, ' ');
                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                if(pin1.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                Con c=new Con();
                String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
                String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
                String q3="update signupthree set pin='"+pin1+"' where pin='"+pin+"'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
                JOptionPane.showMessageDialog(null,"Please Login Again to Continue");
                new Login();
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
