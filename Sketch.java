import processing.core.PApplet;

public class Sketch extends PApplet {


	/**
  * Description: 
  * Write a program that demonstrates a method with parameters and a return value
  * @author: Tao A
  */

  int dimension = 500;  // set this for a global dimension value >= 100
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(dimension, dimension);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(161, 185, 207);
  }

  /**
    * this function returns the x / y values of the centre of the screen after drawing the object of the given size
    * @param size  size of cross hair
    * @return the x / y value for the object to be drawn in the middle of the screen
    */
  public int[] drawCrossHair(int size) {
    fill(247, 2, 2);
    int midpoint = dimension / 2;
    rect(midpoint, midpoint,
         size * dimension / 400, 3 * dimension / 400);
    rect(midpoint + size / 2, midpoint - size / 2,
         3 * dimension / 400, size * dimension / 400);

    int[] location = new int[2];
    location[0] = midpoint;
    location[1] = midpoint;

    // return the x / y value for the object to be drawn in the middle of the screen
    return location;
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    float flowerX = 300 * dimension / 400;
    float flowerY = 270 * dimension / 400;
    float petalSize = 50 * dimension / 400;
    float petalDistance = petalSize / 2;

    fill(195, 149, 199);

// upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// center petal
    fill(248, 252, 131);
    ellipse(flowerX, flowerY,
        petalSize, petalSize);

// flower stem
    stroke(128);
    strokeWeight(3/2);
    line(300 * dimension / 400, dimension,
         300 * dimension / 400, 305 * dimension / 400);

// rectangle of the house
    fill(189, 154, 102);
    rect(50 * dimension / 400, 149 * dimension / 400,
         180 * dimension / 400, 250 * dimension / 400);
    
// door of the house
    fill(135, 108, 68);
    rect(95 * dimension / 400, 270 * dimension / 400,
         90 * dimension / 400, 125 * dimension / 400);
    
// roof of the house
    fill(135, 108, 68);
    triangle(50 * dimension / 400, 150 * dimension / 400,
             135 * dimension / 400, 60 * dimension / 400,
             230 * dimension / 400, 150 * dimension / 400);
    
// grass
    fill(97, 173, 97);
    rect(0, 365 * dimension /400,
         dimension, 35 * dimension / 400);

    int size = 30;  // size of the cross-hair
    int[] coord = drawCrossHair(size);
  }
  // define other methods down here.
}