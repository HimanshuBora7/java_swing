package awt;

import java.awt.*;

public class p1 extends Frame {
    p1() {
        Button b = new Button("click me");
        b.setBounds(50, 50, 50, 50);
        add(b);

        setSize(300, 300);
        setTitle("Trial one");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        p1 v = new p1();

    }
}
