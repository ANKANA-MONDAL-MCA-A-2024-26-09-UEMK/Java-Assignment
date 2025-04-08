package week8;

import javax.swing.*;
import java.awt.*;

public class ParameterApplet extends JFrame {
    public ParameterApplet(String message) {
        setTitle("Swing Parameter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window
        add(new MessagePanel(message));
    }

    // Custom JPanel to draw the message
    private static class MessagePanel extends JPanel {
        private final String message;

        public MessagePanel(String message) {
            this.message = message;
        }

        // Correct Swing override
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(message, 20, 20);
        }
    }

    public static void main(String[] args) {
        String message = "Welcome to Swing!";
        SwingUtilities.invokeLater(() -> {
            ParameterApplet applet = new ParameterApplet(message);
            applet.setVisible(true);
        });
    }
}
