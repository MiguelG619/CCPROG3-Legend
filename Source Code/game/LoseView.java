package Game;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * The Class LoseView.
 */
@SuppressWarnings("serial")
public class LoseView extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The play again button. */
	public JButton playAgainButton;
	
	/** The quit button. */
	public JButton quitButton;
	

	/**
	 * Create the frame.
	 */
	public LoseView() {
		
		// sets the properties of the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// creates the buttons and their properties
		playAgainButton = new JButton("Play Again");
		playAgainButton.setBackground(Color.GRAY);
		playAgainButton.setFont(new Font("Dialog", Font.PLAIN, 41));
		
		quitButton = new JButton("QUIT");
		quitButton.setFont(new Font("Dialog", Font.PLAIN, 41));
		quitButton.setBackground(Color.GRAY);
		
		JLabel gameOverLabel = new JLabel("GAME OVER");
		gameOverLabel.setForeground(new Color(220, 20, 60));
		gameOverLabel.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 80));
		// sets the layout of the panel
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(playAgainButton)
							.addGap(100)
							.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
							.addGap(95))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(gameOverLabel, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE)
							.addGap(27))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(140, Short.MAX_VALUE)
					.addComponent(gameOverLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(playAgainButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	/**
	 * Play again listener.
	 *
	 * @param playAgain the play again
	 */
	public void playAgainListener(ActionListener playAgain) {
		playAgainButton.addActionListener(playAgain);
	}
	
	/**
	 * Quit listener.
	 *
	 * @param quit the quit
	 */
	public void quitListener(ActionListener quit) {
		quitButton.addActionListener(quit);
	}
}
