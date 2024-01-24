
/**
 * Shape class for all shapes
 */
public abstract class CShape {
	
	/**
	 * A static integer meant to keep track of when certain shapes are being
	 * generated. Its contemporary value will be copied by int shapeID
	 */
    private static int shapeCounter = 0;
    
    /**
     * A protected integer meant to keep track of when the shape was generated relative to others
     */
    protected int shapeID;

    /**
     * Constructor method
     */
    public CShape() {
        shapeCounter++;
        shapeID = shapeCounter;
    }

    /**
     * Each shape will be able to display its
     * own info (name and dimensions)
     * @return the String to be displayed
     */
    protected abstract String display();
    
    /**
     * Each shape will be able to return its
     * dimensions as a string
     * @return the string containing a shapes dimensions
     */
    protected abstract String getDimensions();

    /**
	 * returns the shapes ID integer
	 * @return shapeID
	 */
    protected int getID() {
        return shapeID;
    }
}
