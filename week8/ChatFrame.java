package week8;

import javax.swing.*; import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class ChatFrame extends JFrame { 
     
    private JTextArea conversationArea;     
    private JTextField messageField; 
    private JButton sendButton; 
 
    public ChatFrame() {         // Set up the JFrame        
        setTitle("Chat Application");         
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setLocationRelativeTo(null); // Center the window 
         
        // Set up the JMenuBar and JMenu 
        JMenuBar menuBar = new JMenuBar(); 
        JMenu fileMenu = new JMenu("File"); 
         
JMenuItem exitMenuItem = new JMenuItem("Exit");    
exitMenuItem.addActionListener(e -> System.exit(0)); 
        
        fileMenu.add(exitMenuItem);         
        menuBar.add(fileMenu); 
        setJMenuBar(menuBar); 
 
        // Create the conversation area (JTextArea) to display chat messages      
        conversationArea = new JTextArea(); 
        conversationArea.setEditable(false); // User should not edit this area         
        conversationArea.setLineWrap(true); 
        conversationArea.setWrapStyleWord(true); 
         
        // Create the message input field (JTextField) and send button         
        messageField = new JTextField(30); 
        sendButton = new JButton("Send"); 
         
        // Action listener for the send button 
        sendButton.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) {                 
            sendMessage(); 
            } 
        }); 
         
        // Layout the components in a JPanel         
        JPanel inputPanel = new JPanel();         
        inputPanel.setLayout(new BorderLayout());         
        inputPanel.add(messageField, BorderLayout.CENTER);         
        inputPanel.add(sendButton, BorderLayout.EAST); 
         
        // Add the components to the JFrame 
        add(new JScrollPane(conversationArea), BorderLayout.CENTER); // Add scrollable conversation area         
        add(inputPanel, BorderLayout.SOUTH); // Add input panel at the bottom 
    } 
 
    private void sendMessage() { 
        String message = messageField.getText().trim(); // Get the text entered by the user         
        if (!message.isEmpty()) { 
            conversationArea.append("You: " + message + "\n"); // Add the message to the conversation area 
            messageField.setText(""); // Clear the input field 
            messageField.requestFocus(); // Focus back to the input field 
        } 
    } 
 
    public static void main(String[] args) { 
     SwingUtilities.invokeLater(() -> { 
       // Create and display the ChatFrame 
        ChatFrame frame = new ChatFrame();             
        frame.setVisible(true); 
        }); 
    } 
} 

