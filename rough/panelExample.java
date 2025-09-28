package rough;

import java.awt.*;

public class panelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("panel example ");
        Panel panel = new Panel();
        panel.setLayout(new GridBagLayout());

        Button button = new Button("click me ");
        button.setPreferredSize(new Dimension(150, 60));
        button.setFont(new Font("Arial", Font.BOLD, 32));
        panel.add(button);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
