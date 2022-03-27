package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class LogInController.
 */
public class LogInController {
    
    /** The log in view. */
    private LogInView logInView;
    
    /** The player. */
    private Player player;

    /**
     *  creates a LogInController class with two parameters.
     *
     * @param logInView is a LogInView class
     * @param player is a Player class
     */
    public LogInController(LogInView logInView, Player player) {
        this.logInView = logInView;
        this.player = player;

        // makes the createButton work
        this.logInView.createButtonListener(new CreateButtonListener());
    }
    
    /**
     *  initiates the choosing of companion sequence.
     *
     * @param player is a Player class
     */
    private void chooseCompanionSequence(Player player) {
    	ChooseCompanionView chooseCompanionView = new ChooseCompanionView();
		new ChooseCompanionController(chooseCompanionView, player);
		
		chooseCompanionView.frame.setVisible(true);
		}
    

    /**
     *  makes the createButton work.
     *
     * @author Gonzaga
     */
    class CreateButtonListener implements ActionListener {
  
    	/**
	     *  makes the user enter the available avatar preference.
	     *
	     * @param e the e
	     */
        public void actionPerformed(ActionEvent e) {
            String AvatarPreference = logInView.getAvatarText();
        if (!(AvatarPreference.equalsIgnoreCase("male")) &&
                !(AvatarPreference.equalsIgnoreCase("female")))
            logInView.setSuccessLabel("Enter Male of Female only!!");
        else {
            player.setName(logInView.getPlayerText());
            player.setAvatarPreference(logInView.getAvatarText());
            logInView.frame.dispose();
            chooseCompanionSequence(player);
    		}
        }	
	}

}
