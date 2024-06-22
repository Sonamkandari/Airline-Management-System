import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using inheritance to extend the JFrame
// Also implementing ActionListener because it is an interface
public class Home extends JFrame implements ActionListener {

    // Default constructor of the class
    public Home() {
        // Set up the frame
        setLayout(new BorderLayout());

        // Custom panel to draw the image
        ImagePanel imagePanel = new ImagePanel();
        add(imagePanel, BorderLayout.CENTER);

        // Create a menu bar
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        // Creating menu "Details"
        JMenu details = new JMenu("Details");
        menubar.add(details);

        // Adding menu items to "Details"
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);

        JMenuItem customerDetails = new JMenuItem("Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);


        JMenuItem reservationDetails = new JMenuItem("Reservation Details");
        reservationDetails.addActionListener(this);
        details.add(reservationDetails);

        JMenuItem bookFlight = new JMenuItem("Book your flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);

        JMenuItem cancelTicket = new JMenuItem("Cancel your flight");
        cancelTicket.addActionListener(this);
        details.add(cancelTicket);

        // Creating another menu "Ticket"
        JMenuItem ticket = new JMenu("Ticket");
        menubar.add(ticket);
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);

        // Set the frame size to maximize both horizontally and vertically
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Set the frame background color
        getContentPane().setBackground(Color.WHITE);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {


        // Handle menu actions here

        String text =ae.getActionCommand();
        if(text.equals("Customer Details")){
            new CustomerDetails();
        }else if(text.equals("Flight Details")){
           //creating object of flight detail class if equals
            new FlightDetails();
        }else if(text.equals("Resarvation Details")){
        }else if(text.equals("Book your flight")){
            new bookflights();
        }else if(text.equals("Cancel your flight")){
        }


    }

    // Custom panel class to handle image drawing
    class ImagePanel extends JPanel {
        private Image image;

        public ImagePanel() {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/airplane.jpg"));
            image = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the image scaled to fit the panel
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            // Draw the heading text
            g.setFont(new Font("Tahoma", Font.PLAIN, 40));
            g.setColor(Color.BLACK);
            g.drawString("Air India Welcomes You", 600, 50);
        }
    }
}
