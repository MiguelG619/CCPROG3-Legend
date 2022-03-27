package Game;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * The Class EndingView.
 */
@SuppressWarnings("serial")
public class EndingView extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The play again button. */
	public JButton playAgainButton;
	
	/** The quit button. */
	public JButton quitButton;
	

	/**
	 * Create the frame.
	 */
	public EndingView() {
		// set the properties of the JPanel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// sets the text and images of the JLabels
		JLabel fireworks2 = new JLabel(" ");
		fireworks2.setIcon(new ImageIcon("D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\fireworks.gif"));
		
		JLabel fireworks1 = new JLabel(" ");
		fireworks1.setIcon(new ImageIcon("D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\fireworks.gif"));
		
		JLabel wowLabel1 = new JLabel("W");
		wowLabel1.setForeground(new Color(255, 204, 0));
		wowLabel1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel wowLabel2 = new JLabel("O");
		wowLabel2.setForeground(new Color(255, 204, 0));
		wowLabel2.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		JLabel wowLabel3 = new JLabel("W");
		wowLabel3.setForeground(new Color(255, 204, 0));
		wowLabel3.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		// set the properties of the buttons
		playAgainButton = new JButton("Play Again");
		playAgainButton.setBackground(Color.LIGHT_GRAY);
		playAgainButton.setFont(new Font("SansSerif", Font.PLAIN, 41));
		
		quitButton = new JButton("QUIT");
		quitButton.setFont(new Font("SansSerif", Font.PLAIN, 41));
		quitButton.setBackground(Color.LIGHT_GRAY);
		// set the layout of the panel
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(fireworks1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(wowLabel1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(wowLabel3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(wowLabel2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
					.addGap(70)
					.addComponent(fireworks2))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(102, Short.MAX_VALUE)
					.addComponent(playAgainButton)
					.addGap(100)
					.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addGap(95))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(fireworks1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addComponent(fireworks2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(wowLabel1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(wowLabel2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(wowLabel3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
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
	void playAgainListener(ActionListener playAgain) {
		playAgainButton.addActionListener(playAgain);
	}
	
	/**
	 * Quit listener.
	 *
	 * @param quit the quit
	 */
	void quitListener(ActionListener quit) {
		quitButton.addActionListener(quit);
	}
}
