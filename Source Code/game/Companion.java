package Game;

import java.util.Random;

import javax.swing.ImageIcon;

/**
 *  implements a Companion object.
 */
public class Companion {
   
   /** The name. */
   public String name;
   
   /** The type. */
   public String type;
   
   /** The health. */
   public int health = 50;
   
   /** The special skill. */
   public String specialSkill;
   
   /** The image. */
   public ImageIcon image;
   
   /** The strong against. */
   public String strongAgainst;
   
   /** The weak against. */
   public String weakAgainst;
   
   

   /**
    *  creates a Companion object with the initial of the companion.
    *
    * @param initial companion's initial
    */
   public Companion(char initial) {
	   
	   // initiates the companion's stats
       if (initial == 'K') {
           name = "Kirin";
           type = "Fire";
           specialSkill = "Blaze";
           strongAgainst = "Cloud";
           weakAgainst = "Water";
           image = new ImageIcon("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\kirin.png");
       }
       else if (initial == 'Y') {
           name = "Yume";
           type = "Cloud";
           specialSkill = "Float";
           strongAgainst = "Dinosaur";
           weakAgainst = "Blaze";
           image = new ImageIcon("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\yume.png");
       }
       else if (initial == 'I') {
           name = "Yuki";
           type = "Dinosaur";
           specialSkill = "Giant steps";
           strongAgainst = "Water";
           weakAgainst = "Cloud";
           image = new ImageIcon("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\yuki.png");
       }
       else if (initial == 'S') {
           name = "Same";
           type = "Water";
           specialSkill = "Splash ";
           strongAgainst = "Blaze";
           weakAgainst = "Dinosaur";
           image = new ImageIcon("C:\\Users\\Gonzaga\\eclipse-workspace\\CCPROG3\\src\\Images\\zet.png");
       }
   }

   /**
    *  sets the health of the companion.
    *
    * @param health health of the companion
    */
   public void setHealth(int health) {
	   if (health < 0)
		   health = 0;
	   
       this.health = health;
   }
   
   /**
    * Gets the health.
    *
    * @return the health
    */
   public int getHealth() {
	   return health;
   }
   
   /**
    * Companion attack
    *
    * @param attacker the attacker
    * @param inflicted the inflicted
    * @return the int
    */
   public int damage(Companion attacker, Companion inflicted) {
		Random random = new Random();
		double damage = random.nextInt(11);
		
		// checks if the damage is stronger or weaker on the inflicted
		if (attacker.strongAgainst.equals(inflicted.type)) 
			damage *= 1.2;
		else if (attacker.weakAgainst.equals(inflicted.type)) 
			damage -= (0.2*damage); 

		return (int) Math.round(damage);
	}
	
   
   /**
    * Activate skill.
    *
    * @param specialSkill the special skill
    */
   public void activateSkill(String specialSkill) {
	   
   }

}
