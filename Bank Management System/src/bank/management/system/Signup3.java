package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    String formno;

    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    JButton submit,cancel;
    Signup3(String first){
        // First image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bankImage = new JLabel(i3);
        bankImage.setBounds(150, 5, 100, 100);
        add(bankImage);

        this.formno=first;

        JLabel l1=new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        radioButton1=new JRadioButton("Saving Account");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton1.setBackground(new Color(215,252,252));
        radioButton1.setBounds(100,180,150,30);
        add(radioButton1);

        radioButton2=new JRadioButton("Fixed Deposit Account");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton2.setBackground(new Color(215,252,252));
        radioButton2.setBounds(350,180,300,30);
        add(radioButton2);

        radioButton3=new JRadioButton("Current Account");
        radioButton3.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton3.setBackground(new Color(215,252,252));
        radioButton3.setBounds(100,220,250,30);
        add(radioButton3);

        radioButton4=new JRadioButton("Recurring Deposit Account");
        radioButton4.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton4.setBackground(new Color(215,252,252));
        radioButton4.setBounds(350,220,300,30);
        add(radioButton4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton1);

        JLabel l4=new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7=new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8=new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11=new JLabel("Service Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        checkBox1=new JCheckBox("ATM CARD");
        checkBox1.setBackground(new Color(215,252,252));
        checkBox1.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox1.setBounds(100,500,200,30);
        add(checkBox1);

        checkBox2=new JCheckBox("Internet Banking");
        checkBox2.setBackground(new Color(215,252,252));
        checkBox2.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox2.setBounds(350,500,200,30);
        add(checkBox2);

        checkBox3=new JCheckBox("Mobile Banking");
        checkBox3.setBackground(new Color(215,252,252));
        checkBox3.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox3.setBounds(100,550,200,30);
        add(checkBox3);

        checkBox4=new JCheckBox("EMAIL Alerts");
        checkBox4.setBackground(new Color(215,252,252));
        checkBox4.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox4.setBounds(350,550,200,30);
        add(checkBox4);

        checkBox5=new JCheckBox("Cheque Book");
        checkBox5.setBackground(new Color(215,252,252));
        checkBox5.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox5.setBounds(100,600,200,30);
        add(checkBox5);

        checkBox6=new JCheckBox("E-Statement");
        checkBox6.setBackground(new Color(215,252,252));
        checkBox6.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox6.setBounds(350,600,200,30);
        add(checkBox6);

        JCheckBox checkBox7=new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge");
        checkBox7.setBackground(new Color(215,252,252));
        checkBox7.setFont(new Font("Raleway",Font.BOLD,12));
        checkBox7.setBounds(100,700,600,20);
        add(checkBox7);

        JLabel l12 =new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(215,252,252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype="";
        if(radioButton1.isSelected()){
            atype="Saving Account";
        }else if(radioButton2.isSelected()){
            atype="Fixed Deposit";
        }else if(radioButton3.isSelected()){
            atype="Current Account";
        }else if(radioButton4.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random random=new Random();
        long first7=(random.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);

        long first3=(random.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(checkBox1.isSelected()){
            fac+="ATM CARD ";
        }if(checkBox2.isSelected()){
            fac+="Internet Banking ";
        }if(checkBox3.isSelected()){
            fac+="Mobile Banking ";
        }if(checkBox4.isSelected()){
            fac+="EMAIL Alerts ";
        }if(checkBox5.isSelected()){
            fac+="Cheque Book ";
        }if(checkBox6.isSelected()){
            fac+="E-Statement";
        }
        try {
            if(e.getSource()==submit){
                if(atype.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Con c1=new Con();
                    String q1="insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"', '"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardno+"\nPin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
