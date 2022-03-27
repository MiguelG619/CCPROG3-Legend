package map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Game.Health;

/**
 * 
 * a public class that acts as a JFrame of the GUI
 *
 */
@SuppressWarnings("serial")
public class MapView extends JFrame{
	// initializes the values row and col for the coordinates of the map
	private int row = 0, col = 0;

	// initializes the panel that will be used for the GUI 
	public JPanel panel = new JPanel();
	
	// initializes the 2D Panel array for the tiles of the map created
	public JPanel[][] map = new JPanel[10][10];
	
	// initializes an ArrayList composed of JPanels to store coordinates in which health totem's are located
	public ArrayList<JPanel> hearts = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which obstacles are located
	public ArrayList<JPanel> brickList = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which Kirin's are located
	public ArrayList<JPanel> kirinList = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which Yume's are located
	public ArrayList<JPanel> yumeList = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which Yuki's are located
	public ArrayList<JPanel> yukisList = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which Same's are located
	public ArrayList<JPanel> sameList = new ArrayList<JPanel>();
	
	// initializes an ArrayList composed of JPanels to store coordinates in which the finish line is located
	public ArrayList<JPanel> endList = new ArrayList<JPanel>();
	
	// initializes a JButton to be used as a button for going up
	public JButton up = new JButton();
	
	// initializes a JButton to be used as a button for going down
	public JButton down = new JButton();
	
	// initializes a JButton to be used as a button for going left
	public JButton left = new JButton();
	
	// initializes a JButton to be used as a button for going right
	public JButton right = new JButton();
	
	// initializes a JLabel array of bricks
	public Brick[] bricks = new Brick[30];
	
	// initializes a JLabel array of health totem's
	public Health[] health = new Health[5];
	
	// initializes a JLabel array of Kirin Encounters
	public EncounterKirin[] kirin = new EncounterKirin[3];
	
	// initializes a JLabel array of Yume Encounters
	public EncounterYume[] yume = new EncounterYume[3];
	
	// initializes a JLabel array of Yuki Encounters
	public EncounterYukis[] yukis = new EncounterYukis[3];
	
	// initializes a JLabel array of Same Encounters
	public EncounterSames[] same = new EncounterSames[3];
	
	// initializes a JLabel for the player
	public JLabel playerPos = new JLabel();
	
	// initializes a JLabel for the finish line
	public JLabel finish = new JLabel();
	
