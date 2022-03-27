package Game;

public class Game {
	
		
	public static void main(String[] args) {
		// initiates the game
		LogInView start = new LogInView();
		Player player = new Player();
		new LogInController(start, player);
		start.frame.setVisible(true);
			
			
		
	}
}
