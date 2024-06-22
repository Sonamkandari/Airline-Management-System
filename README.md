# Airline-Management-System
   #Login frame

   The Login class is a Java Swing application that creates a simple user login interface. It extends JFrame and implements ActionListener for handling button events.

Components and Layout
JLabel:

lbusername: Label for "User name".
password: Label for "Password".
JTextField:

userField: Text field for entering the username.
JPasswordField:

passwordField: Password field for entering the password.
JButton:

reset: Button to reset the text fields.
Submit: Button to submit the login form.
close: Button to close the application.
The layout is set to null, allowing manual placement of components using setBounds.

Event Handling
The actionPerformed method handles button click events:

Submit: Checks the database for the entered username and password. If valid, it opens a new Home window; otherwise, it shows an error message.
reset: Clears the text fields.
close: Closes the application window.
Database Connection
The class uses a conn object to interact with the database. The Submit button executes a SQL query to validate the user's credentials.

Visual and Functional Features
The frame size is set to 400x350 pixels.
The frame location is set to open in the center of the screen (600,400 coordinates).
The background color of the frame is set to white.
Buttons are styled with black backgrounds and white text.
Main Method
The main method creates an instance of the Login class, making the login window visible.
![image](https://github.com/Sonamkandari/Airline-Management-System/assets/145662567/3804a669-6834-4ad0-97f2-ab8cd7aee9e3)

# Home page frame
Class Structure:

Home class extends JFrame and implements ActionListener.
It sets up the main frame, creates a custom ImagePanel for the background image and heading text, and adds a menu bar (JMenuBar) with various menu items.
Menus:

Details Menu: Contains items like "Flight Details", "Customer Details", "Reservation Details", "Book your flight", and "Cancel your flight". These items are added to the menu bar and set to trigger actions when clicked.
Ticket Menu: Contains an item "Boarding Pass".
Action Handling:

The actionPerformed method handles actions when a menu item is clicked. Depending on the clicked item, it instantiates different classes (CustomerDetails, FlightDetails, bookflights, etc.) to handle specific functionalities.
ImagePanel:

A nested class within Home that extends JPanel and draws the background image (airplane.jpg) scaled to fit the panel, along with a heading text "Air India Welcomes You".
Main Method:

The main method creates an instance of Home, starting the GUI application.
![image](https://github.com/Sonamkandari/Airline-Management-System/assets/145662567/fee8fae0-223d-412e-aa0a-7ea000ea4057)


#flight details
Class Structure:

FlightDetails extends JFrame.
It sets up the frame with a white background and a null layout (setLayout(null)).
Table Display:

Creates a JTable named table to display flight details.
Uses DbUtils.resultSetToTableModel(rs) from the net.proteanit.sql package to populate the table with data fetched from a database (flightdetails table).
Database Connectivity:

Establishes a database connection using the conn class (assuming it's a custom class for database connection).
Executes a query (select * from flightdetails) to retrieve flight details.
Populates the ResultSet rs with the data retrieved from the database.
Scrollable Table:

Creates a JScrollPane jsp to make the JTable scrollable.
Sets the bounds (setBounds(0, 0, 800, 500)) for the scroll pane to fit within the frame.
Adds the scroll pane jsp to the frame.
Frame Configuration:

Sets the size (setSize(800, 500)), location (setLocation(400, 200)), and makes the frame visible (setVisible(true)).
Main Method:

The main method creates an anonymous instance of FlightDetails, initializing the GUI to display flight details when the program runs.
![image](https://github.com/Sonamkandari/Airline-Management-System/assets/145662567/e272c608-2d86-4f4c-82e1-1500b275f08c)

# Customer Details Frame
Class Structure:

CustomerDetails extends JFrame and implements ActionListener.
It sets up a frame to capture customer details and save them into a database.
GUI Components:

Text Fields:

nameTextField: For customer name.
nationalityTextField: For customer nationality.
AadharTextField: For customer Aadhar number.
addressTextField: For customer address.
PhoneTextField: For customer phone number.
emailTextField: For customer email address.
Radio Buttons:

Male, female: Radio buttons for customer gender selection.
Labels and Buttons:

Various labels (JLabel) to describe each text field.
Save button (JButton) to save customer details.
Action Handling:

Implements actionPerformed method to handle the action events, specifically for the Save button.
Retrieves data from text fields and radio buttons.
Constructs an SQL query (INSERT INTO passenger VALUES (...)) to insert the collected data into a database (passenger table).
Displays a success message dialog (JOptionPane.showMessageDialog) upon successful insertion.
Database Connectivity:

Assumes the existence of a conn class for database connection (conn.s.executeUpdate(Query)).
Frame Configuration:

Sets the size (setSize(900, 600)), location (setLocation(300, 150)), and makes the frame visible (setVisible(true)).
Main Method:

The main method creates an instance of CustomerDetails, starting the GUI application.
![image](https://github.com/Sonamkandari/Airline-Management-System/assets/145662567/fb659c83-cbb6-4647-948a-53045369a34c)

# Book your flights frame
Class Structure:

bookflights extends JFrame and implements ActionListener.
Sets up a frame to book flights and collect reservation details.
GUI Components:

Text Fields:

AadharTextField: For entering Aadhar number of the customer.
nameTextField: For entering customer name.
nationalityTextField: For entering customer nationality.
addressTextField: For entering customer address.
PhoneTextField: For entering customer phone number.
labelfname, labelfcode: Labels to display flight details.
Labels and Buttons:

Various JLabel components to label text fields and display flight details.
fetchButton, fetch, BookFlight: Buttons to fetch customer details, fetch flight details, and book the flight respectively.
Choice:

lsource, ldestination: Choice components to select source and destination cities.
Calendar:

dcale: JCalendar component to select the date of travel.
Database Connectivity:

Uses conn class for database connection (conn.s.executeQuery(query) and conn.s.executeUpdate(query)).
Action Handling:

Implements actionPerformed method to handle the action events for buttons (fetchButton, fetch, BookFlight).
Fetches customer details based on Aadhar number.
Fetches flight details based on selected source and destination.
Books the flight by inserting reservation details into the database with a randomly generated PNR and Ticket ID.
Frame Configuration:

Sets the size (setSize(1000, 800)), location (setLocation(200, 50)), and makes the frame visible (setVisible(true)).
Main Method:

The main method creates an instance of bookflights, starting the GUI application.

![image](https://github.com/Sonamkandari/Airline-Management-System/assets/145662567/4e111d28-fa64-44b2-a046-540f66bc85c6)

