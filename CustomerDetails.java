import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Extend JFrame and implement ActionListener
public class CustomerDetails extends JFrame implements ActionListener {

    // Declare text fields globally
    JTextField nameTextField, nationalityTextField, AadharTextField, addressTextField, PhoneTextField, emailTextField;
    JRadioButton female,Male;
    // Constructor for the class
    public CustomerDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading
        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(250, 20, 500, 55);
        add(heading);
        heading.setFont(new Font("Tahoma", Font.BOLD, 32));

        // Customer name
        JLabel name = new JLabel("Name");
        name.setBounds(20, 100, 200, 20);
        add(name);
        name.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field in front of the name
        nameTextField = new JTextField();
        nameTextField.setBounds(200, 100, 200, 20);
        add(nameTextField);

        // Customer nationality
        JLabel nationality = new JLabel("Nationality");
        nationality.setBounds(20, 140, 100, 20);
        add(nationality);
        nationality.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        nationalityTextField = new JTextField();
        nationalityTextField.setBounds(200, 140, 200, 20);
        add(nationalityTextField);

        // Customer Aadhar number
        JLabel adharnumber = new JLabel("Aadhar Number");
        adharnumber.setBounds(20, 180, 200, 20);
        add(adharnumber);
        adharnumber.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        AadharTextField = new JTextField();
        AadharTextField.setBounds(200, 180, 200, 20);
        add(AadharTextField);

        // Customer address
        JLabel address = new JLabel("Customer Address");
        address.setBounds(20, 220, 200, 20);
        add(address);
        address.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        addressTextField = new JTextField();
        addressTextField.setBounds(200, 220, 200, 20);
        add(addressTextField);

        // Customer gender
        JLabel Gender = new JLabel("Gender");
        Gender.setBounds(20, 260, 200, 20);
        add(Gender);
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Button group for gender
        ButtonGroup gendergroup = new ButtonGroup();
        Male = new JRadioButton("Male");
        Male.setBounds(200, 260, 80, 20);
        Male.setBackground(Color.WHITE);
        add(Male);
        gendergroup.add(Male);

         female = new JRadioButton("Female");
        female.setBounds(320, 260, 80, 20);
        female.setBackground(Color.WHITE);
        add(female);
        gendergroup.add(female);

        // Customer phone number
        JLabel Phone = new JLabel("Phone Number");
        Phone.setBounds(20, 300, 200, 20);
        add(Phone);
        Phone.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        PhoneTextField = new JTextField();
        PhoneTextField.setBounds(200, 300, 200, 20);
        add(PhoneTextField);

        // Customer email address
        JLabel email = new JLabel("Email Address");
        email.setBounds(20, 340, 200, 20);
        add(email);
        email.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        emailTextField = new JTextField();
        emailTextField.setBounds(200, 340, 200, 20);
        add(emailTextField);

        // Save button
        JButton savebtn = new JButton("Save");
        savebtn.setBounds(225, 380, 140, 30);
        savebtn.setForeground(Color.WHITE);
        savebtn.setBackground(Color.BLACK);
        add(savebtn);
        savebtn.addActionListener(this);

        // Frame properties
        setSize(900, 600);
        setLocation(300, 150);
        setVisible(true);
    }

    // Action performed method
    public void actionPerformed(ActionEvent ae) {
        String Name= nameTextField.getText();
        String nationality =nationalityTextField.getText();
        String Phone=PhoneTextField.getText();
        String email=emailTextField.getText();
        String address=addressTextField.getText();
        String Aadhar=AadharTextField.getText();
        String Gender=null;
        if(female.isSelected()){
            Gender="Female";
        }else {
            Gender="Male";

        }
        try {
            conn conn =new conn();
            //it is an dml command in which we are inserting data in our database
            String Query="insert into passenger values('"+Name+"', '"+nationality+"','"+Phone+"','"+email+"','"+address+"' ,'" +Aadhar+ "','"+Gender+"' )";
            conn.s.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Details are added successfully in the database");
            setVisible(false);
            // Handle button click
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method to create an object of the class
    public static void main(String[] args) {
        new CustomerDetails();
    }
}
