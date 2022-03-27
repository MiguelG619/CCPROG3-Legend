package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInController {
    private LogInView logInView;
    private Player player;
    public boolean status = true;

    public LogInController(LogInView logInView, Player player) {
        this.logInView = logInView;
        this.player = player;

     
        this.logInView.createButtonListener(new CreateButtonListener());
    }
    
    public void chooseCompanionSequence(Player player) {
    	ChooseCompanionView chooseCompanionView = new ChooseCompanionView();
		new ChooseCompanionController(chooseCompanionView, player);
		
		chooseCompanionView.frame.setVisible(true);
		}
    

    class CreateButtonListener implements ActionListener {
  
        public void actionPerformed(ActionEvent e) {
            String AvatarPreference = logInView.getAvatarText();
        if (!(AvatarPreference.equalsIgnoreCase("male")) &&
                !(AvatarPreference.equalsIgnoreCase("female")))
            logInView.setSuccessLabel("Enter Male of Female only!!");
        else {
            player.setName(logInView.getPlayerText());
            player.setAvatarPreference(logInView.getAvatarText());
            status = false;
            System.out.println(status);
            logInView.frame.dispose();
            chooseCompanionSequence(player);
    		}
        }	
	}

}
