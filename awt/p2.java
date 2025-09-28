package awt;

import java.awt.*;

public class p2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("name");
        Button b = new Button("Submit");
        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        b.setBounds(20, 60, 80, 30);
        t.setBounds(20, 60, 80, 30);

        f.add(l);
        f.add(b);
        f.add(t);

        f.setSize(400, 300);
        f.setTitle("employee info");
        f.setLayout(null);
        f.setVisible(true);
    }
}