	/**
	 * a public object in which the GUI is set
	 * @param num the number that is will determine which map will be used
	 */
	public MapView(int num){
		if (num == 1) {
		// a method in which the panel would be a GridLayout 
		panel.setLayout(new GridLayout(11,11));
		
		// a for-loop to set the background of the map and adds the said panel to the GridLayout
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				map[i][j] = new JPanel();
				map[i][j].setBackground(Color.WHITE);
				map[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
				panel.add(map[i][j]);
			}
		
		// a for-loop to set the image of the array of Bricks to be used as obstacles
		for (int i = 0; i < 30; i++) {
			bricks[i] = new Brick();
			bricks[i].setIcon(new ImageIcon(
					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\brick.jpg"));
		}
		
		// a for-loop to set the image of the array of health totem's to be used as obstacles
		for (int i = 0; i < 5; i++) {
			health[i] = new Health();
			health[i].setIcon(new ImageIcon(
					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\health.png"));
		}
		
		// a for-loop to set the array of Kirin into a JLabel of encounters
		for (int i = 0; i < 3; i++) {
			kirin[i] = new EncounterKirin();
		}
		
		// a for-loop to set the array of Yume into a JLabel of encounters
		for (int i = 0; i < 3; i++) {
			yume[i] = new EncounterYume();
		}
		
		// a for-loop to set the array of Yuki into a JLabel of encounters
		for (int i = 0; i < 3; i++) {
			yukis[i] = new EncounterYukis();
		}
		
		// a for-loop to set the array of Same into a JLabel of encounters
		for (int i = 0; i < 3; i++) {
			same[i] = new EncounterSames();
		}
		
		// adds the panel to the JFrame
		this.add(panel);
		
		// adds the set of buttons into the GridLayout 
		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);
		
		// sets the icon of the JLabel to distinguish the finish line in the map
		finish.setIcon(new ImageIcon(
				"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\finishLine.jpg"));
		
		// adds the texts to distinguish the four buttons from each other
		up.setText("Up");
		down.setText("Down");
		left.setText("Left");
		right.setText("Right");
		
		// sets the size of the frame that is suitable for the needs of the user
		this.setSize(700,700);
		// sets the action of the frame when close button is clicked
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		// sets the visibility of the JFrame to true in order to see the output
		this.setVisible(true);
		// sets the dimensions of the JFrame
		this.setPreferredSize(new Dimension(400,300));
		
		//adds the coordinates of the map into the array of JLabel Encounters and adds it to the ArrayList to store its data
		map[3][1].add(kirin[0]);
		kirinList.add(map[3][1]);
		map[5][8].add(kirin[1]);
		kirinList.add(map[5][8]);
		map[8][5].add(kirin[2]);
		kirinList.add(map[8][5]);
		
		map[0][4].add(yume[0]);
		yumeList.add(map[0][4]);
		map[2][6].add(yume[1]);
		yumeList.add(map[2][6]);
		map[5][4].add(yume[2]);
		yumeList.add(map[5][4]);
		
		map[6][1].add(yukis[0]);
		yukisList.add(map[6][1]);
		map[7][3].add(yukis[1]);
		yukisList.add(map[7][3]);
		map[9][7].add(yukis[2]);
		yukisList.add(map[9][7]);
		
		map[1][3].add(same[0]);
		sameList.add(map[1][3]);
		map[2][7].add(same[1]);
		sameList.add(map[2][7]);
		map[4][3].add(same[2]);
		sameList.add(map[4][3]);
		
		// adds the playerPos to the coordinates of the map[][] to update its current position
		map[row][col].add(playerPos);
		
		//adds the coordinates of the map into the array of JLabel finish and adds it to the ArrayList to store its data
		map[9][9].add(finish);
		endList.add(map[9][9]);
		
		//adds the coordinates of the map into the array of JLabel bricks for obstacles and adds it to the ArrayList to store its data
		map[0][2].add(bricks[0]);
		brickList.add(map[0][2]);
		
		map[0][5].add(bricks[1]);
		brickList.add(map[0][5]);
		
		map[0][6].add(bricks[2]);
		brickList.add(map[0][6]);
		
		map[0][7].add(bricks[3]);
		brickList.add(map[0][7]);
		
		map[0][8].add(bricks[4]);
		brickList.add(map[0][8]);
		
		map[0][9].add(bricks[5]);
		brickList.add(map[0][9]);
		
		map[1][5].add(bricks[6]);
		brickList.add(map[1][5]);
		
		map[1][9].add(bricks[7]);
		brickList.add(map[1][9]);
		
		map[2][9].add(bricks[8]);
		brickList.add(map[2][9]);
		
		map[3][0].add(bricks[9]);
		brickList.add(map[3][0]);
		
		map[3][7].add(bricks[10]);
		brickList.add(map[3][7]);
		
		map[3][9].add(bricks[11]);
		brickList.add(map[3][9]);
		
		map[4][0].add(bricks[12]);
		brickList.add(map[4][0]);
		
		map[4][1].add(bricks[13]);
		brickList.add(map[4][1]);
		
		map[4][9].add(bricks[14]);
		brickList.add(map[4][9]);
		
		map[5][0].add(bricks[15]);
		brickList.add(map[5][0]);
		
		map[5][9].add(bricks[16]);
		brickList.add(map[5][9]);
		
		map[5][0].add(bricks[17]);
		brickList.add(map[5][0]);
		
		map[6][0].add(bricks[18]);
		brickList.add(map[6][0]);
		
		map[6][2].add(bricks[19]);
		brickList.add(map[6][2]);
		
		map[6][3].add(bricks[20]);
		brickList.add(map[6][3]);
		
		map[6][4].add(bricks[21]);
		brickList.add(map[6][4]);
		
		map[6][6].add(bricks[22]);
		brickList.add(map[6][6]);
		
		map[6][9].add(bricks[23]);
		brickList.add(map[6][9]);
		
		map[7][0].add(bricks[24]);
		brickList.add(map[7][0]);
		
		map[7][9].add(bricks[25]);
		brickList.add(map[7][9]);
		
		map[9][1].add(bricks[26]);
		brickList.add(map[9][1]);
		
		map[9][4].add(bricks[27]);
		brickList.add(map[9][4]);
		
		map[9][5].add(bricks[28]);
		brickList.add(map[9][5]);
		
		map[9][6].add(bricks[29]);
		brickList.add(map[9][6]);
		
		
		//adds the coordinates of the map into the array of JLabel health for health totem's and adds it to the ArrayList to store its data
		map[2][4].add(health[0]);
		hearts.add(map[2][4]);
		
		map[3][2].add(health[1]);
		hearts.add(map[3][2]);
		
		map[4][4].add(health[2]);
		hearts.add(map[4][4]);
		
		map[6][7].add(health[3]);
		hearts.add(map[6][7]);
		
		map[9][3].add(health[4]);
		hearts.add(map[9][3]);
		}
		else if (num == 2) {
			// a method in which the panel would be a GridLayout 
			panel.setLayout(new GridLayout(11,11));
			
			// a for-loop to set the background of the map and adds the said panel to the GridLayout
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++) {
					map[i][j] = new JPanel();
					map[i][j].setBackground(Color.WHITE);
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
					panel.add(map[i][j]);
				}
			
			// a for-loop to set the image of the array of Bricks to be used as obstacles
			for (int i = 0; i < 30; i++) {
				bricks[i] = new Brick();
				bricks[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\brick.jpg"));
			}
			
			// a for-loop to set the image of the array of health totem's to be used as obstacles
			for (int i = 0; i < 5; i++) {
				health[i] = new Health();
				health[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\health.png"));
			}
			
			// a for-loop to set the array of Kirin into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				kirin[i] = new EncounterKirin();
			}
			
			// a for-loop to set the array of Yume into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yume[i] = new EncounterYume();
			}
			
			// a for-loop to set the array of Yuki into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yukis[i] = new EncounterYukis();
			}
			
			// a for-loop to set the array of Same into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				same[i] = new EncounterSames();
			}
			
			// adds the panel to the JFrame
			this.add(panel);
			
			// adds the set of buttons into the GridLayout 
			panel.add(up);
			panel.add(down);
			panel.add(left);
			panel.add(right);
			
			// sets the icon of the JLabel to distinguish the finish line in the map
			finish.setIcon(new ImageIcon(
					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\finishLine.jpg"));
			
			// adds the texts to distinguish the four buttons from each other
			up.setText("Up");
			down.setText("Down");
			left.setText("Left");
			right.setText("Right");
			
			// sets the size of the frame that is suitable for the needs of the user
			this.setSize(700,700);
			// sets the action of the frame when close button is clicked
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
			// sets the visibility of the JFrame to true in order to see the output
			this.setVisible(true);
			// sets the dimensions of the JFrame
			this.setPreferredSize(new Dimension(400,300));
			
			//adds the coordinates of the map into the array of JLabel Encounters and adds it to the ArrayList to store its data
			map[2][0].add(kirin[0]);
			kirinList.add(map[2][0]);
			map[5][1].add(kirin[1]);
			kirinList.add(map[5][1]);
			map[6][2].add(kirin[2]);
			kirinList.add(map[6][2]);
			
			map[5][4].add(yume[0]);
			yumeList.add(map[5][4]);
			map[6][3].add(yume[1]);
			yumeList.add(map[6][3]);
			map[9][2].add(yume[2]);
			yumeList.add(map[9][2]);
			
			map[2][2].add(yukis[0]);
			yukisList.add(map[2][2]);
			map[4][8].add(yukis[1]);
			yukisList.add(map[4][8]);
			map[9][7].add(yukis[2]);
			yukisList.add(map[9][7]);
			
			map[1][5].add(same[0]);
			sameList.add(map[1][5]);
			map[5][5].add(same[1]);
			sameList.add(map[5][5]);
			map[6][9].add(same[2]);
			sameList.add(map[6][9]);
			
			
			// adds the playerPos to the coordinates of the map[][] to update its current position
			map[row][col].add(playerPos);
			
			//adds the coordinates of the map into the array of JLabel finish and adds it to the ArrayList to store its data
			map[9][9].add(finish);
			endList.add(map[9][9]);
			
			//adds the coordinates of the map into the array of JLabel bricks for obstacles and adds it to the ArrayList to store its data
			map[0][1].add(bricks[0]);
			brickList.add(map[0][1]);
			
			map[0][3].add(bricks[1]);
			brickList.add(map[0][3]);
			
			map[0][4].add(bricks[2]);
			brickList.add(map[0][4]);
			
			map[0][5].add(bricks[3]);
			brickList.add(map[0][5]);
			
			map[0][6].add(bricks[4]);
			brickList.add(map[0][6]);
			
			map[0][7].add(bricks[5]);
			brickList.add(map[0][7]);
			
			map[0][8].add(bricks[6]);
			brickList.add(map[0][8]);
			
			map[0][9].add(bricks[7]);
			brickList.add(map[0][9]);
			
			map[1][1].add(bricks[8]);
			brickList.add(map[1][1]);
			
			map[1][7].add(bricks[9]);
			brickList.add(map[1][7]);
			
			map[1][8].add(bricks[10]);
			brickList.add(map[1][8]);
			
			map[1][9].add(bricks[11]);
			brickList.add(map[1][9]);
			
			map[2][9].add(bricks[12]);
			brickList.add(map[2][9]);
			
			map[3][4].add(bricks[13]);
			brickList.add(map[3][4]);
			
			map[3][5].add(bricks[14]);
			brickList.add(map[3][5]);
			
			map[3][7].add(bricks[15]);
			brickList.add(map[3][7]);
			
			map[3][9].add(bricks[16]);
			brickList.add(map[3][9]);
			
			map[4][1].add(bricks[17]);
			brickList.add(map[4][1]);
			
			map[4][2].add(bricks[18]);
			brickList.add(map[4][2]);
			
			map[4][3].add(bricks[19]);
			brickList.add(map[4][3]);
			
			map[4][9].add(bricks[20]);
			brickList.add(map[4][9]);
			
			map[6][1].add(bricks[21]);
			brickList.add(map[6][1]);
			
			map[6][8].add(bricks[22]);
			brickList.add(map[6][8]);
			
			map[7][2].add(bricks[23]);
			brickList.add(map[7][2]);
			
			map[7][6].add(bricks[24]);
			brickList.add(map[7][6]);
			
			map[7][8].add(bricks[25]);
			brickList.add(map[7][8]);
			
			map[7][9].add(bricks[26]);
			brickList.add(map[7][9]);
			
			map[9][4].add(bricks[27]);
			brickList.add(map[9][4]);
			
			map[9][5].add(bricks[28]);
			brickList.add(map[9][5]);
			
			map[9][6].add(bricks[29]);
			brickList.add(map[9][6]);
			
			
			//adds the coordinates of the map into the array of JLabel health for health totem's and adds it to the ArrayList to store its data
			map[2][1].add(health[0]);
			hearts.add(map[2][1]);
			
			map[5][6].add(health[1]);
			hearts.add(map[5][6]);
			
			map[7][5].add(health[2]);
			hearts.add(map[7][5]);
			
			map[7][7].add(health[3]);
			hearts.add(map[7][7]);
			
			map[9][3].add(health[4]);
			hearts.add(map[9][3]);
		}
		else if (num == 3) {
			// a method in which the panel would be a GridLayout 
			panel.setLayout(new GridLayout(11,11));
			
			// a for-loop to set the background of the map and adds the said panel to the GridLayout
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++) {
					map[i][j] = new JPanel();
					map[i][j].setBackground(Color.WHITE);
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
					panel.add(map[i][j]);
				}
			
			// a for-loop to set the image of the array of Bricks to be used as obstacles
			for (int i = 0; i < 30; i++) {
				bricks[i] = new Brick();
				bricks[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\brick.jpg"));
			}
			
			// a for-loop to set the image of the array of health totem's to be used as obstacles
			for (int i = 0; i < 5; i++) {
				health[i] = new Health();
				health[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\health.png"));
			}
			
			// a for-loop to set the array of Kirin into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				kirin[i] = new EncounterKirin();
			}
			
			// a for-loop to set the array of Yume into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yume[i] = new EncounterYume();
			}
			
			// a for-loop to set the array of Yuki into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yukis[i] = new EncounterYukis();
			}
			
			// a for-loop to set the array of Same into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				same[i] = new EncounterSames();
			}
			
			// adds the panel to the JFrame
			this.add(panel);
			
			// adds the set of buttons into the GridLayout 
			panel.add(up);
			panel.add(down);
			panel.add(left);
			panel.add(right);
			
			// sets the icon of the JLabel to distinguish the finish line in the map
			finish.setIcon(new ImageIcon(
					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\finishLine.jpg"));
			
			// adds the texts to distinguish the four buttons from each other
			up.setText("Up");
			down.setText("Down");
			left.setText("Left");
			right.setText("Right");
			
			// sets the size of the frame that is suitable for the needs of the user
			this.setSize(700,700);
			// sets the action of the frame when close button is clicked
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
			// sets the visibility of the JFrame to true in order to see the output
			this.setVisible(true);
			// sets the dimensions of the JFrame
			this.setPreferredSize(new Dimension(400,300));
			
			//adds the coordinates of the map into the array of JLabel Encounters and adds it to the ArrayList to store its data
			map[1][1].add(kirin[0]);
			kirinList.add(map[1][1]);
			map[5][1].add(kirin[1]);
			kirinList.add(map[5][1]);
			map[6][4].add(kirin[2]);
			kirinList.add(map[6][4]);
			
			map[4][9].add(yume[0]);
			yumeList.add(map[4][9]);
			map[6][1].add(yume[1]);
			yumeList.add(map[6][1]);
			map[9][2].add(yume[2]);
			yumeList.add(map[9][2]);
			
			map[2][4].add(yukis[0]);
			yukisList.add(map[2][4]);
			map[4][7].add(yukis[1]);
			yukisList.add(map[4][7]);
			map[9][7].add(yukis[2]);
			yukisList.add(map[9][7]);
			
			map[1][6].add(same[0]);
			sameList.add(map[1][6]);
			map[2][6].add(same[1]);
			sameList.add(map[2][6]);
			map[2][8].add(same[2]);
			sameList.add(map[2][8]);
			
			
			// adds the playerPos to the coordinates of the map[][] to update its current position
			map[row][col].add(playerPos);
			
			//adds the coordinates of the map into the array of JLabel finish and adds it to the ArrayList to store its data
			map[9][9].add(finish);
			endList.add(map[9][9]);
			
			//adds the coordinates of the map into the array of JLabel bricks for obstacles and adds it to the ArrayList to store its data
			map[0][2].add(bricks[0]);
			brickList.add(map[0][2]);
			
			map[0][3].add(bricks[1]);
			brickList.add(map[0][3]);
			
			map[0][4].add(bricks[2]);
			brickList.add(map[0][4]);
			
			map[0][5].add(bricks[3]);
			brickList.add(map[0][5]);
			
			map[0][6].add(bricks[4]);
			brickList.add(map[0][6]);
			
			map[0][7].add(bricks[5]);
			brickList.add(map[0][7]);
			
			map[0][8].add(bricks[6]);
			brickList.add(map[0][8]);
			
			map[0][9].add(bricks[7]);
			brickList.add(map[0][9]);
			
			map[1][0].add(bricks[8]);
			brickList.add(map[1][0]);
			
			map[2][0].add(bricks[9]);
			brickList.add(map[2][0]);
			
			map[2][2].add(bricks[10]);
			brickList.add(map[2][2]);
			
			map[2][5].add(bricks[11]);
			brickList.add(map[2][5]);
			
			map[2][7].add(bricks[12]);
			brickList.add(map[2][7]);
			
			map[3][0].add(bricks[13]);
			brickList.add(map[3][0]);
			
			map[4][1].add(bricks[14]);
			brickList.add(map[4][1]);
			
			map[4][3].add(bricks[15]);
			brickList.add(map[4][3]);
			
			map[4][6].add(bricks[16]);
			brickList.add(map[4][6]);
			
			map[5][0].add(bricks[17]);
			brickList.add(map[5][0]);
			
			map[5][5].add(bricks[18]);
			brickList.add(map[5][5]);
			
			map[5][6].add(bricks[19]);
			brickList.add(map[5][6]);
			
			map[5][7].add(bricks[20]);
			brickList.add(map[5][7]);
			
			map[5][9].add(bricks[21]);
			brickList.add(map[5][9]);
			
			map[6][0].add(bricks[22]);
			brickList.add(map[6][0]);
			
			map[6][3].add(bricks[23]);
			brickList.add(map[6][3]);
			
			map[6][9].add(bricks[24]);
			brickList.add(map[6][9]);
			
			map[3][3].add(bricks[25]);
			brickList.add(map[3][3]);
			
			map[4][0].add(bricks[26]);
			brickList.add(map[4][0]);
			
			map[9][4].add(bricks[27]);
			brickList.add(map[9][4]);
			
			map[9][5].add(bricks[28]);
			brickList.add(map[9][5]);
			
			map[9][6].add(bricks[29]);
			brickList.add(map[9][6]);
			
			
			//adds the coordinates of the map into the array of JLabel health for health totem's and adds it to the ArrayList to store its data
			map[2][1].add(health[0]);
			hearts.add(map[2][1]);
			
			map[4][5].add(health[1]);
			hearts.add(map[4][5]);
			
			map[4][8].add(health[2]);
			hearts.add(map[4][8]);
			
			map[5][4].add(health[3]);
			hearts.add(map[5][4]);
			
			map[7][8].add(health[4]);
			hearts.add(map[7][8]);
		}
		else if (num == 4) {
			// a method in which the panel would be a GridLayout 
			panel.setLayout(new GridLayout(11,11));
			
			// a for-loop to set the background of the map and adds the said panel to the GridLayout
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++) {
					map[i][j] = new JPanel();
					map[i][j].setBackground(Color.WHITE);
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
					panel.add(map[i][j]);
				}
			
			// a for-loop to set the image of the array of Bricks to be used as obstacles
			for (int i = 0; i < 30; i++) {
				bricks[i] = new Brick();
				bricks[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\brick.jpg"));
			}
			
			// a for-loop to set the image of the array of health totem's to be used as obstacles
			for (int i = 0; i < 5; i++) {
				health[i] = new Health();
				health[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\health.png"));
			}
			
			// a for-loop to set the array of Kirin into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				kirin[i] = new EncounterKirin();
			}
			
			// a for-loop to set the array of Yume into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yume[i] = new EncounterYume();
			}
			
			// a for-loop to set the array of Yuki into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yukis[i] = new EncounterYukis();
			}
			
			// a for-loop to set the array of Same into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				same[i] = new EncounterSames();
			}
			
