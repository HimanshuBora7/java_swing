package buttons;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class p3 extends JFrame {
    // instead of using implements , we will be using lambda expression

    JButton button;

    p3() {

        button = new JButton();
        button.setBounds(200, 100, 300, 100);
        button.addActionListener(e -> System.out.println("helllow orld"));
        button.setText("press me");
        button.setFocusable(false);
        button.setFont(new Font("comic sans", Font.BOLD, 22));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080, 1080);
        this.setVisible(true);
        this.setTitle("Buttons");
        this.add(button);
    }

}
