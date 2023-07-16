import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField addressField;
    private JTextField mobileField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JCheckBox computerCheckBox;
    private JCheckBox sportsCheckBox;
    private JCheckBox musicCheckBox;

    public GUIForm() {
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

                // Display the collected information
                JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Address: " + address + "\n" +
                        "Mobile No: " + mobileNo + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interests);
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
                new GUIForm().setVisible(true);
            }
        });
    }
}