			// adds the panel to the JFrame
			this.add(panel);
			
			// adds the set of buttons into the GridLayout 
			panel.add(up);
			panel.add(down);
			panel.add(left);
			panel.add(right);
			
			// sets the icon of the JLabel to distinguish the finish line in the map
			finish.setIcon(new ImageIcon(
					"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\finishLine.jpg"));
			
			// adds the texts to distinguish the four buttons from each other
			up.setText("Up");
			down.setText("Down");
			left.setText("Left");
			right.setText("Right");
			
			// sets the size of the frame that is suitable for the needs of the user
			this.setSize(700,700);
			// sets the action of the frame when close button is clicked
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
			// sets the visibility of the JFrame to true in order to see the output
			this.setVisible(true);
			// sets the dimensions of the JFrame
			this.setPreferredSize(new Dimension(400,300));
			
			//adds the coordinates of the map into the array of JLabel Encounters and adds it to the ArrayList to store its data
			map[0][3].add(kirin[0]);
			kirinList.add(map[0][3]);
			map[2][2].add(kirin[1]);
			kirinList.add(map[2][2]);
			map[9][6].add(kirin[2]);
			kirinList.add(map[9][6]);
			
			map[6][1].add(yume[0]);
			yumeList.add(map[6][1]);
			map[8][5].add(yume[1]);
			yumeList.add(map[8][5]);
			map[8][9].add(yume[2]);
			yumeList.add(map[8][9]);
			
