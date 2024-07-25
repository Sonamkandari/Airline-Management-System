import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;//importing swing package
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
//using inheritence here to extend the JFrame 
//Also implementing Actionlistener because it is an interface
public class Login extends JFrame implements ActionListener {
   /*Declaring some variables Globally */   
   JButton reset,Submit,close;
   JTextField userField;
   JPasswordField  passwordField;
    //here we are making a default constructor of the class 
    public Login(){ 
    //now with the help of labels we can write anything on the frmaes
    JLabel lbusername=new JLabel("User name");
    //now we have set this label on the frame
    setLayout(null);//here we are doing by default layouts null
    //now we have to create our own layouts 
    lbusername.setBounds(25,30,100,20);
    //using add function to make it vissible
    add(lbusername);
    //we are using textfields for contianing username
    userField=new JTextField();
    userField.setBounds(130,30,200,20);
    add(userField);

    //applying same steps for another label
    JLabel password=new JLabel("Password");
    password.setBounds(25,60,100,20);
    add(password);
    //creating a passwordfield for containing the user password
    passwordField=new JPasswordField();
    passwordField.setBounds(130,60,200,20);
    add(passwordField);
    
    //now we are creating Buttons
    reset=new JButton("Reset");
    reset.setBounds(40,120,100,30);
    add(reset);
    reset.setBackground(Color.black);
    reset.setForeground(Color.white);
    reset.addActionListener(this);
    
    //Creating Submit Button
    Submit=new JButton("Submit");
    Submit.setBounds(230,120,100,30);
    add(Submit);
    Submit.setBackground(Color.black);
    Submit.setForeground(Color.white);
    Submit.addActionListener(this);

    //Creating close Button
    close=new JButton("Close");
    close.setBounds(140,180,100,30);
    add(close);
    close.setBackground(Color.black);
    close.setForeground(Color.white);
    close.addActionListener(this);
 //we an also set the size of the frame   
    setSize(400,350);
    //we notice that by default a frame is always open from the top left
    //we can change its location
    setLocation(600,400);
    setVisible(true);
    //now get access to the whole frame
    getContentPane().setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        //making the object of the class
        new  Login();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == Submit){
            String username=userField.getText();
            String password=passwordField.getText();
          //for opening the connection with data base we will use try and catch block
          try{
            conn c=new conn();
            // it is an DDl command because we are selecting data data from the table of the data base which we created in our Database
            String query="select * from login where username ='"+username+"' and password ='"+password+"'";

            //here we use exicute  querry because it is an DDl command

            ResultSet rs= c.s.executeQuery(query);
            //in case of valid user name and password
            if(rs.next()){
                //System.out.println("valid");
                //in place of this print statement we will atste the home class obeject here beacause we made a complete frame of it
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"invalid username or password");
                setVisible(false);
            }

          }catch (Exception e){
            e.printStackTrace();

          }

        }else if(ae.getSource() == reset){
           userField.setText("");  //setting the field empty
           passwordField.setText("");// setting the field empty

        }else if(ae.getSource() == close){
            setVisible(false);//it will close the frame    
    }
}
}
