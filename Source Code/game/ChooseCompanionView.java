package Game;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Font;

/**
 * The Class ChooseCompanionView.
 */
public class ChooseCompanionView {

	/** The frame. */
	public JFrame frame;
	
	/** The layered panel. */
	public JPanel layeredPanel;
	
	/** The kirin panel. */
	public JPanel kirinPanel;
	
	/** The yuki panel. */
	public JPanel yukiPanel;
	
	/** The yume panel. */
	public JPanel yumePanel;
	
	/** The same panel. */
	public JPanel samePanel;
	
	/** The kirin button. */
	private JButton kirinButton;
	
	/** The yume button. */
	private JButton yumeButton;
	
	/** The yuki button. */
	private JButton yukiButton;
	
	/** The same button. */
	private JButton sameButton;
	
	/** The same yes. */
	public JButton sameYes;
	
	/** The yume yes. */
	public JButton yumeYes;
	
	/** The yuki yes. */
	public JButton yukiYes;
	
	/** The kirin yes. */
	public JButton kirinYes;
	

	/**
	 * Create the application.
	 */
	public ChooseCompanionView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 765, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Choose Three Companions");
		frame.setResizable(false);
		
	
		// initiates the image of the companions
		kirinButton = new JButton("Kirin", new ImageIcon
				("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\kirin.png"));
		
		yumeButton = new JButton("Yume", new ImageIcon
				("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\yume.png"));
		
		yukiButton = new JButton("Yuki", new ImageIcon
				("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\yuki.png"));
		
		sameButton = new JButton("New button", new ImageIcon
				("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\zet.png"));
		
		// initiates the layered panel
		layeredPanel = new JPanel();