			map[3][8].add(yukis[0]);
			yukisList.add(map[6][1]);
			map[7][4].add(yukis[1]);
			yukisList.add(map[7][3]);
			map[9][7].add(yukis[2]);
			yukisList.add(map[9][7]);
			
			map[2][6].add(same[0]);
			sameList.add(map[1][3]);
			map[2][8].add(same[1]);
			sameList.add(map[2][7]);
			map[3][1].add(same[2]);
			sameList.add(map[4][3]);
			
			// adds the playerPos to the coordinates of the map[][] to update its current position
			map[row][col].add(playerPos);
			
			//adds the coordinates of the map into the array of JLabel finish and adds it to the ArrayList to store its data
			map[9][9].add(finish);
			endList.add(map[9][9]);
			
			//adds the coordinates of the map into the array of JLabel bricks for obstacles and adds it to the ArrayList to store its data
			map[0][5].add(bricks[0]);
			brickList.add(map[0][5]);
			
			map[0][6].add(bricks[1]);
			brickList.add(map[0][6]);
			
			map[0][8].add(bricks[2]);
			brickList.add(map[0][8]);
			
			map[0][9].add(bricks[3]);
			brickList.add(map[0][9]);
			
			map[1][0].add(bricks[4]);
			brickList.add(map[1][0]);
			
