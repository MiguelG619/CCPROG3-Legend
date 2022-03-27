package map;

/**
 * 
 * a JLabel method for the finish line
 *
 */
public class End {
	// initializes endStatus as a boolean
	private boolean endStatus;
	
	/**
	 * sets endStatus as true
	 */
    public End(){
        this.endStatus = true;
    }

    /**
     * 
     * @returns the boolean Status
     */
    public boolean isBrick() {
        return endStatus;
    }
}