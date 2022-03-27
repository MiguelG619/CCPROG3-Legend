package map;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class EncounterYukis extends JLabel{
    private boolean yukisStatus;
    public EncounterYukis(){
        this.yukisStatus = true;
    }

    public boolean isBrick() {
        return yukisStatus;
    }

}
