
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for creating a frame we have to extends the JFrame
//implimenting action listener
public class practice extends JFrame implements ActionListener {
    //After creating theobject of the class now we will call the constructor of the class
//declare all the text fields globally
    JTextField  nameTextField,nationalityTextField,AadharTextField,addressTextField, PhoneTextField,emailTextField;
    public void practice(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
//with the help of JLabel we can write anything on the frame
        JLabel fn=new JLabel("First name");
       fn.setBounds(20,20,200,20);
        add(fn);
       fn.setFont(new Font("Tahoma",Font.BOLD,32));
        new JTextField();
        nameTextField.setBounds(200,20,200,20);
        add(nameTextField);

        JLabel name=new JLabel("Name");
        name.setBounds(20,100,200,20);
        add(name);
        name.setFont(new Font("Tahoma",Font.PLAIN,15));


        new JTextField();
        nameTextField.setBounds(200,100,200,20);
        add(nameTextField);

        //Jlabel for customer nationality
        JLabel nationality=new JLabel("Nationality");
        nationality.setBounds(20,140,100,20);
        add(nationality);
        nationality.setFont(new Font("Tahoma",Font.PLAIN,15));

        // Adding Text Field
        JTextField nationalityTextField =new JTextField();
        nationalityTextField.setBounds(200,140,200,20);
        add(nationalityTextField);

        //JLabel for Customer Adhar no
        JLabel adharnumber=new JLabel("Aadhar Number");
        adharnumber.setBounds(20,180,200,20);
        add(adharnumber);
        adharnumber.setFont(new Font("Tahoma",Font.PLAIN,15));
        // Adding  Text Field
        new JTextField();
        AadharTextField.setBounds(200,180,200,20);
        add(AadharTextField);

        //Jlabel for address

        JLabel address=new JLabel("Customer Address");
        address.setBounds(20,220,200,20);
        add(address);
        address.setFont(new Font("Tahoma",Font.PLAIN,15));

        // Adding  Text Field
        new JTextField();
        addressTextField.setBounds(200,220,200,20);
        add(addressTextField);

        //JLabel for Gender


        //note we are using here a class called button group class so that we canot select both the button at the same time
        //if we try then it help to diselect the another one automatically

        ButtonGroup gendergroup=new ButtonGroup();
        JLabel Gender=new JLabel("Gender");
        Gender.setBounds(20,260,200,20);
        add(Gender);
        Gender.setFont(new Font("Tahoma",Font.PLAIN,15));
        //Adding Radio Buttons
        JRadioButton Male =new JRadioButton("Male");
        Male.setBounds(200,260,80,20);
        Male.setBackground(Color.white);
        add(Male);
        gendergroup.  add(Male);

        //second radio button
        JRadioButton female =new JRadioButton("Female");
        female.setBounds(320,260,80,20);
        add(female);
        female.setBackground(Color.white);
        gendergroup.add(female);


        //Jlabel for Phone
        JLabel Phone=new JLabel("Phone Number");
        Phone.setBounds(20,300,200,20);
        add(Phone);
        Phone.setFont(new Font("Tahoma",Font.PLAIN,15));
        // Adding  Text Field
        new JTextField();
        PhoneTextField.setBounds(200,300,200,20);
        add(PhoneTextField);


        //Jlabel for Phone
        JLabel email=new JLabel("Email Address");
        email.setBounds(20,340,200,20);
        add(email);
        email.setFont(new Font("Tahoma",Font.PLAIN,15));
        // Adding  Text Field
        new JTextField();
        emailTextField.setBounds(200,340,200,20);
        add(emailTextField);

        //now creating a save button for saving the information
        JButton savebtn=new JButton("Save");
        savebtn.setBounds(225,380,140,30);
        savebtn.setForeground(Color.white);
        savebtn.setBackground(Color.BLACK);
        add(savebtn);
        savebtn.addActionListener(this);//this is the current class object



        setSize(900,600);
        setLocation(300,150);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        try {

        }catch(Exception e){
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        //create an object of the class
        new CustomerDetails();

    }
}


