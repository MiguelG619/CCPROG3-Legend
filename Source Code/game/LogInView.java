package Game;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * The Class LogInView.
 */
@SuppressWarnings("serial")
public class LogInView extends JFrame {
    
    /** The player text. */
    private JTextField playerText;
    
    /** The avatar text. */
    private JTextField avatarText;
    
    /** The create button. */
    private JButton createButton;
    
    /** The success label. */
    private JLabel successLabel;
    
    /** The frame. */
    public JFrame frame;

    /**
     *  creates a LogInView object .
     */
    public LogInView() {
    	JPanel panel = new JPanel();
    	frame = new JFrame();

    	// sets the properties of the frame and adds the panel
        frame.setSize(550,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);

        
        panel.setLayout(null);

        // initiates the username label and adds it to the panel
        JLabel playerLabel = new JLabel("Username: ");
        playerLabel.setBounds(10,20,80,25);
        panel.add(playerLabel);

        // adds a text field next to the username jlabel
        playerText = new JTextField(20);
        playerText.setBounds(130,20,165,25);
        panel.add(playerText);

        
        // initiates the  Avatar Preference label and adds it to the panel
        JLabel avatarLabel = new JLabel("Avatar Preference: ");
        avatarLabel.setBounds(10,60,130,25);
        panel.add(avatarLabel);

        // adds a text field next to the Avatar Preference jlabel
        avatarText = new JTextField(20);
        avatarText.setBounds(130,60,165,25);
        panel.add(avatarText);

        // initiate the button to confirm the player's username and avatar preference and adding it to the panel
        createButton = new JButton("Create Player!");
        createButton.setBounds(150, 100, 130, 25);
        panel.add(createButton);

        // initiates a success label when the user is able to pass the requirements
        successLabel = new JLabel();
        successLabel.setBounds(10,125,300,25);
        panel.add(successLabel);

    }

    
    /**
     *  gets the user input besides the username label.
     *
     * @return the user input besides the username label
     */
    public String getPlayerText() {
        return playerText.getText();
    }

    /**
     *  gets the avatar text input besides the avatar preference label.
     *
     * @return the user input besides the avatar preference label
     */
    public String getAvatarText() {
        return avatarText.getText();
    }

    /**
     *  creates a listener for the create button.
     *
     * @param listenerForCreateButton is an actionlistener class will do an action when the button is pressed
     */
    public void createButtonListener(ActionListener listenerForCreateButton) {
        createButton.addActionListener(listenerForCreateButton);
    }

    /**
     *  displays the error message.
     *
     * @param errorMessage the error message
     */
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    /**
     *  sets the success label.
     *
     * @param successLabel is the success message
     */
    public void setSuccessLabel(String successLabel) {
        this.successLabel.setText(String.valueOf(successLabel));
    }

}
