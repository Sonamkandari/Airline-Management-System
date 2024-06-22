import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class FlightDetails extends JFrame {
    //creating constructor
    FlightDetails(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

//to show the data in the tabular form
        JTable table =new JTable();
//whenver this frame open we want it shows the details so we have to
        // just make a logic so that it  can show data from the database

     try{
         //calling data base here
         conn con=new conn();
         //now storing data in the result set
         ResultSet rs=conn.s.executeQuery("select * from flightdetails");
         table.setModel( DbUtils.resultSetToTableModel(rs));


     }catch(Exception e){
         e.printStackTrace();
     }
        //for scroll bar we use a class
        JScrollPane jsp=new JScrollPane(table);
     jsp.setBounds(0,0,800,500);
     add(jsp);



//setting the size & location of the  frame
        setSize(800,500);
        setLocation(400,200);
        setVisible(true);
    }


    public static  void main(String []args){


    // creating a anonimious object of the class
        new FlightDetails();
    }

}
