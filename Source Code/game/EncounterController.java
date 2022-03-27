package Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import map.MapView;

/**
 * The Class ChooseCompanionFighterController.
 */
public class EncounterController {
	
	/** The view. */
	private EncounterView view;
	
	/** The player. */
	private Player player;
	
	/** The chosen companion. */
	private Companion chosenCompanion;
	
	/** The enemy companion fighter. */
	private Companion enemy;
	
	/** The turn. */
	private int turn = 2;
	
	private MapView mapView;

	
	/**
	 * Instantiates a new choose companion fighter controller.
	 *
	 * @param view the view
	 * @param player the player
	 */
	public EncounterController(EncounterView view, Player player, Companion enemy, MapView mapView) {
		this.view = view;
		this.player = player;
		this.enemy = enemy;
		this.mapView = mapView;
		
		
		//initiates the player companion buttons
		initiatePlayerCompanionButtons();
		
		//initiate enemy stats
		initiateEnemyStats(enemy);
	
		//Initiates the action listeners for the buttons
		view.chooseCompanionListener(new ChooseCompanionListener());
		view.pickAgainButtonListener(new ChooseCompanionListener());
		view.buttonCompanion1Listener(new ButtonCompanion1Listener());
		view.buttonCompanion2Listener(new ButtonCompanion2Listener());
		view.buttonCompanion3Listener(new ButtonCompanion3Listener());
		view.confirmButtonListener(new ConfirmButtonListener());
		view.attackNextButtonListener(new AttackNextButtonListener());
		view.buttonNextListener(new ButtonNextListener());
		view.afterEncounterListener(new AfterEncounterListener());
	
	}
	
	/**
	 * Initiate enemy stats.
	 *
	 * @param enemyCompanion the enemy companion
	 */
	private void initiateEnemyStats(Companion enemyCompanion) {
		view.enemyCompanionName.setText(enemyCompanion.name);
		view.enemyTypeLabel.setText(enemyCompanion.type);
		view.enemyCompanionImage.setIcon(enemyCompanion.image);
	}
	
	/**
	 * Initiate player companion buttons.
	 */
	private void initiatePlayerCompanionButtons() {
		view.buttonCompanion1.setText(player.playerCompanions[0].name);
		view.buttonCompanion2.setText(player.playerCompanions[1].name);
		view.buttonCompanion3.setText(player.playerCompanions[2].name);
	}

	
	/**
	 * Check companion health.
	 *
	 * @param companion the companion index
	 */
	private void checkCompanionHealth(int companion) {
		if (player.playerCompanions[companion].health == 0)
			view.confirmButton.setVisible(false);		
	}
	

	/**
	 * Damage description.
	 *
	 * @param damage the damage
	 */
	private void damageDescription(int damage) {
		if (damage == 0) 
			view.damageDescriptionText.setText("Better luck next time...");
		else if (damage >= 1 && damage <= 5)
			view.damageDescriptionText.setText("It was a good try...");	
		else if (damage >= 6 && damage <= 7) 
			view.damageDescriptionText.setText("It was mildly effective!");
		else if (damage >= 8 && damage <= 10)
			view.damageDescriptionText.setText("It was super effective!!");
	}
	
	/**
	 * Sets the chosen companion.
	 *
	 * @param companion the new chosen companion
	 */
	private void setChosenCompanion(Companion companion) {
		chosenCompanion = companion;
	}
	
	/**
	 * Sets the companion stats.
	 *
	 * @param chosenCompanion the chosen companion
	 */
	private void setCompanionStats(Companion chosenCompanion) {
		view.companionImage.setIcon(chosenCompanion.image);
		view.companionNumHealth.setText(Integer.toString(chosenCompanion.health));
		view.companionType.setText(chosenCompanion.type);
		view.companionName.setText(chosenCompanion.name + "'s");
		view.companionHPBar.setValue(chosenCompanion.health);
	}
	
	/**
	 * Adds the panel encounter.
	 *
	 * @param panel the panel to be added
	 */
	private void addPanelEncounter(String panel) {
		 
		view.layeredPanel1.removeAll();
		
		if (panel.equals("listCompanionsDescription"))
			view.layeredPanel1.add(view.listCompanionsDescription);
		else if (panel.equals("companionStatsPanel"))
			view.layeredPanel1.add(view.companionStatsPanel);
		else if (panel.equals("attackPanel"))
			view.layeredPanel1.add(view.attackPanel);
		else if (panel.equals("faintedPanel"))
			view.layeredPanel1.add(view.faintedPanel);
		else if (panel.equals("damagePanel"))
			view.layeredPanel1.add(view.damagePanel);
		
		// replaces the elements in the layer
		view.layeredPanel1.repaint();
		view.layeredPanel1.revalidate();
	}
			
	
	/**
	 * The listener interface for receiving chooseCompanion events.
	 * The class that is interested in processing a chooseCompanion
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addChooseCompanionListener<code> method. When
	 * the chooseCompanion event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ChooseCompanionEvent
	 */
	class ChooseCompanionListener implements ActionListener {	
		
