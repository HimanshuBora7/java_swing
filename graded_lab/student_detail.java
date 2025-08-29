package graded_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class student_detail extends JFrame {
    // Declare components
    private JTextField nameField, rollNoField, courseField;
    private JComboBox<String> genderCombo;
    private JCheckBox javacheck, Cncheck, blockcheck;
    private JTextArea addressArea;
    private JButton submitButton;

    public student_detail() {
        // Set up the frame
        setTitle("Student Details Form");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new GridLayout(8, 2, 10, 10)); // Grid layout for form

        // Initialize components
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 34));
        nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel rollNoLabel = new JLabel("Roll No:");
        rollNoLabel.setFont(new Font("Arial", Font.BOLD, 34));
        rollNoField = new JTextField(20);
        rollNoField.setFont(new Font("Arial", Font.BOLD, 34));
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 34));
        String[] genders = { "Select Gender", "Male", "Female", "Other" };
        genderCombo = new JComboBox<>(genders);
        genderCombo.setFont(new Font("Arial", Font.BOLD, 34));
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setFont(new Font("Arial", Font.BOLD, 34));
        courseField = new JTextField(20);
        courseField.setFont(new Font("Arial", Font.BOLD, 34));

        JLabel subjectsLabel = new JLabel("Subjects:");
        subjectsLabel.setFont(new Font("Arial", Font.BOLD, 34));
        javacheck = new JCheckBox("Advance java");
        javacheck.setFont(new Font("Arial", Font.BOLD, 34));
        Cncheck = new JCheckBox("Computer networks");
        Cncheck.setFont(new Font("Arial", Font.BOLD, 34));
        blockcheck = new JCheckBox("Blockchain");
        blockcheck.setFont(new Font("Arial", Font.BOLD, 34));
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 34));
        addressArea = new JTextArea(3, 20);
        addressArea.setFont(new Font("Arial", Font.BOLD, 34));
        JScrollPane addressScroll = new JScrollPane(addressArea);
        addressScroll.setFont(new Font("Arial", Font.BOLD, 34));
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 34));
        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(rollNoLabel);
        add(rollNoField);
        add(genderLabel);
        add(genderCombo);
        add(courseLabel);
        add(courseField);
        add(subjectsLabel);
        JPanel subjectsPanel = new JPanel(new GridLayout(3, 1));
        subjectsPanel.add(javacheck);
        subjectsPanel.add(Cncheck);
        subjectsPanel.add(blockcheck);
        add(subjectsPanel);
        add(addressLabel);
        add(addressScroll);
        add(new JLabel()); // Empty cell
        add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        // Collect data
        String name = nameField.getText().trim();

        String rollNo = rollNoField.getText().trim();
        String gender = (String) genderCombo.getSelectedItem();
        String course = courseField.getText().trim();

        // Collect subjects
        StringBuilder subjects = new StringBuilder();
        if (javacheck.isSelected())
            subjects.append("Advance Java ");
        if (Cncheck.isSelected())
            subjects.append("Computer Network ");
        if (blockcheck.isSelected())
            subjects.append("Blockchain ");
        String subjectsStr = subjects.length() > 0 ? subjects.substring(0, subjects.length() - 2) : "None";

        String address = addressArea.getText().trim();

        // Create message
        String message = String.format(
                "Student Details:\n\nName: %s\nRoll No: %s\nGender: %s\nCourse: %s\nSubjects: %s\nAddress: %s",
                name, rollNo, gender, course, subjectsStr, address);

        // Show message box
        JOptionPane.showMessageDialog(this, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new student_detail().setVisible(true);
            }
        });
    }
}