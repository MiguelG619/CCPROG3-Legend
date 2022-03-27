package map;
import javax.swing.*;

@SuppressWarnings("serial")
public class Brick extends JLabel{
    private boolean brickStatus;
    public Brick(){
        this.brickStatus = true;
    }

    public boolean isBrick() {
        return brickStatus;
    }
}
