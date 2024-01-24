import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;


/**
 * The CCanvas class is what is responsible for:
 * - Generating the random values that will be
 * passed onto the CShape subclasses
 * - Randomly deciding what shapes will be
 * kept in a list
 * - Producing the list of shapes (with no
 * duplicate shapes) to be displayed
 * - Displaying the final list of shapes
 * - Containing the 'main' portion of the program
 * from which the program will be executed
 * @author Julian
 */
public class CCanvas {

	/**
	 * Official list that will hold final/accepted shapes (unique)
	 */
	private List<CShape> shapesList;
	
	/**
	 * Amount of shapes to be displayed
	 */
	private static final int NUM_SHAPES = 10;
	
	/**
	 * 
	 * Constructor that will take a list (that has been
	 * checked for duplicates) and copy it into the final 
	 * list
	 * @param shapes is a list of CShape type
	 */
	public CCanvas(List<CShape> shapes) { 
		this.shapesList = new ArrayList<>(shapes);
	}
	
	/**
	 *  
	 * This method creates a CShape HashSet and String
	 * HashSet (one to hold the actual CShape shapes
	 * and the other to keep track of used dimensions
	 * @return new CCanvas containing non-duplicate
	 * shapes
	 */
	public static CCanvas generateShapes() {
		HashSet<CShape> randomShapes = new HashSet<>();
		HashSet<String> uniqueDimensions = new HashSet<>();
		Random rand = new Random();
		
		while (randomShapes.size() < NUM_SHAPES) {
			int shapeChoice = rand.nextInt(4);
			CShape newShape = createShape(shapeChoice, rand); //Shape being created and then will be checked
			
			String shapeDimensions = newShape.getDimensions();
			
			/**
			 * So if the dimensions of the shape that was just created
			 * matches any dimension within our String HashSet, it means
			 * it's not unique and will not be added to randomShapes
			 */
			if(uniqueDimensions.add(shapeDimensions)) {
				randomShapes.add(newShape);
			}
			else {
				System.out.println("Haha, nice try!");
			}
			
			
		}
		return new CCanvas(new ArrayList<>(randomShapes));
	}
	/**
	 * 
	 * Will create a single shape. It may produce duplicates.
	 * If a duplicate is produced, it will not be added to
	 * the shape list in a separate method. The only purpose
	 * of this method is to create a shape
	 * @param shapeChoice is an integer that decides which shape
	 * will be generated
	 * @param rand is a Random type variable and is used to provide
	 * random dimensions
	 * @return One of the 4 different cases will return its own shape
	 * using one of the CShape subclasses
	 */
	private static CShape createShape(int shapeChoice, Random rand) {
		
		switch (shapeChoice) {
		
		case 0:
			return new CCircle(rand.nextInt(100) + 1);
			
		case 1:
			return new COval(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
			
		case 2:
			return new CSquare(rand.nextInt(100) + 1);
			
		case 3:
			return new CRectangle(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
		}
		return null;
		
	}
	/**
	 * This method provides the programs output and prints
	 * each shape from the shapeList (which will not contain
	 * duplicates) with their dimensions along with
	 * a number corresponding to the order in which they're
	 * printed (if the NUM_SHAPES is 15, the final shape would
	 * be "Shape 15: ")
	 */
	public void display() {
		System.out.println(">> Canvas has the following random shapes:\n");
		
		for (int i = 0; i < shapesList.size(); ++i) {
			System.out.println("Shape " + (i + 1) + ": " + shapesList.get(i).display() + "\n");
			
		}
	}
	
	/**
	 * 
	 * This is the 'main' portion of the program. This is
	 * where the generateShapes() method will be called and
	 * will produce a CCanvas that will then use the
	 * display() method
	 * @param args an array for main
	 */
	public static void main(String[] args) {
	
		CCanvas myCanvas = generateShapes();
		myCanvas.display();
		
	}

}