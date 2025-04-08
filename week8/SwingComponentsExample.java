package week8;

import javax.swing.*; import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class SwingComponentsExample extends JFrame { 
     
    private JTextField textField;     
    private JButton button;     
    private JMenuBar menuBar;    
     private JMenu fileMenu; 
    private JMenuItem openItem, saveItem, exitItem; 
 
    public SwingComponentsExample() { 
        // Set the title, size, and default close operation of the JFrame 
        setTitle("Swing Components Example"); 
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
        // Center the window on the screen 
        setLocationRelativeTo(null); 
         
        // Create the text field and button         
        textField = new JTextField(20);         
        button = new JButton("Show Text");    // Create the JMenuBar and add menus        
        menuBar = new JMenuBar(); 
        fileMenu = new JMenu("File"); 
         
        // Create menu items 
        openItem = new JMenuItem("Open");         
        saveItem = new JMenuItem("Save"); 
        exitItem = new JMenuItem("Exit"); 
         
        // Add action listeners for the menu items 
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open clicked"));       
          saveItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Save clicked"));         exitItem.addActionListener(e -> System.exit(0)); 
         
        // Add menu items to the menu and add the menu to the menu bar        
         fileMenu.add(openItem);         
         fileMenu.add(saveItem); 
        fileMenu.addSeparator(); // Add a separator line between items       
          fileMenu.add(exitItem); 
        menuBar.add(fileMenu); 
         
        // Set the menu bar for the frame 
        setJMenuBar(menuBar); 
         
        // Create a JPanel to organize components       
        JPanel panel = new JPanel();        
        panel.add(textField); 
        panel.add(button); 
         
        // Add action listener to the button 
        button.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                String text = textField.getText(); 
                JOptionPane.showMessageDialog(SwingComponentsExample.this, "You entered: " + text); 
            } 
        }); 
         
        // Add the panel to the frame 
        add(panel, BorderLayout.CENTER); 
    } 
 
    public static void main(String[] args) { 
        // Run the Swing components in the Event Dispatch Thread (EDT) 
        SwingUtilities.invokeLater(() -> { 
            SwingComponentsExample frame = new SwingComponentsExample(); 
            frame.setVisible(true); // Make the frame visible 
}); 
}
}

