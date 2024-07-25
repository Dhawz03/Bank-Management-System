package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    String formno;
    JButton next;
    JTextField textPan,textAadhar;
    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    Signup2(String first){
        super("Application Form");

        // First image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bankImage = new JLabel(i3);
        bankImage.setBounds(150, 5, 100, 100);
        add(bankImage);

        this.formno=first;

        JLabel l1=new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String[] religion={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox1=new JComboBox<>(religion);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,120,320,30);
        add(comboBox1);

        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,600,40);
        add(l4);

        String[] category={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox<>(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,600,40);
        add(l5);

        String[] income={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox<>(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,600,40);
        add(l6);

        String[] educational={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        comboBox4=new JComboBox<>(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,600,40);
        add(l7);

        String[] occupation={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5=new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,600,40);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9=new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,600,40);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        JLabel l10=new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,600,40);
        add(l10);

        radioButton1=new JRadioButton("Yes");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,18));
        radioButton1.setBackground(new Color(252,208,76));
        radioButton1.setBounds(350,490,100,30);
        add(radioButton1);

        radioButton2=new JRadioButton("No");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,18));
        radioButton2.setBackground(new Color(252,208,76));
        radioButton2.setBounds(460,490,100,30);
        add(radioButton2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);

        JLabel l11=new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,600,40);
        add(l11);

        radioButton3=new JRadioButton("Yes");
        radioButton3.setFont(new Font("Raleway",Font.BOLD,18));
        radioButton3.setBackground(new Color(252,208,76));
        radioButton3.setBounds(350,540,100,30);
        add(radioButton3);

        radioButton4=new JRadioButton("No");
        radioButton4.setFont(new Font("Raleway",Font.BOLD,18));
        radioButton4.setBackground(new Color(252,208,76));
        radioButton4.setBounds(460,540,100,30);
        add(radioButton4);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(radioButton3);
        buttonGroup2.add(radioButton4);

        JLabel l12=new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox1.getSelectedItem();
        String cate=(String)comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();
        String pan=textPan.getText();
        String aadhar=textAadhar.getText();
        String scitizen=null;
        if(radioButton1.isSelected()){
            scitizen="Yes";
        }
        else if (radioButton2.isSelected()){
            scitizen="No";
        }
        String existing=null;
        if(radioButton3.isSelected()){
            existing="Yes";
        }
        else if (radioButton4.isSelected()){
            existing="No";
        }
        try {
            if(textAadhar.getText().isEmpty() || textPan.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1=new Con();
                String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"', '"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+existing+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
