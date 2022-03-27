package map;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class EncounterSames extends JLabel{
    private boolean samesStatus;
    public EncounterSames(){
        this.samesStatus = true;
    }

    public boolean isBrick() {
        return samesStatus;
    }

}
