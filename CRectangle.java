
/**
 * The CRectangle class implements the abstract methods from
 * CShape and applies them to the logic of an rectangle
 * (having the dimensions of horizontal and vertical
 * radiuses) This class is also a superclass to
 * CSquare
 * @author Julian
 */
public class CRectangle extends CShape{

	/**
	 * This string will hold the message to be displayed
	 */
	private String shapeDisplay;
	
	/**
	 * This string will hold the shapes dimensions (in a specific format)
	 */
	private String shapeDimensions;
	
	/**
	 * This is the CRectangle constructor method. It takes
	 * the two parameters and formats them into a
	 * string.
	 * @param length integer for the length of a rectangle
	 * @param width integer for the width of a rectangle
	 */
	public CRectangle (int length, int width) {
		shapeDimensions = length + "x" + width; //Used by display() and getDimensions()
	}
	
	/**
	 * Combines the shapeDimensions string with the name of the shape
	 * and returns it
	 * @return shapeDisplay
	 */
	public String display() {
		
		shapeDisplay = "RECTANGLE " + shapeDimensions;
		
		return shapeDisplay;
	}

	/**
	 * returns the shapes ID integer
	 * @return shapeID
	 */
	protected int getID() {
		return shapeID;
	}

	/**
	 * Returns only the string holding the shape dimensions
	 * @return shapeDimensions
	 */
	protected String getDimensions() {
		return shapeDimensions;
	}
	
}
