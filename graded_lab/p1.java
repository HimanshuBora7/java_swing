package graded_lab;

import javax.swing.*;

public class p1 extends JFrame {

    // declare the components

    public JTextField nameField, roll_num_field, courseField;
    public JComboBox<String> genderCombo;
    public JTextArea addressArea;
    public JButton submitButton;

    public p1() {
        setTitle("Student Details FOrm ");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 10, 10));
    }

    public static void main(String[] args) {

    }

}
