package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p1 {
    public static void main(String[] args) {
        // jPanel = a GUI component that functions as a container to hold other
        // components
        JLabel label = new JLabel();
        label.setText("hello");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 34));

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 400, 400);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(510, 0, 400, 400);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0, 510, 400, 400);

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.orange);
        orangePanel.setBounds(510, 510, 400, 400);
        orangePanel.setLayout(new BorderLayout());

        JFrame myframe = new JFrame();
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);
        myframe.setSize(1080, 1080);
        myframe.setVisible(true);
        myframe.setTitle("Panels");

        // adding panels to the frame
        orangePanel.add(label);
        myframe.add(redPanel);
        myframe.add(bluePanel);
        myframe.add(pinkPanel);
        myframe.add(orangePanel);

    }

}
