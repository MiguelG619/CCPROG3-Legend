package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;

import map.MapController;
import map.MapView;

/**
 * The Class ChooseCompanionController.
 */
public class ChooseCompanionController {
	
	/** The view. */
	private ChooseCompanionView theView;
	
	/** The player. */
	private Player player;
	
	/** The counter companion chosen. */
	private int ctrCompanionChosen = 0;
	
	/** The companion chosen. */
	public char[] companionChosen = new char[3];
	
	/**
	 * Instantiates a new choose companion controller.
	 *
	 * @param theView the the view
	 * @param player  the player
	 */
	public ChooseCompanionController(ChooseCompanionView theView, Player player) {
		this.theView = theView;
		this.player = player;
			
		// initiates the listener for the companion images and the confirm button for each companion
		theView.kirinImageListener(new KirinPanelListener());
		theView.yumeImageListener(new YumePanelListener());
		theView.yukiImageListener(new YukiPanelListener());
		theView.sameImageListener(new SamePanelListener());
		
		theView.kirinYesListener(new KirinButtonListener());
		theView.yumeYesListener(new YumeButtonListener());
		theView.yukiYesListener(new YukiButtonListener());
		theView.sameYesListener(new SameButtonListener());
		
	}
	
	
	/**
	 * Adds the companion list.
	 *
	 * @param companion the companion
	 */
	private void addCompanionList(char companion) {
		companionChosen[ctrCompanionChosen] = companion;
	}
	
	/**
	 * Check if companions are three.
	 *
	 * @param ctrCompanionChosen the counter companion chosen
	 * @return true, if companions are three
	 */
	private boolean checkIfCompanionsThree(int ctrCompanionChosen) {
		return ctrCompanionChosen == 3;
	}
	
	
	/**
	 * Loads the map
	 *
	 * @param player the player
	 */
	private void initializeMap(Player player) {
		
		MapView view = new MapView(randomMap());
		new MapController(view, player);
	}
	
	/**
	 * randomly select the map
	 *
	 * 
	 */
	private int randomMap() {
		Random random = new Random();	
		return random.nextInt(5) + 1;		
	}
	
	
	
	/**
	 * Adds the panel choose companion.
	 *
	 * @param panel the panel
	 */
	private void addPanelChooseCompanion(String panel) {
		theView.layeredPanel.removeAll();
		
		if (panel.equals("kirinPanel"))
			theView.layeredPanel.add(theView.kirinPanel);
		else if (panel.equals("yumePanel"))
			theView.layeredPanel.add(theView.yumePanel);
		else if (panel.equals("yukiPanel"))
			theView.layeredPanel.add(theView.yukiPanel);
		else if (panel.equals("samePanel"))
			theView.layeredPanel.add(theView.samePanel);
		
		theView.layeredPanel.repaint();
		theView.layeredPanel.revalidate();
	}
	
	
	/**
	 * The listener interface for receiving kirinPanel events. The class that is
	 * interested in processing a kirinPanel event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addKirinPanelListener<code> method. When the kirinPanel
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see KirinPanelEvent
	 */
	class KirinPanelListener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			addPanelChooseCompanion("kirinPanel");
		}
	}
		
	/**
	 * The listener interface for receiving yumePanel events. The class that is
	 * interested in processing a yumePanel event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addYumePanelListener<code> method. When the yumePanel event
	 * occurs, that object's appropriate method is invoked.
	 *
	 * @see YumePanelEvent
	 */
	class YumePanelListener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			addPanelChooseCompanion("yumePanel");
		}
	}
	
	/**
	 * The listener interface for receiving yukiPanel events. The class that is
	 * interested in processing a yukiPanel event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addYukiPanelListener<code> method. When the yukiPanel event
	 * occurs, that object's appropriate method is invoked.
	 *
	 * @see YukiPanelEvent
	 */
	class YukiPanelListener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			addPanelChooseCompanion("yukiPanel");
		}
	}
	
	/**
	 * The listener interface for receiving samePanel events. The class that is
	 * interested in processing a samePanel event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addSamePanelListener<code> method. When the samePanel event
	 * occurs, that object's appropriate method is invoked.
	 *
	 * @see SamePanelEvent
	 */
	class SamePanelListener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			addPanelChooseCompanion("samePanel");
		}
	}
	
	
	/**
	 * Check complete companions.
	 */
	private void checkCompleteCompanions() {
		if (checkIfCompanionsThree(ctrCompanionChosen)) {
			JOptionPane.showMessageDialog(null, "Congratulations for picking 3 Companions with your journey " 
					+ player.name + "!!");
			player.setCompanionList(companionChosen);
			theView.frame.dispose();
			initializeMap(player);
		}
	}

	
	/**
	 * Choosing companion list.
	 *
	 * @param companionInitial the companion initial
	 */
	private void choosingCompanionList(char companionInitial) {
		   int response = JOptionPane.showConfirmDialog(null, "Are you sure about this companion?",
	                "Confirmation of Companion", JOptionPane.YES_NO_OPTION);
		    
		    if (response == JOptionPane.YES_OPTION) {
		    	switch(companionInitial) {
		    	case 'K':
		    		addCompanionList(companionInitial);
		    		theView.kirinYes.setVisible(false);
		    		break;
		    	case 'Y':
			    	addCompanionList(companionInitial);
		    		theView.yumeYes.setVisible(false);
		    		break;
		    	case 'I':
			    	addCompanionList(companionInitial);
		    		theView.yukiYes.setVisible(false);
		    		break;
		    	case 'S':
		    		addCompanionList(companionInitial);
		    		theView.sameYes.setVisible(false);
		    		break;
		    	default:
					System.exit(0);
				}
		    	ctrCompanionChosen++;
		    	checkCompleteCompanions();
		    	}	
		    
	}
	
	/**
	 * The listener interface for receiving kirinButton events. The class that is
	 * interested in processing a kirinButton event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addKirinButtonListener<code> method. When the kirinButton
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see KirinButtonEvent
	 */
	class KirinButtonListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
		    choosingCompanionList('K');
		}
	}
	
	/**
	 * The listener interface for receiving yukiButton events. The class that is
	 * interested in processing a yukiButton event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addYukiButtonListener<code> method. When the yukiButton
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see YukiButtonEvent
	 */
	class YukiButtonListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			 choosingCompanionList('I');
		}
	}
	
	/**
	 * The listener interface for receiving yumeButton events. The class that is
	 * interested in processing a yumeButton event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addYumeButtonListener<code> method. When the yumeButton
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see YumeButtonEvent
	 */
	class YumeButtonListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			 choosingCompanionList('Y');
		}
	}
	
	/**
	 * The listener interface for receiving sameButton events. The class that is
	 * interested in processing a sameButton event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addSameButtonListener<code> method. When the sameButton
	 * event occurs, that object's appropriate method is invoked.
	 *
	 * @see SameButtonEvent
	 */
	class SameButtonListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			 choosingCompanionList('S');
		}
	}
	
}



