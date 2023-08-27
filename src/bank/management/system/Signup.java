package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.sql.rowset.FilteredRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.StringTokenizer;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;

    JButton next;

    JTextField textName, textFName, textEmail, textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;

Random ran = new Random();
long first4 = (ran.nextLong()% 9000L) + 1000L;
String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel labble1 = new JLabel("APPLICATION FORM NO."+ first);
        labble1.setBounds(130,20,600,40);
        labble1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(labble1);

        JLabel lable2 = new JLabel("Page 1");
        lable2.setFont(new Font("Raleway", Font.BOLD,22 ));
        lable2.setBounds(330, 70, 600, 30);
        add(lable2);

        JLabel lable3 = new JLabel("Personal Details");
        lable3.setFont(new Font("Raleway", Font.BOLD, 22));
        lable3.setBounds(290, 90, 600, 30);
        add(lable3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,150,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 190, 200, 30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300,190,400,30);
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 230, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 230, 400, 30);
        add(dateChooser);

        JLabel lableG = new JLabel("Gender :");
        lableG.setFont(new Font("Raleway", Font.BOLD, 20));
        lableG.setBounds(100,270,200,30);
        add(lableG);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground( new Color(222, 255, 228));
        r1.setBounds(300,270,60,30);
        add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground( new Color(222, 255, 228));
        r2.setBounds(450,270,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,310,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300,310,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100,350,200,30);
        add(labelMs);

       m1 = new JRadioButton("Married");
       m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground( new Color(222, 255, 228));
       m1.setBounds(300,350,100,30);
       add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground( new Color(222, 255, 228));
        m2.setBounds(450,350,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBackground( new Color(222, 255, 228));
        m3.setBounds(635,350,100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,390,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300,390,400,30);
        add(textAdd);


        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100,430,200,30);
        add(labelCity );

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300,430,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100,490,200,30);
        add(labelPin );

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300,490,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100,540,200,30);
        add(labelState );

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300,540,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,590,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222, 255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360, 40);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
String formno = first;
String name = textName.getText();
String fname = textFName.getText();
String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
String gender = null;
if(r1.isSelected()){
    gender = "Male";
}else if(r1.isSelected()) {
    gender = "Female";
}
String email = textEmail.getText();
String marital = null;
if(m1.isSelected()){
    marital = "Married";
} else if (m2.isSelected()) {
    marital = "Unmarried";

} else if (m3.isSelected()) {
    marital= "Other";
}
String address = textAdd.getText();
String city = textCity.getText();
String pincode = textPin.getText();
String state = textState.getText();

try {
    if(textName.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Fill all the fields");

    }
    else{
        Con con1 = new Con();
        String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"' )";
        con1.statement.executeUpdate(q);
        new Signup2(formno);
        setVisible(false);
    }
} catch (Exception E){
    E.printStackTrace();
}
    }
    public static void main(String[] args) {

        new Signup();
    }


}
