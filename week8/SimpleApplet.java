package week8;
import javax.swing.*; 
import java.awt.*; 
 
public class SimpleApplet extends JFrame { 
 
    public SimpleApplet() {         setTitle("Simple Swing Example"); 
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setLocationRelativeTo(null); // This will center the window         
        add(new MessagePanel()); // Add the custom JPanel to JFrame 
    } 
 
    // Custom JPanel for drawing the message 
    private static class MessagePanel extends JPanel { 
 
        // Override paintComponent to perform custom drawing 
        @Override 
        protected void paintComponent(Graphics g) { 
            super.paintComponent(g); // Ensures proper painting of the JPanel 
            g.drawString("Hello, Swing!", 20, 20); // Draw the string at position (20, 20) 
        } 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            SimpleApplet applet = new SimpleApplet(); 
            applet.setVisible(true); // Make the JFrame visible 
        }); 
    } 
} 
