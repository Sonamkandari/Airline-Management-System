import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Random;

public class bookflights extends JFrame implements ActionListener {

    // Declare components globally
    JTextField nameTextField, nationalityTextField, AadharTextField, addressTextField, PhoneTextField;
    JLabel heading, name, adharnumber, nationality, Gender, fname, fcode, address, labelfname, labelfcode, labelgender, Phone, sourceLabel, destinationLabel;
    Choice lsource, ldestination;
    JRadioButton female, male;
    JButton fetchButton, fetch, BookFlight;
    JCalendar dcale;

    // Constructor for the class
    public bookflights() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading
        heading = new JLabel("Book Your flights");
        heading.setBounds(260, 20, 500, 45);
        add(heading);
        heading.setFont(new Font("Tahoma", Font.BOLD, 32));

        // Customer Aadhar number
        adharnumber = new JLabel("Aadhar Number");
        adharnumber.setBounds(20, 100, 200, 25);
        add(adharnumber);
        adharnumber.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        AadharTextField = new JTextField();
        AadharTextField.setBounds(200, 100, 200, 25);
        add(AadharTextField);

        // Adding fetch button
        fetchButton = new JButton("Fetch");
        fetchButton.setBackground(Color.BLACK);
        fetchButton.setForeground(Color.WHITE);
        fetchButton.setBounds(400, 100, 125, 25);
        fetchButton.addActionListener(this); // Add action listener
        add(fetchButton);

        // Customer name
        name = new JLabel("Name");
        name.setBounds(20, 140, 200, 25);
        add(name);
        name.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        nameTextField = new JTextField();
        nameTextField.setBounds(200, 140, 200, 25);
        add(nameTextField);

        // Customer nationality
        nationality = new JLabel("Nationality");
        nationality.setBounds(20, 180, 100, 20);
        add(nationality);
        nationality.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        nationalityTextField = new JTextField();
        nationalityTextField.setBounds(200, 180, 200, 25);
        add(nationalityTextField);

        // Customer address
        address = new JLabel("Customer Address");
        address.setBounds(20, 220, 200, 20);
        add(address);
        address.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        addressTextField = new JTextField();
        addressTextField.setBounds(200, 220, 200, 25);
        add(addressTextField);

        // Customer gender
        Gender = new JLabel("Gender");
        Gender.setBounds(20, 260, 200, 20);
        add(Gender);
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 15));

        labelgender = new JLabel();
        labelgender.setBounds(200, 260, 200, 25);
        add(labelgender);

        // Customer phone number
        Phone = new JLabel("Phone Number");
        Phone.setBounds(20, 300, 200, 20);
        add(Phone);
        Phone.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding Text Field
        PhoneTextField = new JTextField();
        PhoneTextField.setBounds(200, 300, 200, 25);
        add(PhoneTextField);

        // Customer source address
        sourceLabel = new JLabel("Source");
        sourceLabel.setBounds(20, 340, 180, 25);
        add(sourceLabel);
        sourceLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        lsource = new Choice();
        lsource.setBounds(200, 340, 200, 25);
        add(lsource);

        // Destination
        destinationLabel = new JLabel("Destination");
        destinationLabel.setBounds(20, 380, 180, 25);
        add(destinationLabel);
        destinationLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        ldestination = new Choice();
        ldestination.setBounds(200, 380, 200, 25);
        add(ldestination);

        try {
            conn c = new conn();
            String query = "select * from flightdetails";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                lsource.add(rs.getString("source"));
                ldestination.add(rs.getString("destination"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Fetch button for flight details
        fetch = new JButton("Fetch Flight");
        fetch.setBackground(Color.BLACK);
        fetch.setForeground(Color.WHITE);
        fetch.setBounds(400, 380, 200, 25);
        fetch.addActionListener(this); // Add action listener
        add(fetch);

        fname = new JLabel("Flight Name");
        fname.setBounds(20, 420, 200, 25);
        add(fname);
        fname.setFont(new Font("Tahoma", Font.PLAIN, 15));

        labelfname = new JLabel();
        labelfname.setBounds(200, 420, 200, 25);
        add(labelfname);

        fcode = new JLabel("Flight Code");
        fcode.setBounds(20, 460, 200, 25);
        add(fcode);
        fcode.setFont(new Font("Tahoma", Font.PLAIN, 15));

        labelfcode = new JLabel();
        labelfcode.setBounds(200, 460, 200, 25);
        add(labelfcode);

        // Date of travel
        JLabel DOTravel = new JLabel("Date of Travel");
        DOTravel.setBounds(20, 500, 150, 25);
        add(DOTravel);
        DOTravel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        // Adding a calendar
        dcale = new JCalendar();
        dcale.setBounds(200, 500, 200, 200); // Adjust bounds to fit the calendar properly
        add(dcale);

        // Book Flight button
        BookFlight = new JButton("Book Flight");
        BookFlight.setBackground(Color.BLACK);
        BookFlight.setForeground(Color.WHITE);
        BookFlight.setBounds(200, 720, 200, 25);
        BookFlight.addActionListener(this); // Add action listener
        add(BookFlight);

        // Frame properties
        setSize(1000, 800);
        setLocation(200, 50);
        setVisible(true);
    }

    // Action performed method
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == fetchButton) {
            // Fetch button action
            String aadhar = AadharTextField.getText();
            try {
                conn con = new conn();
                String query = "SELECT * FROM passenger where Aadhar='" + aadhar + "'";
                ResultSet rs = con.s.executeQuery(query);
                if (rs.next()) {
                    nameTextField.setText(rs.getString("name"));
                    nationalityTextField.setText(rs.getString("nationality"));
                    addressTextField.setText(rs.getString("address"));
                    labelgender.setText(rs.getString("Gender"));
                    PhoneTextField.setText(rs.getString("Phone"));
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter correct Aadhar card number");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == fetch) {
            // Fetch flight details action
            String src = lsource.getSelectedItem();
            String dest = ldestination.getSelectedItem();
            try {
                conn c = new conn();
                String query = "SELECT * FROM flightdetails where source='" + src + "' and destination='" + dest + "'";
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    labelfname.setText(rs.getString("Flight_name"));
                    labelfcode.setText(rs.getString("flight_code"));
                } else {
                    JOptionPane.showMessageDialog(null, "No Flights Found");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == BookFlight) {
            Random random = new Random();

            String aadhar = AadharTextField.getText();
            String name = nameTextField.getText();
            String nationality = nationalityTextField.getText();
            String flightname = labelfname.getText();
            String flightcode = labelfcode.getText();
            String src = lsource.getSelectedItem();
            String dest = ldestination.getSelectedItem();
            java.util.Date ddate = dcale.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateOfTravel = sdf.format(ddate);

            try {
                conn cn = new conn();
              //  String query = "insert into reservation values('PNR-" + random.nextInt(1000000) + "', 'TIC-" + random.nextInt(10000) +

                String query = "insert into reservation values('PNR-"+random.nextInt(1000000) + "','TIC-"+random.nextInt(10000)+"', '" + aadhar + "', '" + name + "', '" + nationality + "', '" + flightname + "', '" + flightcode + "', '" + src + "', '" + dest+ "')";

                cn.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Ticket Booked Successfully");

                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // Main method to create an object of the class
    public static void main(String[] args) {

        new bookflights();
    }
}
