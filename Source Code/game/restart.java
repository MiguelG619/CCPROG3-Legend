package Game;

public class restart {
	
	public void chooseCompanionSequence(Player player) {
    	ChooseCompanionView chooseCompanionView = new ChooseCompanionView();
		new ChooseCompanionController(chooseCompanionView, player);
		
		chooseCompanionView.frame.setVisible(true);
		}
}
