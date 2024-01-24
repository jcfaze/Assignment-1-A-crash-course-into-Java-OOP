
/**
 * The COval class implements the abstract methods from
 * CShape and applies them to the logic of an oval
 * (having the dimensions of horizontal and vertical
 * radiuses) This class is also a superclass to
 * CCircle
 * @author Julian
 */
public class COval extends CShape{

	/**
	 * This string will hold the message to be displayed
	 */
	private String shapeDisplay;
	
	/**
	 * This string will hold the shapes dimensions (in a specific format)
	 */
	private String shapeDimensions;
	
	/**
	 * This is the COval constructor method. It takes
	 * the two parameters and formats them into a
	 * string.
	 * @param horizontalRadius integer for the horizontal radius of an oval
	 * @param verticalRadius integer for the vertical radius of an oval
	 */
	public COval (int horizontalRadius, int verticalRadius) {
		shapeDimensions = horizontalRadius + "x" + verticalRadius; //Used by display() and getDimensions()
	}
	
	/**
	 * Combines the shapeDimensions string with the name of the shape
	 * and returns it
	 * @return shapeDisplay
	 */
	public String display() {
		
		shapeDisplay = "OVAL " + shapeDimensions;
		
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
