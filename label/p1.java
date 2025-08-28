package label;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class p1 {
    // jlabel = a gui display area for a string of text , an image or both
    public static void main(String[] args) {
        // label
        JLabel label = new JLabel(); // this will create a label
        // creating a border

        // adding image to the label

        ImageIcon image = new ImageIcon("photo-gallery.png");
        label.setIcon(image);
        label.setText("hello world"); // set text of label
        // positon of text with respect to the image added
        // option availabe on this are set text LEFT ,CENTER,RIGHT
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER,BOTTOM of imageicon
        // changing the alignment
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal postion of icon+text within the label

        label.setForeground(Color.white); // color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 32)); // set font of text ,style and font

        JFrame myframe = new JFrame();
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(700, 700);
        myframe.setVisible(true);
        myframe.setTitle("Labels");
        myframe.add(label); // adding the label to the frame
        myframe.getContentPane().setBackground(Color.black);

    }

}
