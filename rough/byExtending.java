// there are two ways to create a GUI using Frame in AWT 
// By extending the frame class (inheritence)
// by creating the object of frame class ( asssociation )

//here is the example of creating a frame by extending the Frame class 
package rough;

import java.awt.*;

public class byExtending extends Frame {
    byExtending() {
        Button b = new Button("Click me ");
        b.setBounds(300, 500, 80, 30);
        add(b);
        setSize(800, 800);
        setTitle("This frame is created by extending the frame class ");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        byExtending f = new byExtending();
    }
}