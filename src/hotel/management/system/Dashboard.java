package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366, 700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1366, 700); 
        add(NewLabel);
        
        
        
        JLabel AirlineManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(300, 60, 900, 40);
	NewLabel.add(AirlineManagementSystem);
        
      
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	AirlineSystem.add(FlightDetails);
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRooms().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception().setVisible(true);
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
	 setBounds(0,0,1366,768);	
       // setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
                                       
     
    }
}







/*package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame //implements ActionListener
{
      public static void main(String[] args)
   {
       new Dashboard().setVisible(true);
   }
    //JMenuBar mb;
    //JMenu m1,m2;
    //JMenuItem i1,i2,i3,i4;
        
    Dashboard(){
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu m1=new JMenu("HOTEL MANAGEMENT SYSTEM");
        m1.setForeground(Color.RED);
        mb.add(m1);
        
        JMenu m2=new JMenu("ADMIN");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        
        JMenu i1=new JMenu("RECEPTION");
        //i1.addActionListener(this);
        m1.add(i1);
        
        
        JMenu i2=new JMenu("ADD EMPLOYEE");
        //i2.addActionListener(this);
        m2.add(i2);
         i2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
         JMenu i3=new JMenu("ADD ROOM");
       // i3.addActionListener(this);
        m2.add(i3);
       i3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRooms().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
         JMenu i4=new JMenu("ADD DRIVERS");
        //i4.addActionListener(this);
        m2.add(i4);
         i4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        mb.setBounds(0,0,1366,30);
                                         
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i6=i5.getImage().getScaledInstance(1366,700,Image.SCALE_DEFAULT);
        ImageIcon i7=new ImageIcon(i6);
        JLabel l1=new JLabel(i7);
        l1.setBounds(0,0,1366,700);
        add(l1);
        
        JLabel l2=new JLabel("THE TAJ GROUP WELCOME YOU");
        l2.setBounds(300,60,900,40);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma",Font.PLAIN,46));
        l1.add(l2);
        
                                      
        setBounds(0,0,1366,768);
        setLayout(null);  
        setVisible(true);
    }
} */  