			map[1][1].add(bricks[5]);
			brickList.add(map[1][1]);
			
			map[2][0].add(bricks[6]);
			brickList.add(map[2][0]);
			
			map[3][0].add(bricks[7]);
			brickList.add(map[3][0]);
			
			map[3][2].add(bricks[8]);
			brickList.add(map[3][2]);
			
			map[3][9].add(bricks[9]);
			brickList.add(map[3][9]);
			
			map[4][0].add(bricks[10]);
			brickList.add(map[4][0]);
			
			map[4][4].add(bricks[11]);
			brickList.add(map[4][4]);
			
			map[4][5].add(bricks[12]);
			brickList.add(map[4][5]);
			
			map[4][7].add(bricks[13]);
			brickList.add(map[4][7]);
			
			map[5][0].add(bricks[14]);
			brickList.add(map[4][0]);
			
			map[5][2].add(bricks[15]);
			brickList.add(map[5][2]);
			
			map[6][0].add(bricks[16]);
			brickList.add(map[6][0]);
			
			map[6][4].add(bricks[17]);
			brickList.add(map[6][4]);
			
			map[6][8].add(bricks[18]);
			brickList.add(map[6][8]);
			
			map[7][0].add(bricks[19]);
			brickList.add(map[7][0]);
			
			map[7][2].add(bricks[20]);
			brickList.add(map[7][2]);
			
