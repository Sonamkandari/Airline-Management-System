import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques extends JFrame implements ActionListener {
    JTextField fnTextField,SnTextField, stateTextField,id1TextField,id2TextField,nmTextField,nm1TextField,slrTextField,slr2TextField;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
    JComboBox<String> stateComboBox;
    public Ques() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        lb1 = new JLabel("First Name");
        lb1.setBounds(0, 20, 75, 15);
        add(lb1);
        lb1.setFont(new Font("Tahoma", Font.PLAIN, 15));

        fnTextField = new JTextField();
        fnTextField.setBounds(79, 20, 100, 20);
        add(fnTextField);

        lb2 = new JLabel("Second Name");
        lb2.setBounds(180, 20, 100, 20);
        add(lb2);
        lb2.setFont(new Font("Tahoma", Font.PLAIN, 15));

        SnTextField = new JTextField();
        SnTextField.setBounds(280, 20, 100, 20);
        add(SnTextField);

        lb3 = new JLabel("State");
        lb3.setBounds(382, 20, 40, 20);
        add(lb3);
        lb3.setFont(new Font("Tahoma", Font.PLAIN, 15));

        stateTextField = new JTextField();
        stateTextField.setBounds(425, 20, 100, 20);
        add(stateTextField);

        String[] states = { "Uttarakhand","Uttar Pradesh","haryana" };
        stateComboBox = new JComboBox<>(states);
        stateComboBox.setBounds(426, 20, 150, 20);
        add(stateComboBox);


        lb3 = new JLabel("Qualification");
        lb3.setBounds(527, 20, 100, 20);
        add(lb3);
        lb3.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JCheckBox tenth = new JCheckBox("10th");
        tenth.setBounds(628, 20, 50, 20);
        tenth.setBackground(Color.WHITE);
        add(tenth);

        JCheckBox twelth = new JCheckBox("12th");
        twelth.setBounds(680, 20, 60, 20);
        add(twelth);

        JCheckBox Gradu = new JCheckBox("Btech");
        Gradu.setBounds(740, 20, 60, 20);
        add(Gradu);

        //for the  Department

        lb4 = new JLabel("Qualification");
        lb4.setBounds(0, 300, 90, 15);
        add(lb4);
        lb4.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JRadioButton me = new JRadioButton("Me");
        me.setBounds(90, 300, 50, 20);
        me.setBackground(Color.WHITE);
        add(me);

        JRadioButton cse = new JRadioButton("CSE");
        cse.setBounds(140, 300, 50, 20);
        add(cse);

        JRadioButton ece = new JRadioButton("ECE");
        ece.setBounds(190, 300, 60, 20);
        add(ece);


        lb5 = new JLabel("ID");
        lb5.setBounds(426, 50, 70, 15);
        add(lb5);
        lb5.setFont(new Font("Tahoma", Font.PLAIN, 15));

        id1TextField = new JTextField();
        id1TextField.setBounds(426, 80, 100, 20);
        add(id1TextField);
        id2TextField = new JTextField();
        id2TextField.setBounds(426, 100, 100, 20);
        add(id2TextField);

        lb6 = new JLabel("Name");
        lb6.setBounds(526, 50, 70, 15);
        add(lb6);
        lb6.setFont(new Font("Tahoma", Font.PLAIN, 15));

        nmTextField = new JTextField();
        nmTextField.setBounds(526, 80, 100, 20);
        add(nmTextField);
        nm1TextField = new JTextField();
        nm1TextField.setBounds(526, 100, 100, 20);
        add(nm1TextField);


        lb7 = new JLabel("Salary");
        lb7.setBounds(626, 50, 80, 20);
        add(lb7);
        lb7.setFont(new Font("Tahoma", Font.PLAIN, 15));

        slrTextField = new JTextField();
        slrTextField.setBounds(626, 80, 100, 20);
        add(slrTextField);
        slr2TextField = new JTextField();
        slr2TextField.setBounds(626, 100, 100, 20);
        add(slr2TextField);

        setSize(900,900);
        setVisible(true);
    }
    // Action performed method
    public void actionPerformed(ActionEvent ae) {
        try {
            // Handle button click
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method to create an object of the class
    public static void main(String[] args) {
        new Ques();
    }
}