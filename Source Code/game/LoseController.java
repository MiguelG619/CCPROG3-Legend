package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoseController {
	private LoseView view;
	
	public LoseController(LoseView view) {
		this.view = view;
		view.setVisible(true);
		
		// Activates the buttons
		view.playAgainListener(new PlayAgainListener2());
		view.quitListener(new QuitListener2());
	}
	
	
	
	/**
	 * The listener interface for receiving buttonCompanion1 events.
	 * The class that is interested in processing a buttonCompanion1
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonCompanion1Listener<code> method. When
	 * the buttonCompanion1 event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonCompanion1Event
	 */
	class PlayAgainListener2 implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			int response = JOptionPane.showConfirmDialog(null, "Are you sure about this?",
	                "Confirmation to Play Again", JOptionPane.YES_NO_OPTION);
		    
		    if (response == JOptionPane.YES_OPTION) {
		    	view.dispose();
		    	LogInView start = new LogInView();
				Player player = new Player();
				new LogInController(start, player);
				start.frame.setVisible(true);
		    }
		}
	}
	
	/**
	 * The listener interface for receiving buttonCompanion1 events.
	 * The class that is interested in processing a buttonCompanion1
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonCompanion1Listener<code> method. When
	 * the buttonCompanion1 event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonCompanion1Event
	 */
	class QuitListener2 implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			int response = JOptionPane.showConfirmDialog(null, "Are you sure about this companion?",
	                "Confirmation of Companion for Battle", JOptionPane.YES_NO_OPTION);
		    
		    if (response == JOptionPane.YES_OPTION) {
		    	view.dispose();
		    }
		}
	}
	
}
