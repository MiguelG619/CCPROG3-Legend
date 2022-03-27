package Game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

/**
 * The Class ChooseCompanionFighterView.
 */
@SuppressWarnings("serial")
public class EncounterView extends JFrame {
	
	/** The enemy companion image. */
	public JLabel enemyCompanionImage;
	
	/** The enemy name. */
	public JLabel enemyName;
	
	/** The button choose. */
	public JButton buttonChoose;
	
	/** The list companions description. */
	public JPanel listCompanionsDescription;
	
	/** The layered panel 2. */
	public JPanel layeredPanel2;
	
	/** The layered panel 1. */
	public JPanel layeredPanel1; 
	
	/** The button companion 1. */
	public JButton buttonCompanion1;
	
	/** The button companion 2. */
	public JButton buttonCompanion2;
	
	/** The button companion 3. */
	public JButton buttonCompanion3;
	
	/** The companion stats panel. */
	public JPanel companionStatsPanel;
	
	/** The companion num health. */
	public JLabel companionNumHealth;
	
	/** The companion type. */
	public JLabel companionType;
	
	/** The confirm button. */
	public JButton confirmButton;


	/** The content pane. */
	private JPanel contentPane;
	
	/** The companion name. */
	public JLabel companionName;
	
	/** The companion stats description 2. */
	private JLabel companionStatsDescription2;
	
	/** The pick again button. */
	public JButton pickAgainButton;
	
	/** The player companion panel. */
	private JPanel playerCompanionPanel;
	
	/** The dash label 1. */
	private JLabel dashLabel1;
	
	/** The player companion type. */
	public JLabel playerCompanionType;
	
	/** The enemy panel. */
	private JPanel enemyPanel;
	
	/** The dash. */
	private JLabel dash;
	
	/** The enemy type. */
	public JLabel enemyType;
	
	/** The enemy companion name. */
	public JLabel enemyCompanionName;
	
	/** The hp label. */
	private JLabel hpLabel;
	
	/** The enemy HP bar. */
	public JProgressBar enemyHPBar;
	
	/** The vs label. */
	private JLabel vsLabel;
	
	/** The companion name label. */
	public JLabel companionNameLabel;
	
	/** The companion HP bar. */
	public JProgressBar companionHPBar;
	
	/** The companion HP label. */
	public JLabel companionHPLabel;
	
	/** The companion image. */
	public JLabel companionImage;
	
	/** The attack panel. */
	public JPanel attackPanel;
	
	/** The description attack label. */
	private JLabel descriptionAttackLabel;
	
	/** The damage panel. */
	public JPanel damagePanel;
	
	/** The damage description text. */
	public JLabel damageDescriptionText;
	
	/** The num damage dealt. */
	public JLabel numDamageDealt;
	
	/** The damage description 2. */
	private JLabel damageDescription2;
	
	/** The turn label. */
	public JLabel turnLabel;
	
	/** The turn damage label. */
	public JLabel turnDamageLabel;
	
	/** The btn next. */
	public JButton btnNext;
	
	/** The attack next button. */
	public JButton attackNextButton;
	
	/** The companion dealt description. */
	private JLabel companionDealtDescription;
	
	/** The fainted panel. */
	public JPanel faintedPanel;

	/** The player status label. */
	public JLabel playerStatusLabel;
	
	/** The end description. */
	public JLabel endDescription;
	
	/** The who won label. */
	public JLabel whoWonLabel;
	
	/** The after encounter button. */
	public JButton afterEncounterButton;

	/** The enemy type label. */
	public JLabel enemyTypeLabel;


	/**
	 * Create the choose companion fighter frame.
	 */
	public EncounterView() {
		//initiates the properties of the JFrame
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 515);
		setResizable(false);
		//initiates the properties of the contentPane
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		layeredPanel1 = new JPanel();
		layeredPanel1.setBackground(Color.WHITE);
		

		enemyCompanionImage = new JLabel("Enemy companion");
		
		playerCompanionPanel = new JPanel();
		
		//initiates the properties of the enemyPanel
		enemyPanel = new JPanel();
		
		dash = new JLabel("-");
		dash.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		enemyType = new JLabel("Fire");
		enemyType.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		enemyCompanionName = new JLabel("Same");
		enemyCompanionName.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		hpLabel = new JLabel("HP");
		hpLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		//initiates the properties of the enemy hp bar
		enemyHPBar = new JProgressBar(0, 50);
		enemyHPBar.setValue(50);
		enemyHPBar.setStringPainted(true);
		enemyHPBar.setBackground(new Color(255, 0, 0));
		