		/**
		 * Action performed.
		 *
		 * @param e the button
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			addPanelEncounter("listCompanionsDescription");
			view.confirmButton.setVisible(true);
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
	class ButtonCompanion1Listener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// sets the chosen Companion stats and checks if it is alive
			setChosenCompanion(player.playerCompanions[0]);
			checkCompanionHealth(0);
			setCompanionStats(chosenCompanion);
			addPanelEncounter("companionStatsPanel");
			
		}
	}
	
	/**
	 * The listener interface for receiving buttonCompanion2 events.
	 * The class that is interested in processing a buttonCompanion2
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonCompanion2Listener<code> method. When
	 * the buttonCompanion2 event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonCompanion2Event
	 */
	class ButtonCompanion2Listener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// sets the chosen Companion stats and checks if it is alive
			setChosenCompanion(player.playerCompanions[1]);
			checkCompanionHealth(1);
			setCompanionStats(chosenCompanion);
			addPanelEncounter("companionStatsPanel");
		}
	}
	
	/**
	 * The listener interface for receiving buttonCompanion3 events.
	 * The class that is interested in processing a buttonCompanion3
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonCompanion3Listener<code> method. When
	 * the buttonCompanion3 event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonCompanion3Event
	 */
	class ButtonCompanion3Listener implements ActionListener {		
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// sets the chosen Companion stats and checks if it is alive
			setChosenCompanion(player.playerCompanions[2]);
			checkCompanionHealth(2);
			setCompanionStats(chosenCompanion);
			addPanelEncounter("companionStatsPanel");
		}
	}
	
	/**
	 * The listener interface for receiving confirmButton events.
	 * The class that is interested in processing a confirmButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addConfirmButtonListener<code> method. When
	 * the confirmButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ConfirmButtonEvent
	 */
	class ConfirmButtonListener implements ActionListener {
		
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
			    	// if the player picks yes then set the companion's stats
			    	view.companionNameLabel.setText(chosenCompanion.name);
					view.playerCompanionType.setText(chosenCompanion.type);	
					view.companionHPBar.setValue(chosenCompanion.health);
					view.companionImage.setIcon(chosenCompanion.image);
					addPanelEncounter("attackPanel");
		    }
		}
	}
	
	/**
	 * The listener interface for receiving attackNextButton events.
	 * The class that is interested in processing a attackNextButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAttackNextButtonListener<code> method. When
	 * the attackNextButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AttackNextButtonEvent
	 */
	class AttackNextButtonListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//player's turn to attack
			if (turn % 2 == 0) {
				view.turnDamageLabel.setText("Your");
				int playerDamage = chosenCompanion.damage(chosenCompanion, enemy);
				view.numDamageDealt.setText(Integer.toString(playerDamage));
				enemy.health -= playerDamage;
				view.enemyHPBar.setValue(enemy.health);
				damageDescription(playerDamage);
			}
			// enemy turn's to attack
			else {
				view.turnDamageLabel.setText("Enemy");
				int enemyDamage = chosenCompanion.damage(chosenCompanion, enemy);
				view.numDamageDealt.setText(Integer.toString(enemyDamage));
				chosenCompanion.health -= enemyDamage;
				view.companionHPBar.setValue(chosenCompanion.health);
				damageDescription(enemyDamage);
			}

			turn++;
			addPanelEncounter("damagePanel");
			
			//sets the player's chosen companion's health after being damaged
			for (int i = 0; i < 3; i++)
				if (chosenCompanion.name.equals(player.playerCompanions[i].name))
					player.playerCompanions[i].setHealth(chosenCompanion.health);
		}
		
	}
		
	/**
	 * The listener interface for receiving buttonNext events.
	 * The class that is interested in processing a buttonNext
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonNextListener<code> method. When
	 * the buttonNext event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonNextEvent
	 */
	class ButtonNextListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		public void actionPerformed(ActionEvent e) {
			// Checks to see who wins
			// if enemy wins then set the message to enemy win
			if (enemy.health < 1) {
				view.whoWonLabel.setText("Enemy");
				view.playerStatusLabel.setText("WIN");
				view.playerStatusLabel.setForeground(Color.ORANGE);
				view.endDescription.setText("CONGRATULATIONS, " + player.name + "!!!");
				view.endDescription.setForeground(Color.ORANGE);
				addPanelEncounter("faintedPanel");
				mapView.up.setVisible(true);
		 	   	mapView.down.setVisible(true);
		 	   	mapView.left.setVisible(true);
		 	   	mapView.right.setVisible(true);

			}
			// if player's companion wins then set the message to player win
			else if (chosenCompanion.health < 1) {
				view.whoWonLabel.setText("Your");
				view.playerStatusLabel.setText("LOSE...");
				view.playerStatusLabel.setForeground(Color.RED);
				view.endDescription.setText("Better luck next time," + player.name + "...");
				view.endDescription.setForeground(Color.ORANGE);
				addPanelEncounter("faintedPanel");
				mapView.up.setVisible(true);
		 	   	mapView.down.setVisible(true);
		 	   	mapView.left.setVisible(true);
		 	   	mapView.right.setVisible(true);
			}
			// set that next turn
			else {
				if (turn % 2 == 0) {
					view.turnLabel.setText("Your");
					view.attackNextButton.setText("ATTTACK");
				}
				else {
					view.turnLabel.setText("Enemy");
					view.attackNextButton.setText("NEXT");
				}
				addPanelEncounter("attackPanel");
			}
		}
	}
	
	/**
	 * Check three companions alive.
	 *
	 * @param player the player
	 * @return true, if successful
	 */
	private boolean checkThreeCompanionsAlive(Player player) {
		int ctr = 0;
		for (int i = 0; i < 3; i++) 
			if (player.playerCompanions[i].getHealth() == 0)
				ctr++;
		
		if (ctr == 3)
			return true;
		
		return false;
	}
	
	/**
	 * The listener interface for receiving afterEncounterButton events.
	 * The class that is interested in processing a afterEncounterButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonCompanion2Listener<code> method. When
	 * the afterEncounterButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see afterEncounterEvent
	 */
	class AfterEncounterListener implements ActionListener {		
		/**
		 * Action performed.
		 *
		 * @param e the button pressed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// disposes the encounter
			view.dispose();
			
			if (checkThreeCompanionsAlive(player)) {
				new LoseController(new LoseView());
				mapView.dispose();
			}
		}
	}
	
}
