//package map;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//
//import Game.Companion;
//import Game.EncounterController;
//import Game.EncounterView;
//import Game.Player;
//
//public class MapController {
//    private MapView mapView;
//    private Player player;
//    private int row = 0, col = 0;
//
//    // added player
//    public MapController(MapView mapView, Player player) {
//        this.mapView = mapView;
//        this.player = player; 
//        
//        
//        mapView.moveActionListener(new listenMovement());
//    }
//    
//    /**
//     * Iniate player avatar.
//     *
//     * @param player the player
//     */
//    public void iniatePlayerAvatar(Player player) {
//    	
//    	if (player.avatarPreference.equals("male"))
//    	mapView.playerPos.setIcon(
//    			new ImageIcon(
//    					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\player.jpg"));
//    	else	
//        	mapView.playerPos.setIcon(
//        			new ImageIcon(
//        					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\player.jpg"));
//    }
//
//
//    /**
//     * Encounter sequence.
//     *
//     * @param initial the enemy companioninitial
//     */
//    public void encounterSequence(char initial) {
//    	EncounterView view = new EncounterView();
//    	Companion enemyCompanion = new Companion(initial);
//    	new EncounterController(view, player, enemyCompanion, mapView);
//    	view.setVisible(true);
//    	
//    	// hides the buttons so the player will not move
//    	mapView.up.setVisible(false);
// 	   	mapView.down.setVisible(false);
// 	   	mapView.left.setVisible(false);
// 	   	mapView.right.setVisible(false);
//    }
//    
//   /**
//    * Ending sequence.
//    */
//   public void endingSequence() {
//	   EndingView view = new EndingView();
//	   new EndingController(view, mapView);
//	   view.setVisible(true);
//	   
//	   // Removes the map GUI
//	   mapView.dispose();
//   }
//    
//    class listenMovement implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			try {
//				if (e.getSource() == mapView.up) {
//					if (panelBrickChecker(mapView.map[row-1][col]) == true) {
//						System.out.println("You cannot pass");
//					}
//					else if (panelHeartChecker(mapView.map[row-1][col]) == true) {
//						mapView.hearts.remove(mapView.map[row-1][col]);
//						row--;
//						mapView.displayEncounterMessage("Health");
//						
//						heal(player);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelKirinChecker(mapView.map[row-1][col]) == true) {
//						mapView.kirinList.remove(mapView.map[row-1][col]);
//						row--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('K');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYumeChecker(mapView.map[row-1][col]) == true) {
//						mapView.yumeList.remove(mapView.map[row-1][col]);
//						row--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('Y');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYukisChecker(mapView.map[row-1][col]) == true) {
//						mapView.yukisList.remove(mapView.map[row-1][col]);
//						row--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('I');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelSameChecker(mapView.map[row-1][col]) == true) {
//						mapView.sameList.remove(mapView.map[row-1][col]);
//						row--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('S');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else {
//						System.out.println("Up was clicked");
//						row--;
//						System.out.println(row);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//				}
//				else if (e.getSource() == mapView.down) {
//					if (panelBrickChecker(mapView.map[row+1][col]) == true){
//						System.out.println("You cannot pass");
//					}
//					else if (panelHeartChecker(mapView.map[row+1][col]) == true) {
//						mapView.hearts.remove(mapView.map[row+1][col]);
//						row++;
//						mapView.displayEncounterMessage("Health");
//						heal(player);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelKirinChecker(mapView.map[row+1][col]) == true) {
//						mapView.kirinList.remove(mapView.map[row+1][col]);
//						row++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('K');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYumeChecker(mapView.map[row+1][col]) == true) {
//						mapView.yumeList.remove(mapView.map[row+1][col]);
//						row++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('Y');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYukisChecker(mapView.map[row+1][col]) == true) {
//						mapView.yukisList.remove(mapView.map[row+1][col]);
//						row++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('I');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelSameChecker(mapView.map[row+1][col]) == true) {
//						mapView.sameList.remove(mapView.map[row+1][col]);
//						row++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('S');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					// checks whether the panel down is the finish line by calling a method
//					else if (panelEndChecker(mapView.map[row+1][col]) == true) {
//						//updates the value for the coordinates
//						row++;
//						
//						// displays a message
//						mapView.displayEndMessage("CONGRATULATIONS! YOU HAVE FINISHED THE GAME! WELL DONE!");
//						
//						endingSequence();
//						
//						// updates the players position in the map
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else{
//						System.out.println("Down was clicked");
//						row++;
//						System.out.println(row);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					
//				}
//				else if (e.getSource() == mapView.left) {
//					if (panelBrickChecker(mapView.map[row][col-1]) == true){
//						System.out.println("You cannot pass");
//					}
//					else if (panelHeartChecker(mapView.map[row][col-1]) == true) {
//						mapView.hearts.remove(mapView.map[row][col-1]);
//						col--;
//						mapView.displayEncounterMessage("Health");
//						heal(player);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelKirinChecker(mapView.map[row][col-1]) == true) {
//						mapView.kirinList.remove(mapView.map[row][col-1]);
//						col--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('K');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYumeChecker(mapView.map[row][col-1]) == true) {
//						mapView.yumeList.remove(mapView.map[row][col-1]);
//						col--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('Y');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYukisChecker(mapView.map[row][col-1]) == true) {
//						mapView.yukisList.remove(mapView.map[row][col-1]);
//						col--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('I');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelSameChecker(mapView.map[row][col-1]) == true) {
//						mapView.sameList.remove(mapView.map[row][col-1]);col--;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('S');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else {
//						System.out.println("Left was clicked");
//						col--;
//						System.out.println(col);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//				}
//				else if (e.getSource() == mapView.right) {
//					if (panelBrickChecker(mapView.map[row][col+1]) == true){
//						System.out.println("You cannot pass");
//					}
//					else if (panelHeartChecker(mapView.map[row][col+1]) == true) {
//						mapView.hearts.remove(mapView.map[row][col+1]);
//						col++;
//						mapView.displayEncounterMessage("Health");
//						heal(player);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelKirinChecker(mapView.map[row][col+1]) == true) {
//						mapView.kirinList.remove(mapView.map[row][col+1]);
//						col++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('K');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYumeChecker(mapView.map[row][col+1]) == true) {
//						mapView.yumeList.remove(mapView.map[row][col+1]);
//						col++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('Y');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelYukisChecker(mapView.map[row][col+1]) == true) {
//						mapView.yukisList.remove(mapView.map[row][col+1]);
//						col++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('I');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else if (panelSameChecker(mapView.map[row][col+1]) == true) {
//						mapView.sameList.remove(mapView.map[row][col+1]);
//						col++;
//						mapView.displayEncounterMessage("ENCOUNTER");
//						encounterSequence('S');
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					// checks whether the panel on the right is the finishline by calling a method
//					else if (panelEndChecker(mapView.map[row][col+1]) == true) {
//						//updates the value for the coordinates
//						col++;
//						
//						// displays a message
//						mapView.displayEndMessage("CONGRATULATIONS! YOU HAVE FINISHED THE GAME! WELL DONE!");
//						
//						endingSequence();
//						
//						// updates the players position in the map
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//					else {
//						System.out.println("Right was clicked");
//						col++;
//						System.out.println(col);
//						mapView.map[row][col].add(mapView.playerPos);
//						mapView.repaint();
//					}
//			}
//			}	
//			catch (Exception ex) {
//				System.out.println(ex);
//				mapView.displayErrorMessage("TRY AGAIN");
//			}
//			
//		}
//    
//		/**
//	     * Heals all of the companions of the player.
//	     *
//	     * @param companions the companions
//	     * @param player the player
//	     */
//    public void heal(Player player) {
//    	for (int i = 0; i < 3; i++) 
//    		player.playerCompanions[i].setHealth(50);
//    	
//    	JOptionPane.showMessageDialog(null, "Congratulations, " + player.name + "!!" +
//    		    "All your companions are back to full health!");
//    }
//    
//    private boolean panelHeartChecker(JPanel panel){
//		if(mapView.hearts.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	// checks whether the panel is a brick
//	private boolean panelBrickChecker(JPanel panel){
//		if(mapView.brickList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	private boolean panelKirinChecker(JPanel panel){
//		if(mapView.kirinList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	private boolean panelYumeChecker(JPanel panel){
//		if(mapView.yumeList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	private boolean panelYukisChecker(JPanel panel){
//		if(mapView.yukisList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	private boolean panelSameChecker(JPanel panel){
//		if(mapView.sameList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	/**
//	 * 
//	 * @param panel is used to determine if a panel is the finish line
//	 * @return a boolean to determine whether it is the finish line or not
//	 */
//	private boolean panelEndChecker(JPanel panel){
//		if(mapView.endList.contains(panel)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//}
//
//
//}
//