			map[7][7].add(bricks[21]);
			brickList.add(map[7][7]);
			
			map[7][8].add(bricks[22]);
			brickList.add(map[7][8]);
			
			map[8][1].add(bricks[23]);
			brickList.add(map[8][1]);
			
			map[8][3].add(bricks[24]);
			brickList.add(map[8][3]);
			
			map[8][8].add(bricks[25]);
			brickList.add(map[8][8]);
			
			map[9][0].add(bricks[26]);
			brickList.add(map[9][0]);
			
			map[9][2].add(bricks[27]);
			brickList.add(map[9][2]);
			
			map[9][3].add(bricks[28]);
			brickList.add(map[9][3]);
			
			map[9][5].add(bricks[29]);
			brickList.add(map[9][5]);
			
			
			//adds the coordinates of the map into the array of JLabel health for health totem's and adds it to the ArrayList to store its data
			map[0][4].add(health[0]);
			hearts.add(map[0][4]);
			
			map[3][5].add(health[1]);
			hearts.add(map[3][5]);
			
			map[7][6].add(health[2]);
			hearts.add(map[7][6]);
			
			map[7][9].add(health[3]);
			hearts.add(map[7][9]);
			
			map[9][8].add(health[4]);
			hearts.add(map[9][8]);
		}
		else if (num == 5) {
			// a method in which the panel would be a GridLayout 
			panel.setLayout(new GridLayout(11,11));
			
			// a for-loop to set the background of the map and adds the said panel to the GridLayout
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++) {
					map[i][j] = new JPanel();
					map[i][j].setBackground(Color.WHITE);
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
					panel.add(map[i][j]);
				}
			
			// a for-loop to set the image of the array of Bricks to be used as obstacles
			for (int i = 0; i < 30; i++) {
				bricks[i] = new Brick();
				bricks[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\brick.jpg"));
			}
			
			// a for-loop to set the image of the array of health totem's to be used as obstacles
			for (int i = 0; i < 5; i++) {
				health[i] = new Health();
				health[i].setIcon(new ImageIcon(
						"D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\health.png"));
			}
			
			// a for-loop to set the array of Kirin into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				kirin[i] = new EncounterKirin();
			}
			
			// a for-loop to set the array of Yume into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yume[i] = new EncounterYume();
			}
			
			// a for-loop to set the array of Yuki into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				yukis[i] = new EncounterYukis();
			}
			
			// a for-loop to set the array of Same into a JLabel of encounters
			for (int i = 0; i < 3; i++) {
				same[i] = new EncounterSames();
			}
			
			// adds the panel to the JFrame
			this.add(panel);
			
			// adds the set of buttons into the GridLayout 
			panel.add(up);
			panel.add(down);
			panel.add(left);
			panel.add(right);
			
			// sets the icon of the JLabel to distinguish the finish line in the map
			finish.setIcon(new ImageIcon("D:\\A-MIGUEL\\College\\2nd Year 2019-2020\\3rd Term\\CCPROG3\\MP\\MCO2\\test\\finishLine.jpg"));
			
			// adds the texts to distinguish the four buttons from each other
			up.setText("Up");
			down.setText("Down");
			left.setText("Left");
			right.setText("Right");
			
			// sets the size of the frame that is suitable for the needs of the user
			this.setSize(700,700);
			// sets the action of the frame when close button is clicked
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
			// sets the visibility of the JFrame to true in order to see the output
			this.setVisible(true);
			// sets the dimensions of the JFrame
			this.setPreferredSize(new Dimension(400,300));
			
			//adds the coordinates of the map into the array of JLabel Encounters and adds it to the ArrayList to store its data
			map[6][1].add(kirin[0]);
			kirinList.add(map[6][1]);
			map[7][6].add(kirin[1]);
			kirinList.add(map[7][6]);
			map[9][5].add(kirin[2]);
			kirinList.add(map[9][5]);
			
			map[4][2].add(yume[0]);
			yumeList.add(map[4][2]);
			map[4][7].add(yume[1]);
			yumeList.add(map[4][7]);
			map[7][5].add(yume[2]);
			yumeList.add(map[7][4]);
			
			map[1][2].add(yukis[0]);
			yukisList.add(map[6][1]);
			map[6][9].add(yukis[1]);
			yukisList.add(map[6][9]);
			map[9][4].add(yukis[2]);
			yukisList.add(map[9][4]);
			
			map[2][7].add(same[0]);
			sameList.add(map[2][7]);
			map[5][5].add(same[1]);
			sameList.add(map[5][5]);
			map[9][8].add(same[2]);
			sameList.add(map[9][8]);
			
			
			// adds the playerPos to the coordinates of the map[][] to update its current position
			map[row][col].add(playerPos);
			
			//adds the coordinates of the map into the array of JLabel finish and adds it to the ArrayList to store its data
			map[9][9].add(finish);
			endList.add(map[9][9]);
			
			//adds the coordinates of the map into the array of JLabel bricks for obstacles and adds it to the ArrayList to store its data
			map[0][2].add(bricks[0]);
			brickList.add(map[0][2]);
			
			map[0][3].add(bricks[1]);
			brickList.add(map[0][3]);
			
			map[0][7].add(bricks[2]);
			brickList.add(map[0][7]);
			
			map[0][8].add(bricks[3]);
			brickList.add(map[0][8]);
			
			map[0][9].add(bricks[4]);
			brickList.add(map[0][9]);
			
			map[1][4].add(bricks[5]);
			brickList.add(map[1][4]);
			
			map[1][6].add(bricks[6]);
			brickList.add(map[1][6]);
			
			map[2][2].add(bricks[7]);
			brickList.add(map[2][2]);
			
			map[2][4].add(bricks[8]);
			brickList.add(map[2][4]);
			
			map[2][6].add(bricks[9]);
			brickList.add(map[2][6]);
			
			map[2][9].add(bricks[10]);
			brickList.add(map[2][9]);
			
			map[3][5].add(bricks[11]);
			brickList.add(map[3][5]);
			
			map[3][8].add(bricks[12]);
			brickList.add(map[3][8]);
			
			map[4][0].add(bricks[13]);
			brickList.add(map[4][0]);
			
			map[4][9].add(bricks[14]);
			brickList.add(map[4][9]);
			
			map[5][2].add(bricks[15]);
			brickList.add(map[5][2]);
			
			map[5][4].add(bricks[16]);
			brickList.add(map[5][4]);
			
			map[5][9].add(bricks[17]);
			brickList.add(map[5][9]);
			
			map[6][0].add(bricks[18]);
			brickList.add(map[6][0]);
			
			map[7][0].add(bricks[19]);
			brickList.add(map[7][0]);
			
			map[7][2].add(bricks[20]);
			brickList.add(map[7][2]);
			
			map[7][3].add(bricks[21]);
			brickList.add(map[7][2]);
			
			map[7][5].add(bricks[22]);
			brickList.add(map[7][5]);
			
			map[8][0].add(bricks[23]);
			brickList.add(map[8][0]);
			
			map[8][2].add(bricks[24]);
			brickList.add(map[8][2]);
			
			map[8][9].add(bricks[25]);
			brickList.add(map[8][9]);
			
			map[9][0].add(bricks[26]);
			brickList.add(map[9][0]);
			
			map[9][2].add(bricks[27]);
			brickList.add(map[9][2]);
			
			map[9][3].add(bricks[28]);
			brickList.add(map[9][6]);
			
			map[9][6].add(bricks[29]);
			brickList.add(map[9][6]);
			
			
			//adds the coordinates of the map into the array of JLabel health for health totem's and adds it to the ArrayList to store its data
			map[2][8].add(health[0]);
			hearts.add(map[2][8]);
			
			map[4][5].add(health[1]);
			hearts.add(map[4][5]);
			
			map[6][8].add(health[2]);
			hearts.add(map[6][8]);
			
			map[8][6].add(health[3]);
			hearts.add(map[8][6]);
			
			map[9][1].add(health[4]);
			hearts.add(map[9][1]);
		}
		
	}
	/**
	 * 
	 * @param listenMovement listens to the user when a JButton is clicked inside the GUI
	 */
	void moveActionListener (ActionListener listenMovement) {
		up.addActionListener(listenMovement);
		down.addActionListener(listenMovement);
		left.addActionListener(listenMovement);
		right.addActionListener(listenMovement);
	}
	/**
	 * 
	 * @param errormessage is the message displayed when a certain action is not meant to be done inside the GUI
	 */
	void displayErrorMessage(String errormessage) {
		JOptionPane.showMessageDialog(this, errormessage);
	}
	/**
	 * 
	 * @param encountermessage is the message displayed when an encounter occurs inside the GUI
	 */
	void displayEncounterMessage(String encountermessage) {
		JOptionPane.showMessageDialog(this, encountermessage);
	}
	/**
	 * 
	 * @param healthmessage is the message displayed when a health totem is passed through inside the GUI
	 */
	void displayHealthMessage(String healthmessage) {
		JOptionPane.showMessageDialog(this, healthmessage);
	}
	/**
	 * 
	 * @param endmessage is the message displayed when the player makes it into the finish line
	 */
	void displayEndMessage(String endmessage) {
		JOptionPane.showMessageDialog(this, endmessage);
	}

}