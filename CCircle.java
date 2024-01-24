
/**
 * The CCircle class implements the abstract methods from
 * CShape and applies them to the logic of a circle
 * (having only one dimension for its radius) This class is also a subclass to
 * COval
 * @author Julian
 */
public class CCircle extends COval{

	private String shapeDisplay; //This string will hold the message to be displayed
	private String shapeDimensions; //This string will hold the shapes dimensions (in a specific format)
	
	/**
	 * This is the CCircle constructor method. It takes
	 * the one parameter and formats it into a
	 * string.
	 * @param radius
	 */
	 	CCircle(int radius) {
		super(radius, radius);
		shapeDimensions = Integer.toString(radius); //The parameter is converted into a string and used by display() and getDimensions()
	}

	 	/**
		 * Combines the shapeDimensions string with the name of the shape
		 * and returns it
		 * @return shapeDisplay
		 */
	public String display() {
		shapeDisplay = "CIRCLE " + shapeDimensions;
		
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
