package map;


import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Game.Companion;
import Game.EncounterController;
import Game.EncounterView;
import Game.EndingController;
import Game.EndingView;
import Game.Player;

/**
 * 
 * a Controller for the Map GUI 
 *
 */
public class MapController {
	// initiazes the Player object
	private Player player;
	// initializes a new MapView object 
	private MapView mapView;
	// initializes int for updating the coordinates
    private int row = 0, col = 0;
	
    /** MapController constructor
     * 
     * @param player the player
     * @param mapView takes a MapView object
     */
	public MapController(MapView mapView, Player player) {
		// initializes the parameter to the initialized mapView object
		this.mapView = mapView;
		 this.player = player; 
		 
		 //initializes the image of the player
		 iniatePlayerAvatar(player);
		
		// calls the method made in the View 
		mapView.moveActionListener(new listenMovement());
	}
	
	/**
     * Iniate player avatar.
     *
     * @param player the player
     */
    public void iniatePlayerAvatar(Player player) {
    	
    	if (player.avatarPreference.equalsIgnoreCase("male"))
    	mapView.playerPos.setIcon(
    			new ImageIcon(
    					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\male.png"));
    	else	
        	mapView.playerPos.setIcon(
        			new ImageIcon(
        					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\female.png"));
    }


    /**
     * Encounter sequence.
     *
     * @param initial the enemy companion initial
     */
    public void encounterSequence(char initial) {
    	EncounterView view = new EncounterView();
    	Companion enemyCompanion = new Companion(initial);
    	new EncounterController(view, player, enemyCompanion, mapView);
    	view.setVisible(true);
    	
    	// hides the buttons so the player will not move
    	mapView.up.setVisible(false);
 	   	mapView.down.setVisible(false);
 	   	mapView.left.setVisible(false);
 	   	mapView.right.setVisible(false);
    }
    
   /**
    * Ending sequence.
    */
   public void endingSequence() {
	   EndingView view = new EndingView();
	   new EndingController(view, mapView);
	   view.setVisible(true);
	   
	   // Removes the map GUI
	   mapView.dispose();
   }
	
	/**
	 * 
	 * implements the logic when a button is clicked
	 *
	 */
	class listenMovement implements ActionListener{
		/**
		 * 
		 */
		public void actionPerformed(ActionEvent e) {
			// uses a try-catch in order to get the error when encountered
			try {
				// if button clicked is up
				if (e.getSource() == mapView.up) {

					// checks whether the panel on top is an obstacle by calling a method
					if (panelBrickChecker(mapView.map[row-1][col]) == true) {
						System.out.println("You cannot pass");
					}
					
					// checks whether the panel on top is a health totem by calling a method
					else if (panelHeartChecker(mapView.map[row-1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.hearts.remove(mapView.map[row-1][col]);
						
						//updates the value for the coordinates
						row--;
						
						// displays a message and heals the companions
						mapView.displayEncounterMessage("Health");
						heal(player);
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on top is a Kirin encounter by calling a method
					else if (panelKirinChecker(mapView.map[row-1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.kirinList.remove(mapView.map[row-1][col]);
						
						//updates the value for the coordinates
						row--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('K');
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on top is a Yume encounter by calling a method
					else if (panelYumeChecker(mapView.map[row-1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.yumeList.remove(mapView.map[row-1][col]);
						
						//updates the value for the coordinates
						row--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('Y');
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on top is a Yuki Encounter by calling a method
					else if (panelYukisChecker(mapView.map[row-1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.yukisList.remove(mapView.map[row-1][col]);
						
						//updates the value for the coordinates
						row--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('I');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on top is a Same encounter by calling a method
					else if (panelSameChecker(mapView.map[row-1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.sameList.remove(mapView.map[row-1][col]);
						
						//updates the value for the coordinates
						row--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('S');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					else {
						//updates the value for the coordinates
						row--;
						System.out.println(row);
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
				}
				// if button clicked is down
				else if (e.getSource() == mapView.down) {
					// checks whether the panel down is an obstacle by calling a method
					if (panelBrickChecker(mapView.map[row+1][col]) == true){
						System.out.println("You cannot pass");
					}
					// checks whether the panel down is a health totem by calling a method
					else if (panelHeartChecker(mapView.map[row+1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.hearts.remove(mapView.map[row+1][col]);
						
						//updates the value for the coordinates
						row++;
						
						// displays a message and heals the companions
						mapView.displayEncounterMessage("Health");
						heal(player);
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel down is a Kirin encounter by calling a method
					else if (panelKirinChecker(mapView.map[row+1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.kirinList.remove(mapView.map[row+1][col]);
						
						//updates the value for the coordinates
						row++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('K');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel down is a Yumi encounter by calling a method
					else if (panelYumeChecker(mapView.map[row+1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.yumeList.remove(mapView.map[row+1][col]);
						
						//updates the value for the coordinates
						row++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('Y');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel down is a Yuki encounter by calling a method
					else if (panelYukisChecker(mapView.map[row+1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.yukisList.remove(mapView.map[row+1][col]);
						
						//updates the value for the coordinates
						row++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('I');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel down is a Same encounter by calling a method
					else if (panelSameChecker(mapView.map[row+1][col]) == true) {
						// removes the certain panel in the arraylist
						mapView.sameList.remove(mapView.map[row+1][col]);
						
						//updates the value for the coordinates
						row++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('S');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel down is the finish line by calling a method
					else if (panelEndChecker(mapView.map[row+1][col]) == true) {
						//updates the value for the coordinates
						row++;
						
						// initiates the ending
						mapView.displayEndMessage("CONGRATULATIONS! YOU HAVE FINISHED THE GAME! WELL DONE!");
						endingSequence();
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					else{
						//updates the value for the coordinates
						row++;
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					
				}
				// if button clicked is left
				else if (e.getSource() == mapView.left) {
					// checks whether the panel on the left is an obstacle by calling a method
					if (panelBrickChecker(mapView.map[row][col-1]) == true){
						System.out.println("You cannot pass");
					}
					// checks whether the panel on the left is a health totem by calling a method
					else if (panelHeartChecker(mapView.map[row][col-1]) == true) {
						// removes the certain panel in the arraylist
						mapView.hearts.remove(mapView.map[row][col-1]);
						
						//updates the value for the coordinates
						col--;
						
						// displays a message and heals the companions
						mapView.displayEncounterMessage("Health");
						heal(player);

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the left is a Kirin encounter by calling a method
					else if (panelKirinChecker(mapView.map[row][col-1]) == true) {
						// removes the certain panel in the arraylist
						mapView.kirinList.remove(mapView.map[row][col-1]);
						
						//updates the value for the coordinates
						col--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('K');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the left is a Yume encounter by calling a method
					else if (panelYumeChecker(mapView.map[row][col-1]) == true) {
						// removes the certain panel in the arraylist
						mapView.yumeList.remove(mapView.map[row][col-1]);
						
						//updates the value for the coordinates
						col--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('Y');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the left is a Yuki encounter by calling a method
					else if (panelYukisChecker(mapView.map[row][col-1]) == true) {
						// removes the certain panel in the arraylist
						mapView.yukisList.remove(mapView.map[row][col-1]);
						
						//updates the value for the coordinates
						col--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('I');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the left is a Same encounter by calling a method
					else if (panelSameChecker(mapView.map[row][col-1]) == true) {
						// removes the certain panel in the arraylist
						mapView.sameList.remove(mapView.map[row][col-1]);
						
						//updates the value for the coordinates
						col--;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('S');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					else {
						//updates the value for the coordinates
						col--;

						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
				}
				// if button clicked is right
				else if (e.getSource() == mapView.right) {
					// checks whether the panel on the right is an obstacle by calling a method
					if (panelBrickChecker(mapView.map[row][col+1]) == true){
						System.out.println("You cannot pass");
					}
					// checks whether the panel on the right is a health totem by calling a method
					else if (panelHeartChecker(mapView.map[row][col+1]) == true) {
						// removes the certain panel in the arraylist
						mapView.hearts.remove(mapView.map[row][col+1]);
						
						//updates the value for the coordinates
						col++;
						
						// displays a message and heals the companions
						mapView.displayEncounterMessage("Health");
						heal(player);
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the right is a Kirin encounter by calling a method
					else if (panelKirinChecker(mapView.map[row][col+1]) == true) {
						// removes the certain panel in the arraylist
						mapView.kirinList.remove(mapView.map[row][col+1]);
						
						//updates the value for the coordinates
						col++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('K');

						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the right is a Yume encounter by calling a method
					else if (panelYumeChecker(mapView.map[row][col+1]) == true) {
						// removes the certain panel in the arraylist
						mapView.yumeList.remove(mapView.map[row][col+1]);
						
						//updates the value for the coordinates
						col++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('Y');
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the right is a Yuki encounter by calling a method
					else if (panelYukisChecker(mapView.map[row][col+1]) == true) {
						// removes the certain panel in the arraylist
						mapView.yukisList.remove(mapView.map[row][col+1]);
						
						//updates the value for the coordinates
						col++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('I');
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the right is a Same encounter by calling a method
					else if (panelSameChecker(mapView.map[row][col+1]) == true) {
						//updates the value for the coordinates
						mapView.sameList.remove(mapView.map[row][col+1]);
						
						// updates the value for the coordinates
						col++;
						
						// initiates encounter 
						mapView.displayEncounterMessage("ENCOUNTER");
						encounterSequence('S');

						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					// checks whether the panel on the right is the finishline by calling a method
					else if (panelEndChecker(mapView.map[row][col+1]) == true) {
						//updates the value for the coordinates
						col++;
						

						// initiates the ending	
						mapView.displayEndMessage("CONGRATULATIONS! YOU HAVE FINISHED THE GAME! WELL DONE!");
						endingSequence();
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
					else {
						//updates the value for the coordinates
						col++;
						
						// updates the players position in the map
						mapView.map[row][col].add(mapView.playerPos);
						mapView.repaint();
					}
			}
			}	
			catch (Exception ex) {
				// gets the error
				System.out.println(ex);
				
				// displays a message 
				mapView.displayErrorMessage("TRY AGAIN");
			}
			
		}
		
		/**
	     * Heals all of the companions of the player.
	     *
	     * @param companions the companions
	     * @param player the player
	     */
    public void heal(Player player) {
    	for (int i = 0; i < 3; i++) 
    		player.playerCompanions[i].setHealth(50);
    	
    	JOptionPane.showMessageDialog(null, "Congratulations, " + player.name + "!!" +
    		    "All your companions are back to full health!");
    }
		
		/**
		 * 
		 * @param panel is used to determine if a panel is a heath totem
		 * @return a boolean to determine whether it is a health totem or not
		 */
		private boolean panelHeartChecker(JPanel panel){
			if(mapView.hearts.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is an obstacle
		 * @return a boolean to determine whether it is an obstacle or not
		 */
		private boolean panelBrickChecker(JPanel panel){
			if(mapView.brickList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is a Kirin encounter
		 * @return a boolean to determine whether it is a Kirin encounter or not
		 */
		private boolean panelKirinChecker(JPanel panel){
			if(mapView.kirinList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is a Yume encounter
		 * @return a boolean to determine whether it is a Yume encounter or not
		 */
		private boolean panelYumeChecker(JPanel panel){
			if(mapView.yumeList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is a Yuki encounter
		 * @return a boolean to determine whether it is a Yuki encounter or not
		 */
		private boolean panelYukisChecker(JPanel panel){
			if(mapView.yukisList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is a Same encounter
		 * @return a boolean to determine whether it is a Same encounter or not
		 */
		private boolean panelSameChecker(JPanel panel){
			if(mapView.sameList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		/**
		 * 
		 * @param panel is used to determine if a panel is the finish line
		 * @return a boolean to determine whether it is the finish line or not
		 */
		private boolean panelEndChecker(JPanel panel){
			if(mapView.endList.contains(panel)){
				return true;
			} else {
				return false;
			}
		}
		
	}
	
}