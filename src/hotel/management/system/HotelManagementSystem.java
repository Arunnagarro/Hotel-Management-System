package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//awt phele se tha per jo phele se tha usme class to sari hoti h per package sare nhi hote isliye hume package import kra hai


public class HotelManagementSystem extends JFrame implements ActionListener
{
    HotelManagementSystem()
    {
        /*//Size of Frame
        setSize(400,400);
        //For visible condition of Frame
        setVisible(true);
        //for set the Location in the desktop 
        setLocation(300,300);*/
        
        setBounds(200,100,1004,565);//creating a fram
                
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1004,565);
        add(l1);
        
        JLabel l2=new JLabel("Hotel Management System");
        l2.setBounds(100, 350,1000, 90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN,70));
        l1.add(l2);
        
        
        //Create a button
        JButton b1=new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(850, 450, 70, 30);
        b1.addActionListener(this);
        l1.add(b1);
       
        setLayout(null);
        setVisible(true);
        
        //Infinite loop for Dipper Hotel Management System
        while(true)
        {
            l2.setVisible(false);
            try{
                Thread.sleep(500);
        }catch(Exception e){}
            l2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        new Login().setVisible(true);//ye login ko call krega 
        this.setVisible(false);//ye condition pichle frame ko band kar dega
    }
    public static void main(String[] args) 
    {
        new HotelManagementSystem();
    }
    
}
