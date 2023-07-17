import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ngui extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField addressField;
    private JTextField mobileField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JCheckBox computerCheckBox;
    private JCheckBox sportsCheckBox;
    private JCheckBox musicCheckBox;


    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASS = "";

    public ngui() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the main panel and set the layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(9, 2, 5, 5));

        // Add First Name field
        mainPanel.add(new JLabel("First Name:"));
        firstNameField = new JTextField(20);
        mainPanel.add(firstNameField);

        // Add Last Name field
        mainPanel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField(20);
        mainPanel.add(lastNameField);

        // Add Address field
        mainPanel.add(new JLabel("Address:"));
        addressField = new JTextField(20);
        mainPanel.add(addressField);

        // Add Mobile No field
        mainPanel.add(new JLabel("Mobile No:"));
        mobileField = new JTextField(20);
        mainPanel.add(mobileField);

        // Add Gender radio buttons
        mainPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        mainPanel.add(genderPanel);

        // Add Your Interests checkboxes
        mainPanel.add(new JLabel("Your Interests:"));
        JPanel interestsPanel = new JPanel();
        computerCheckBox = new JCheckBox("Computer");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        interestsPanel.add(computerCheckBox);
        interestsPanel.add(sportsCheckBox);
        interestsPanel.add(musicCheckBox);
        mainPanel.add(interestsPanel);

        // Add Submit and Reset buttons
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        mainPanel.add(submitButton);
        mainPanel.add(resetButton);

        // Add action listeners for buttons
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform actions when the submit button is clicked
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String address = addressField.getText();
                String mobileNo = mobileField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String interests = "";
                if (computerCheckBox.isSelected()) {
                    interests += "Computer ";
                }
                if (sportsCheckBox.isSelected()) {
                    interests += "Sports ";
                }
                if (musicCheckBox.isSelected()) {
                    interests += "Music ";
                }

                // Store the data in the database
                try {
                    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    String query = "INSERT INTO registration (first_name, last_name, address, mobile_no, gender, interests) " +
                            "VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement statement = conn.prepareStatement(query);
                    statement.setString(1, firstName);
                    statement.setString(2, lastName);
                    statement.setString(3, address);
                    statement.setString(4, mobileNo);
                    statement.setString(5, gender);
                    statement.setString(6, interests);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Registration successful!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Registration failed.");
                    }

                    statement.close();
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform actions when the reset button is clicked
                firstNameField.setText("");
                lastNameField.setText("");
                addressField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                computerCheckBox.setSelected(false);
                sportsCheckBox.setSelected(false);
                musicCheckBox.setSelected(false);
            }
        });

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ngui().setVisible(true);
            }
        });
    }
}