//Another way of using the frame is by creating the object of Frame class 
package rough;

import java.awt.*;

public class byCreating {
    byCreating() {
        Frame f = new Frame();

        Label l = new Label("Employee id");
        Button b = new Button("Submit");
        TextField t = new TextField();
        TextArea ta = new TextArea("submit ur feedback");

        ta.setBounds(20, 80, 80, 30);
        ta.setSize(500, 500);
        l.setBounds(20, 80, 80, 30);
        b.setBounds(20, 100, 80, 30);
        t.setBounds(100, 100, 80, 30);

        f.add(ta);
        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(800, 800);
        f.setTitle("employee info");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        byCreating obj = new byCreating();
    }
}
