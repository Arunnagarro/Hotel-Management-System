package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener 
{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    JComboBox c1;//ye swing package k ander hota h isliye iske aage J lgate hai
    Choice c2;//choice or combobox same work karte h but choice awt package k ander hota h isliye iske aage J nhi lgate
    JRadioButton r1,r2;
    AddCustomer()
    {
        JLabel l1=new JLabel("New Customer From");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100,20,200,30);
        add(l1);
        
        JLabel l2=new JLabel("ID");
        l2.setBounds(35,80,100,20);
        add(l2); 
        String st[]={"Passport","Aadhar Card","Driving License","Voter Id Card"};
        c1 = new JComboBox(st);
        c1.setBounds(200,80,120,25);
        add(c1);
        
        JLabel l3=new JLabel("Number");
        l3.setBounds(35,120,100,20);
        add(l3);
        t1=new JTextField();
        t1.setBounds(200,120,120,25);
        add(t1);
        
        
        JLabel l4=new JLabel("Name");
        l4.setBounds(35,160,100,20);
        add(l4);
        t2=new JTextField();
        t2.setBounds(200,160,120,25);
        add(t2);
        
        JLabel l5=new JLabel("Gender");
        l5.setBounds(35,200,100,20);
        add(l5);
        r1=new JRadioButton("Male");
        r1.setBounds(200,200,60,25);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(270,200,80,25);
        add(r2);
        
        JLabel l6=new JLabel("Country");
        l6.setBounds(35,240,100,20);
        add(l6);
        t3=new JTextField();
        t3.setBounds(200,240,120,25);
        add(t3);
        
        
        
        JLabel l7=new JLabel("Allocated Room Number");
        l7.setBounds(35,280,150,20);
        add(l7);
        c2=new Choice();//sida Data base say data utha rhe h
        try{
            conn c=new conn();
            String str="select * from room";
            ResultSet rs=c.s.executeQuery(str);
            while(rs.next()){
                c2.add(rs.getString("room_number"));
             }
            }catch(Exception e){}
        c2.setBounds(200,280,120,20);
        add(c2);
        
        
        
        
        JLabel l8=new JLabel("Check In");
        l8.setBounds(35,320,100,20);
        add(l8);
        t4=new JTextField();
        t4.setBounds(200,320,120,25);
        add(t4);
        
         JLabel l9=new JLabel("Deposit");
        l9.setBounds(35,360,100,20);
        add(l9);
        t5=new JTextField();
        t5.setBounds(200,360,120,25);
        add(t5);
        
        b1=new JButton("Add Customer");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(35,410,120,25);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(190,410,120,25);
        b2.addActionListener(this);
        add(b2);
        
        setLayout(null);
        setBounds(300,150,900,500);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String id=(String) c1.getSelectedItem();
            String number=t1.getText();
            String name=t2.getText();
            String gender=null;
            if(r1.isSelected()){
                gender="Male";
            }
            else if(r2.isSelected()){
                gender="Female";
            }
            String country=t3.getText();
            String room=c2.getSelectedItem();
            String status=t4.getText();
            String deposit=t5.getText();
        
            String str="insert into customer value('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";
            String str2="update room set available = 'Occupied' where room ='"+room+"'";
            try{
                conn c=new conn();
               // c.s.executeUpdate(str2);
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null,"New Coustomer Added");
                new Reception().setVisible(true);
                this.setVisible(false);
            }catch(Exception e){}
        }
        else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new AddCustomer().setVisible(true);
    }
}