		enemyTypeLabel = new JLabel(" ");
		enemyTypeLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		//initiates the layout of the enemyPanel
		GroupLayout gl_enemyPanel = new GroupLayout(enemyPanel);
		gl_enemyPanel.setHorizontalGroup(
			gl_enemyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_enemyPanel.createSequentialGroup()
					.addGap(19)
					.addComponent(enemyCompanionName, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dash, GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(enemyTypeLabel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(132)
					.addComponent(enemyType, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
				.addGroup(gl_enemyPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(hpLabel)
					.addGap(4)
					.addComponent(enemyHPBar, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_enemyPanel.setVerticalGroup(
			gl_enemyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_enemyPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_enemyPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(enemyCompanionName)
						.addComponent(dash, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(enemyType, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(enemyTypeLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_enemyPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(hpLabel)
						.addComponent(enemyHPBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		enemyPanel.setLayout(gl_enemyPanel);
		
		//initiates the properties of the vsLabel
		vsLabel = new JLabel("VS");
		vsLabel.setForeground(new Color(128, 0, 0));
		vsLabel.setBackground(new Color(128, 0, 0));
		vsLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 50));
		
		companionImage = new JLabel(" ");
		//initiates the layout of the enemyPanel
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(playerCompanionPanel, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(vsLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(enemyPanel, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
							.addGap(11))
						.addComponent(layeredPanel1, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE))
					.addGap(15))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(49)
					.addComponent(companionImage, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
					.addComponent(enemyCompanionImage, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(vsLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(playerCompanionPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(enemyPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(companionImage, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addComponent(enemyCompanionImage, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(layeredPanel1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		//initiates the companion stats panel
		companionNameLabel = new JLabel(" ");
		companionNameLabel.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		companionHPBar = new JProgressBar(0, 50);
		companionHPBar.setStringPainted(true);
		companionHPBar.setBackground(new Color(0, 255, 0));
		
		companionHPLabel = new JLabel("HP");
		companionHPLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		dashLabel1 = new JLabel("-");
		dashLabel1.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		playerCompanionType = new JLabel(" ");

		playerCompanionType.setFont(new Font("Dialog", Font.PLAIN, 24));
		GroupLayout gl_playerCompanionPanel = new GroupLayout(playerCompanionPanel);
		gl_playerCompanionPanel.setHorizontalGroup(
			gl_playerCompanionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_playerCompanionPanel.createSequentialGroup()
					.addGroup(gl_playerCompanionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_playerCompanionPanel.createSequentialGroup()
							.addGap(19)
							.addComponent(companionNameLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dashLabel1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(playerCompanionType, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_playerCompanionPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(companionHPLabel)
							.addGap(3)
							.addComponent(companionHPBar, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_playerCompanionPanel.setVerticalGroup(
			gl_playerCompanionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_playerCompanionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_playerCompanionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(companionNameLabel)
						.addGroup(gl_playerCompanionPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(dashLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(playerCompanionType, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_playerCompanionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(companionHPLabel)
						.addComponent(companionHPBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		playerCompanionPanel.setLayout(gl_playerCompanionPanel);
		layeredPanel1.setLayout(new CardLayout(0, 0));
		
		//initiates the properties of the encounterDescription
		JPanel encounterDescription = new JPanel();
		layeredPanel1.add(encounterDescription, "name_445500475988300");
		
		JLabel encounterDescription1 = new JLabel("A wild");
		encounterDescription1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		enemyName = new JLabel("Same");
		enemyName.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JLabel encounterDescription2 = new JLabel("has appeared!!!");
		encounterDescription2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel encounterDescription3 = new JLabel("Choose your companion!");
		encounterDescription3.setFont(new Font("Dialog", Font.PLAIN, 26));
		encounterDescription3.setForeground(new Color(0, 0, 0));
		
		// initiates the button choose
		buttonChoose = new JButton("Choose");
		buttonChoose.setFont(new Font("Dialog", Font.PLAIN, 20));
		buttonChoose.setForeground(new Color(0, 0, 0));
		//initiates the layout of the encounterDescription
		GroupLayout gl_encounterDescription = new GroupLayout(encounterDescription);
		gl_encounterDescription.setHorizontalGroup(
			gl_encounterDescription.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_encounterDescription.createSequentialGroup()
					.addGap(98)
					.addGroup(gl_encounterDescription.createParallelGroup(Alignment.TRAILING)
						.addComponent(encounterDescription3, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
						.addGroup(gl_encounterDescription.createSequentialGroup()
							.addComponent(encounterDescription1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(enemyName)
							.addGap(5)
							.addComponent(encounterDescription2)
							.addGap(12)))
					.addGap(405))
				.addGroup(gl_encounterDescription.createSequentialGroup()
					.addGap(281)
					.addComponent(buttonChoose, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(436, Short.MAX_VALUE))
		);
		gl_encounterDescription.setVerticalGroup(
			gl_encounterDescription.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_encounterDescription.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_encounterDescription.createParallelGroup(Alignment.BASELINE)
						.addComponent(enemyName)
						.addComponent(encounterDescription1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(encounterDescription2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(encounterDescription3)
					.addGap(18)
					.addComponent(buttonChoose, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		encounterDescription.setLayout(gl_encounterDescription);
		
		//initiates the properties of the layeredPanel2
		layeredPanel2 = new JPanel();
		layeredPanel1.add(layeredPanel2, "name_446156441433000");
		layeredPanel2.setLayout(new CardLayout(0, 0));
		
		listCompanionsDescription = new JPanel();
		layeredPanel2.add(listCompanionsDescription, "name_446769491357600");
		
		// Initiates the buttons where the player may select their desired companion for battle
		buttonCompanion1 = new JButton("1");
		buttonCompanion1.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		JLabel playerCompanionDescription = new JLabel("Your companions are...");
		playerCompanionDescription.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		buttonCompanion2 = new JButton("2");
		buttonCompanion2.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		buttonCompanion3 = new JButton("3");
		buttonCompanion3.setFont(new Font("Dialog", Font.PLAIN, 30));
		//initiates the layout of the listCompanionsDescription
		GroupLayout gl_listCompanionsDescription = new GroupLayout(listCompanionsDescription);
		gl_listCompanionsDescription.setHorizontalGroup(
			gl_listCompanionsDescription.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listCompanionsDescription.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_listCompanionsDescription.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_listCompanionsDescription.createSequentialGroup()
							.addComponent(buttonCompanion1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
							.addComponent(buttonCompanion2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(103)
							.addComponent(buttonCompanion3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(65))
						.addGroup(gl_listCompanionsDescription.createSequentialGroup()
							.addComponent(playerCompanionDescription, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(210, Short.MAX_VALUE))))
		);
		gl_listCompanionsDescription.setVerticalGroup(
			gl_listCompanionsDescription.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_listCompanionsDescription.createSequentialGroup()
					.addGap(15)
					.addComponent(playerCompanionDescription, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_listCompanionsDescription.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonCompanion1)
						.addComponent(buttonCompanion2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonCompanion3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		listCompanionsDescription.setLayout(gl_listCompanionsDescription);
		
		// sets the properties of the companionStatsPanel with its descriptions, layout and buttons
		companionStatsPanel =  new JPanel();
		layeredPanel2.add(companionStatsPanel, "name_446815777768900");
		
		JLabel companionStatsDescription = new JLabel("Your");
		companionStatsDescription.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JLabel companionHealthDescription = new JLabel("Health: ");
		companionHealthDescription.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JLabel companionTypeDescription = new JLabel("Type:");
		companionTypeDescription.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		companionNumHealth = new JLabel("Health: ");
		companionNumHealth.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		companionType = new JLabel("change");
		companionType.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		confirmButton = new JButton("Confirm");
		confirmButton.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		companionName = new JLabel("Same's");
		companionName.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		companionStatsDescription2 = new JLabel("stats are...");
		companionStatsDescription2.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		// sets the properties of the companionStatsPanel with its descriptions and layout
		pickAgainButton = new JButton("Pick again");
		pickAgainButton.setForeground(Color.BLACK);
		pickAgainButton.setFont(new Font("Dialog", Font.PLAIN, 26));
		GroupLayout gl_companionStatsPanel = new GroupLayout(companionStatsPanel);
		gl_companionStatsPanel.setHorizontalGroup(
			gl_companionStatsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_companionStatsPanel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_companionStatsPanel.createSequentialGroup()
							.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_companionStatsPanel.createSequentialGroup()
									.addGap(22)
									.addComponent(companionTypeDescription))
								.addGroup(gl_companionStatsPanel.createSequentialGroup()
									.addGap(6)
									.addComponent(companionHealthDescription)))
							.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_companionStatsPanel.createSequentialGroup()
									.addGap(3)
									.addComponent(companionType, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
									.addComponent(pickAgainButton)
									.addGap(35)
									.addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
									.addGap(32))
								.addGroup(gl_companionStatsPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(companionNumHealth, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_companionStatsPanel.createSequentialGroup()
							.addComponent(companionStatsDescription)
							.addGap(11)
							.addComponent(companionName, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(companionStatsDescription2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_companionStatsPanel.setVerticalGroup(
			gl_companionStatsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_companionStatsPanel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(companionStatsDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(companionName, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addComponent(companionStatsDescription2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(companionHealthDescription, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(companionNumHealth, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_companionStatsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(pickAgainButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(companionTypeDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(companionType, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(25))
		);
		companionStatsPanel.setLayout(gl_companionStatsPanel);
		
		// sets the properties of the attackPanel with its descriptions, layout and buttons
		attackPanel = new JPanel();
		layeredPanel2.add(attackPanel, "name_546635077215399");
		
		descriptionAttackLabel = new JLabel("turn to ATTACK!!");
		descriptionAttackLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		
		attackNextButton = new JButton("ATTACK");
		attackNextButton.setFont(new Font("Dialog", Font.BOLD, 26));
		
		turnLabel = new JLabel("Your");
		turnLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		GroupLayout gl_attackPanel = new GroupLayout(attackPanel);
		gl_attackPanel.setHorizontalGroup(
			gl_attackPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_attackPanel.createSequentialGroup()
					.addGap(51)
					.addComponent(turnLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(descriptionAttackLabel, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_attackPanel.createSequentialGroup()
					.addContainerGap(519, Short.MAX_VALUE)
					.addComponent(attackNextButton, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		gl_attackPanel.setVerticalGroup(
			gl_attackPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_attackPanel.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_attackPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(descriptionAttackLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(turnLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(attackNextButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		attackPanel.setLayout(gl_attackPanel);
		
		// sets the properties of the damagePanel with its descriptions, layout and buttons
		damagePanel = new JPanel();
		layeredPanel2.add(damagePanel, "name_547273724164100");
		
		damageDescriptionText = new JLabel("It was super effective!");
		damageDescriptionText.setFont(new Font("Dialog", Font.ITALIC, 30));
		
		numDamageDealt = new JLabel("10");
		numDamageDealt.setForeground(new Color(255, 0, 0));
		numDamageDealt.setFont(new Font("Dialog", Font.BOLD, 30));
		
		damageDescription2 = new JLabel("damage!!!");
		damageDescription2.setForeground(new Color(255, 0, 0));
		damageDescription2.setFont(new Font("Dialog", Font.BOLD, 30));
		
		turnDamageLabel = new JLabel("Your");
		turnDamageLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Dialog", Font.ITALIC, 26));
		
		companionDealtDescription = new JLabel("companion dealt");
		companionDealtDescription.setFont(new Font("Dialog", Font.BOLD, 30));
		GroupLayout gl_damagePanel = new GroupLayout(damagePanel);
		gl_damagePanel.setHorizontalGroup(
			gl_damagePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_damagePanel.createSequentialGroup()
					.addGroup(gl_damagePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_damagePanel.createSequentialGroup()
							.addGap(66)
							.addComponent(turnDamageLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(companionDealtDescription)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(numDamageDealt)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(damageDescription2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_damagePanel.createSequentialGroup()
							.addGap(57)
							.addComponent(damageDescriptionText, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_damagePanel.setVerticalGroup(
			gl_damagePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_damagePanel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_damagePanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(turnDamageLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(companionDealtDescription, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(numDamageDealt, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(damageDescription2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_damagePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(damageDescriptionText, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		damagePanel.setLayout(gl_damagePanel);
		
		// sets the properties of the companionStatsPanel with its descriptions, layout and buttons
		faintedPanel = new JPanel();
		layeredPanel2.add(faintedPanel, "name_64638495283400");
		
		whoWonLabel = new JLabel("Enemy");
		whoWonLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		
		JLabel faintedDesciprtion1 = new JLabel("companion has");
		faintedDesciprtion1.setFont(new Font("Dialog", Font.BOLD, 30));
		
		JLabel faintedDescription2 = new JLabel("FAINTED!!!");
		faintedDescription2.setForeground(Color.RED);
		faintedDescription2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		
		JLabel playerDecription1 = new JLabel("You");
		playerDecription1.setFont(new Font("Dialog", Font.BOLD, 30));
		
		playerStatusLabel = new JLabel("WIN!!!");
		playerStatusLabel.setForeground(Color.GREEN);
		playerStatusLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		
		endDescription = new JLabel("CONGRATULATIONS \"player\"");
		endDescription.setForeground(Color.ORANGE);
		endDescription.setFont(new Font("Dialog", Font.BOLD, 30));
		
		afterEncounterButton = new JButton("Next");
		afterEncounterButton.setFont(new Font("Dialog", Font.ITALIC, 26));
		GroupLayout gl_faintedPanel = new GroupLayout(faintedPanel);
		gl_faintedPanel.setHorizontalGroup(
			gl_faintedPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_faintedPanel.createSequentialGroup()
					.addGroup(gl_faintedPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_faintedPanel.createSequentialGroup()
							.addGap(86)
							.addComponent(endDescription, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(afterEncounterButton))
						.addGroup(gl_faintedPanel.createSequentialGroup()
							.addGroup(gl_faintedPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_faintedPanel.createSequentialGroup()
									.addGap(240)
									.addComponent(playerDecription1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(playerStatusLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_faintedPanel.createSequentialGroup()
									.addGap(128)
									.addComponent(whoWonLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(faintedDesciprtion1)))
							.addGap(6)
							.addComponent(faintedDescription2, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		gl_faintedPanel.setVerticalGroup(
			gl_faintedPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_faintedPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_faintedPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(whoWonLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(faintedDesciprtion1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(faintedDescription2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_faintedPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(playerStatusLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(playerDecription1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_faintedPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(endDescription, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(afterEncounterButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		faintedPanel.setLayout(gl_faintedPanel);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	/**
	 * Choose companion listener.
	 *
	 * @param chooseCompanionButton the choose companion button
	 */
	public void chooseCompanionListener(ActionListener chooseCompanionButton) {
		buttonChoose.addActionListener(chooseCompanionButton);
	}
	
	/**
	 * Pick again button listener.
	 *
	 * @param pickAgain the pick again
	 */
	public void pickAgainButtonListener(ActionListener pickAgain) {
		pickAgainButton.addActionListener(pickAgain);
	}
	
	/**
	 * Button companion 1 listener.
	 *
	 * @param buttonCompanion1Button the button companion 1 button
	 */
	public void buttonCompanion1Listener(ActionListener buttonCompanion1Button) {
		buttonCompanion1.addActionListener(buttonCompanion1Button);
	}
	
	/**
	 * Button companion 2 listener.
	 *
	 * @param buttonCompanion2Button the button companion 2 button
	 */
	public void buttonCompanion2Listener(ActionListener buttonCompanion2Button) {
		buttonCompanion2.addActionListener(buttonCompanion2Button);
	}
	
	/**
	 * Button companion 3 listener.
	 *
	 * @param buttonCompanion3Button the button companion 3 button
	 */
	public void buttonCompanion3Listener(ActionListener buttonCompanion3Button) {
		buttonCompanion3.addActionListener(buttonCompanion3Button);
	}
	
	/**
	 * Confirm button listener.
	 *
	 * @param confirm the confirm
	 */
	public void confirmButtonListener(ActionListener confirm) {
		confirmButton.addActionListener(confirm);
	}
	 
	/**
	 * Attack next button listener.
	 *
	 * @param attackNext the attack next
	 */
	public void attackNextButtonListener(ActionListener attackNext) {
		attackNextButton.addActionListener(attackNext);
	}
	
	/**
	 * Button next listener.
	 *
	 * @param buttonNext the button next
	 */
	public void buttonNextListener(ActionListener buttonNext) {
		btnNext.addActionListener(buttonNext);
	}
	
	/**
	 * Button next listener.
	 *
	 * @param buttonNext the button next
	 */
	public void afterEncounterListener(ActionListener afterEncounter) {
		afterEncounterButton.addActionListener(afterEncounter);
	}
}
