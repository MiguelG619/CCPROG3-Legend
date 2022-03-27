package map;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class EncounterYume extends JLabel{
    private boolean yumeStatus;
    public EncounterYume(){
        this.yumeStatus = true;
    }

    public boolean isBrick() {
        return yumeStatus;
    }

}
