package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class p2 extends JFrame implements ActionListener {

    JButton button;

    p2() {

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080, 1080);
        this.setVisible(true);
        this.setTitle("Buttons");
        this.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("hello world");
        }
    }
}