		// sets the properties and adds the layout buttons to the layeredPanel
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(104, Short.MAX_VALUE)
					.addComponent(kirinButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(yukiButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(65)
					.addComponent(yumeButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(sameButton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(layeredPanel, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(131)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(kirinButton)
						.addComponent(yukiButton)
						.addComponent(yumeButton)
						.addComponent(sameButton, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(layeredPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		layeredPanel.setLayout(new CardLayout(0, 0));
		
		
		//initiates the description of the panel
		JPanel descriptionPanel = new JPanel();
		layeredPanel.add(descriptionPanel, "name_114048426767800");
		
		JLabel label1 = new JLabel("Choose your three (3) companions!!");
		label1.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		JLabel label2 = new JLabel("(One of each companions only!)");
		label2.setFont(new Font("Dialog", Font.ITALIC, 16));
		// sets the layout of the descriptionPanel
		GroupLayout gl_descriptionPanel = new GroupLayout(descriptionPanel);
		gl_descriptionPanel.setHorizontalGroup(
			gl_descriptionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_descriptionPanel.createSequentialGroup()
					.addGroup(gl_descriptionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_descriptionPanel.createSequentialGroup()
							.addGap(35)
							.addComponent(label2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_descriptionPanel.createSequentialGroup()
							.addGap(98)
							.addComponent(label1)))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_descriptionPanel.setVerticalGroup(
			gl_descriptionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_descriptionPanel.createSequentialGroup()
					.addGap(39)
					.addComponent(label1)
					.addGap(59)
					.addComponent(label2)
					.addGap(21))
		);
		descriptionPanel.setLayout(gl_descriptionPanel);
		
		// sets the properties of the kirinPanel with its descriptions and button
		kirinPanel = new JPanel();
		layeredPanel.add(kirinPanel, "name_114151748015600");
		
		JLabel kirinDescription1 = new JLabel("Kirins are fire elemental creatures. ");
		kirinDescription1.setForeground(Color.BLACK);
		kirinDescription1.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		kirinYes = new JButton("Choose Kirin");
		kirinYes.setFont(new Font("Dialog", Font.PLAIN, 14));
		kirinYes.setBackground(Color.RED);
		
		JLabel kirinDescription2 = new JLabel("People who claimed to have seen such creatures have different accounts of their physical appearance.");
		kirinDescription2.setForeground(Color.RED);
		kirinDescription2.setFont(new Font("Dialog", Font.ITALIC, 14));
		
		JLabel lblNewLabel = new JLabel("Special skill: Blaze \u2013 burn an entire column of obstruction from where the player is standing");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		// sets the layout of the kirinPanel
		GroupLayout gl_kirinPanel = new GroupLayout(kirinPanel);
		gl_kirinPanel.setHorizontalGroup(
			gl_kirinPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_kirinPanel.createSequentialGroup()
					.addContainerGap(137, Short.MAX_VALUE)
					.addComponent(kirinDescription1)
					.addGap(135))
				.addGroup(gl_kirinPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(kirinDescription2, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_kirinPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_kirinPanel.createSequentialGroup()
					.addGap(264)
					.addComponent(kirinYes, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(278, Short.MAX_VALUE))
		);
		gl_kirinPanel.setVerticalGroup(
			gl_kirinPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_kirinPanel.createSequentialGroup()
					.addGap(12)
					.addComponent(kirinDescription1)
					.addGap(9)
					.addComponent(kirinDescription2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(kirinYes, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		kirinPanel.setLayout(gl_kirinPanel);
		
		// sets the properties of the yukiPanel with its descriptions and button
		yukiPanel = new JPanel();
		layeredPanel.add(yukiPanel, "name_114271693946800");
		
		JLabel yukiDescription1 = new JLabel("Yukis are dinosaur-like creatures of the earth element.");
		yukiDescription1.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JLabel yukiDescription2 = new JLabel("Though they look intimidating, they are actually the embodiment of happiness. ");
		yukiDescription2.setForeground(new Color(0, 128, 0));
		yukiDescription2.setFont(new Font("Dialog", Font.ITALIC, 14));
		
		yukiYes = new JButton("Choose Yuki");
		yukiYes.setForeground(Color.BLACK);
		yukiYes.setFont(new Font("Dialog", Font.PLAIN, 14));
		yukiYes.setBackground(new Color(0, 128, 0));
		
		JLabel yukiDescription3 = new JLabel("Special skill: Giant steps \u2013move two (2) unobstructed steps for a single cost");
		yukiDescription3.setFont(new Font("Dialog", Font.BOLD, 14));
		// sets the layout of the yukiPanel 
		GroupLayout gl_yukiPanel = new GroupLayout(yukiPanel);
		gl_yukiPanel.setHorizontalGroup(
			gl_yukiPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_yukiPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(yukiDescription1)
					.addContainerGap())
				.addGroup(gl_yukiPanel.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_yukiPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_yukiPanel.createSequentialGroup()
							.addComponent(yukiDescription3, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(yukiDescription2, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)))
				.addGroup(gl_yukiPanel.createSequentialGroup()
					.addGap(263)
					.addComponent(yukiYes, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(279, Short.MAX_VALUE))
		);
		gl_yukiPanel.setVerticalGroup(
			gl_yukiPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_yukiPanel.createSequentialGroup()
					.addGap(14)
					.addComponent(yukiDescription1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(yukiDescription2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(yukiDescription3, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(yukiYes, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		yukiPanel.setLayout(gl_yukiPanel);
		
		// sets the properties of the yumePanel with its descriptions and button
		yumePanel = new JPanel();
		layeredPanel.add(yumePanel, "name_116294836460300");
		
		JLabel yumeDescription1 = new JLabel("Yumes are cloud-like creatures.");
		yumeDescription1.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JLabel yumeDescription3 = new JLabel("According to folklore, those with the Yumes as their companion is said to experience peaceful sleep all the time. ");
		yumeDescription3.setForeground(new Color(255, 140, 0));
		yumeDescription3.setFont(new Font("Dialog", Font.ITALIC, 12));
		
		JLabel yumeDescription4 = new JLabel("Special skill: Float \u2013move one unobstructed square diagonally");
		yumeDescription4.setFont(new Font("Dialog", Font.BOLD, 14));
		
		yumeYes = new JButton("Choose Yume");
		yumeYes.setForeground(Color.BLACK);
		yumeYes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yumeYes.setBackground(new Color(255, 127, 80));
		
		// sets the layout of the yumePanel 
		GroupLayout gl_yumePanel = new GroupLayout(yumePanel);
		gl_yumePanel.setHorizontalGroup(
			gl_yumePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_yumePanel.createSequentialGroup()
					.addContainerGap(137, Short.MAX_VALUE)
					.addComponent(yumeDescription1, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
				.addGroup(gl_yumePanel.createSequentialGroup()
					.addGap(25)
					.addComponent(yumeDescription3, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
				.addGroup(gl_yumePanel.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addComponent(yumeDescription4, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_yumePanel.createSequentialGroup()
					.addGap(265)
					.addComponent(yumeYes, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		gl_yumePanel.setVerticalGroup(
			gl_yumePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_yumePanel.createSequentialGroup()
					.addGap(17)
					.addComponent(yumeDescription1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(yumeDescription3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(yumeDescription4)
					.addGap(18)
					.addComponent(yumeYes, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		yumePanel.setLayout(gl_yumePanel);
		
		// sets the properties of the yumePanel with its descriptions and button
		samePanel = new JPanel();
		layeredPanel.add(samePanel, "name_117385866930400");
		
		JLabel sameDescription3 = new JLabel("Sames are water creatures that roam the deepest of oceans. ");
		sameDescription3.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("They are very friendly towards humans and love to play with them. ");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		
		JLabel sameDescription1 = new JLabel("Special skill: Splash \u2013 destroy an entire row of obstruction from where the player is standing");
		sameDescription1.setFont(new Font("Dialog", Font.BOLD, 14));
		
		sameYes = new JButton("Choose Same");
		sameYes.setForeground(Color.YELLOW);
		sameYes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sameYes.setBackground(Color.BLUE);
		
		// sets the layout of the yumePanel
		GroupLayout gl_samePanel = new GroupLayout(samePanel);
		gl_samePanel.setHorizontalGroup(
			gl_samePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_samePanel.createSequentialGroup()
					.addContainerGap(67, Short.MAX_VALUE)
					.addComponent(sameDescription3, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
				.addGroup(gl_samePanel.createSequentialGroup()
					.addGap(107)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
				.addGroup(gl_samePanel.createSequentialGroup()
					.addGap(17)
					.addComponent(sameDescription1, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_samePanel.createSequentialGroup()
					.addGap(264)
					.addComponent(sameYes, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(271, Short.MAX_VALUE))
		);
		gl_samePanel.setVerticalGroup(
			gl_samePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_samePanel.createSequentialGroup()
					.addGap(15)
					.addComponent(sameDescription3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(sameDescription1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(sameYes, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		samePanel.setLayout(gl_samePanel);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
	
	/**
	 * Kirin image listener.
	 *
	 * @param listenKirinPanel the listen kirin panel
	 */
	public void kirinImageListener(ActionListener listenKirinPanel) {
		kirinButton.addActionListener(listenKirinPanel);
	}
	
	/**
	 * Yume image listener.
	 *
	 * @param listenYumePanel the listen yume panel
	 */
	public void yumeImageListener(ActionListener listenYumePanel) {
		yumeButton.addActionListener(listenYumePanel);
	}
	
	/**
	 * Yuki image listener.
	 *
	 * @param listenYukiPanel the listen yuki panel
	 */
	public void yukiImageListener(ActionListener listenYukiPanel) {
		yukiButton.addActionListener(listenYukiPanel);
	}
	
	/**
	 * Same image listener.
	 *
	 * @param listenSamePanel the listen same panel
	 */
	public void sameImageListener(ActionListener listenSamePanel) {
		sameButton.addActionListener(listenSamePanel);
	}
	
	/**
	 * Kirin yes listener.
	 *
	 * @param listenKirinButton the listen kirin button
	 */
	public void kirinYesListener(ActionListener listenKirinButton) {
		kirinYes.addActionListener(listenKirinButton);
	}
	
	/**
	 * Yume yes listener.
	 *
	 * @param listenYumeButton the listen yume button
	 */
	public void yumeYesListener(ActionListener listenYumeButton) {
		yumeYes.addActionListener(listenYumeButton);
	}
	
	/**
	 * Yuki yes listener.
	 *
	 * @param listenYukiButton the listen yuki button
	 */
	public void yukiYesListener(ActionListener listenYukiButton) {
		yukiYes.addActionListener(listenYukiButton);
	}
	
	/**
	 * Same yes listener.
	 *
	 * @param listenSameButton the listen same button
	 */
	public void sameYesListener(ActionListener listenSameButton) {
		sameYes.addActionListener(listenSameButton);
	}

	
	
}
