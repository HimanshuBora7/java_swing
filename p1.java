import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class p1 {
    public static void main(String[] args) {

        // j frame is a gui window where we add our components

        JFrame myframe = new JFrame(); // it creates a frame but it won't visible untill we set its visibilty to true

        myframe.setTitle("This is my first trial box "); // set title for frame

        myframe.setSize(1000, 1000); // this sets x dimension and y dimension of frame

        myframe.setVisible(true);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*
                                                                 * by default when we press cross on window it hides
                                                                 * ,so to change this behaviour we have to change
                                                                 * default
                                                                 * behaviour to EXIT_ON_CLOSE
                                                                 */
        // but if we want nothing to happen when cross button is pressed we can do that
        // also
        // myframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // if we want to prevent user from resizing the window we can do that by setting
        // resizing to false
        myframe.setResizable(false); // prevent frame from being resized

        // Setting up the icon on the top of the dialoge box
        ImageIcon image = new ImageIcon("photo-gallery.png"); // create an image icon

        myframe.setIconImage(image.getImage()); // change icon of frame

        // Setting up the background color of the frame
        // only limited color option are available through this method

        // myframe.getContentPane().setBackground(Color.GRAY);
        // if we have hex code of the color we want to put in background
        // 0x before the hex value
        myframe.getContentPane().setBackground(new Color(0xFFF0F5));

    }
}
