package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
    AddDriver()
    {
        JLabel l1=new JLabel("ADD DRIVERS");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setBounds(130,20,150,30);
        add(l1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.PLAIN,17));
        l2.setBounds(60,70,150,30);
        add(l2);
        t1=new JTextField();
        t1.setBounds(200,70,150,30);
        add(t1);
        
        JLabel l3=new JLabel("Age");
        l3.setFont(new Font("Tahoma",Font.PLAIN,17));
        l3.setBounds(60,110,150,30);
        add(l3);
        t2=new JTextField();
        t2.setBounds(200,110,150,30);
        add(t2);
        
        JLabel l4=new JLabel("Gender");
        l4.setFont(new Font("Tahoma",Font.PLAIN,17));
        l4.setBounds(60,150,150,30);
        add(l4);
        c1=new JComboBox(new String[] {"Male","Female"});
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,150,150,30);
        add(c1);
        
        JLabel l5=new JLabel("Car Company");
        l5.setFont(new Font("Tahoma",Font.PLAIN,17));
        l5.setBounds(60,190,150,30);
        add(l5);
        t3=new JTextField();
        t3.setBounds(200,190,150,30);
        add(t3);
        
        JLabel l6=new JLabel("Car Modal");
        l6.setFont(new Font("Tahoma",Font.PLAIN,17));
        l6.setBounds(60,230,150,30);
        add(l6);
        t4=new JTextField();
        t4.setBounds(200,230,150,30);
        add(t4);
        
        JLabel l7=new JLabel("Available");
        l7.setFont(new Font("Tahoma",Font.PLAIN,17));
        l7.setBounds(60,270,150,30);
        add(l7);
        c2=new JComboBox(new String[] {"Available","Not Available"});
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,270,150,30);
        add(c2);
        
        JLabel l8=new JLabel("Location");
        l8.setFont(new Font("Tahoma",Font.PLAIN,17));
        l8.setBounds(60,310,150,30);
        add(l8);
        t5=new JTextField();
        t5.setBounds(200,310,150,30);
        add(t5);
        
        b1=new JButton("ADD Drivers");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40,360,150,30);
         b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("CANCLE");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,360,150,30);
         b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/sixth.jpg"));
        //Image i2=i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        //ImageIcon i3=new ImageIcon(i2);
        JLabel l9=new JLabel(i1);
        l9.setBounds(400,10,500,400);
        add(l9);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(200,150,950,460);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String name=t1.getText();
            String age=t2.getText();
            String gender=(String) c1.getSelectedItem();
            String company=t3.getText();
            String brand=t4.getText();
            String available=(String)c2.getSelectedItem();
            String location=t5.getText();
            
            conn c=new conn();
            
            String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
            
            try{
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Driver Successfully Added");
            setVisible(false);
            }catch(Exception e){System.out.println(e);}
        }
        else if(ae.getSource()==b2)
        {
            setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        new AddDriver().setVisible(true);
    }
}