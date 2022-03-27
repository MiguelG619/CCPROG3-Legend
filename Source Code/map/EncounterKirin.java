package map;

import javax.swing.JLabel;



@SuppressWarnings("serial")
public class EncounterKirin extends JLabel{
    private boolean kirinStatus;
    public EncounterKirin(){
        this.kirinStatus = true;
    }

    public boolean isBrick() {
        return kirinStatus;
    }

}

