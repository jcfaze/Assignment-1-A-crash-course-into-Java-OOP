
/**
 * The CSquare class implements the abstract methods from
 * CShape and applies them to the logic of a square
 * (having only one dimension for the length of all of
 * its sides). This is also a subclass of CRectangle
 * @author Julian
 */
public class CSquare extends CRectangle{

	/**
	 * This string will hold the message to be displayed
	 */
	private String shapeDisplay;
	
	/**
	 * This string will hold the shapes dimensions (in a specific format)
	 */
	private String shapeDimensions;
	
	/**
	 * This is the CSquare constructor method. It takes
	 * the one parameter and formats it into a
	 * string. It also calls to the CRectangle
	 * constructor method, since it is also a 
	 * rectangle
	 * @param sideLengths integer for the length of the sides of a square
	 */
	 	CSquare(int sideLengths) {
		super(sideLengths, sideLengths);
		shapeDimensions = sideLengths + "x" + sideLengths; //Used by display() and getDimensions()
	}

	 	/**
		 * Combines the shapeDimensions string with the name of the shape
		 * and returns it
		 * @return shapeDisplay
		 */
	public String display() {
		shapeDisplay = "SQUARE " + shapeDimensions;
		
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
