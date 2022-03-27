package Game;

import javax.swing.*;

@SuppressWarnings("serial")
public class Health extends JLabel{
    private boolean healthStatus;
    
    public Health(){
        this.healthStatus = true;
    }

    public boolean isHealth(Companion[] companions, Player player) {
        return healthStatus;
    }
   
}

