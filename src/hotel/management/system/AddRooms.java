package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener 
{
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    AddRooms()
    {
        JLabel l1=new JLabel("ADD ROOMS");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setBounds(130,20,150,30);
        add(l1);
        
        JLabel l2=new JLabel("Room Number");
        l2.setFont(new Font("Tahoma",Font.PLAIN,17));
        l2.setBounds(60,90,150,30);
        add(l2);
        t1=new JTextField();
        t1.setBounds(200,90,150,30);
        add(t1);
        
               
        JLabel l3=new JLabel("Available");
        l3.setFont(new Font("Tahoma",Font.PLAIN,17));
        l3.setBounds(60,130,150,30);
        add(l3);
        c1=new JComboBox(new String[] {"Available","Occupied"});
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,130,150,30);
        add(c1);
        
        JLabel l4=new JLabel("Cleaning Status");
        l4.setFont(new Font("Tahoma",Font.PLAIN,17));
        l4.setBounds(60,170,150,30);
        add(l4);
        c2=new JComboBox(new String[] {"Cleaned","Dirty"});
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,170,150,30);
        add(c2);
        
        JLabel l5=new JLabel("Price");
        l5.setFont(new Font("Tahoma",Font.PLAIN,17));
        l5.setBounds(60,210,150,30);
        add(l5);
        t2=new JTextField();
        t2.setBounds(200,210,150,30);
        add(t2);
        
        JLabel l6=new JLabel("Bed Type");
        l6.setFont(new Font("Tahoma",Font.PLAIN,17));
        l6.setBounds(60,250,150,30);
        add(l6);
        c3=new JComboBox(new String[] {"Single Bed","Double Bed"});
        c3.setBackground(Color.WHITE);
        c3.setBounds(200,250,150,30);
        add(c3);
        
        b1=new JButton("ADD ROOMS");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40,310,150,30);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("CANCLE");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,310,150,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth.jpg"));
        //Image i2=i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        //ImageIcon i3=new ImageIcon(i2);
        JLabel l8=new JLabel(i1);
        l8.setBounds(400,10,500,400);
        add(l8);
        
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(200,150,950,460);
        setLayout(null);
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String room=t1.getText();
            String  available=(String)c1.getSelectedItem();
            String status=(String)c2.getSelectedItem();
            String price=t2.getText();
            String type=(String)c3.getSelectedItem();
            
            conn c=new conn();
           try{
                 String str="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                 c.s.executeUpdate(str);
                 
                 JOptionPane.showMessageDialog(null,"New Room Added");
                 this.setVisible(false);
           }
           catch(Exception e)
           {
                System.out.println(e);
           }
        }
        else if(ae.getSource()==b2)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new AddRooms().setVisible(true);
    }
}
