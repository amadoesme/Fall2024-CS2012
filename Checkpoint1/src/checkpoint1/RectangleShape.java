//Name: Esmeralda Amado

package checkpoint1;

public class RectangleShape {
	
	//two private data values
    private double w;
    private double h;

    //A constructor which takes two arguments, the w and h values
    //prevent the user from entering zero or a negative value for the sizes. 
    //If incorrect values are entered the values will be assigned the default value 1.0.
    
    public RectangleShape(double w, double h) {
        if (w <= 0 || h <= 0) {
            this.w = 1.0;
            this.h = 1.0;
        } else {
            this.w = w;
            this.h = h;
        }
    }

    //Another constructor which takes no arguments. 
    //The no argument constructor will make a rectangle with a default size of 1.0 for both the width and height.
    public RectangleShape() {
        this.w = 1.0;
        this.h = 1.0;
    }

    //Getters and Setters for each variable (double w and double h)
    public double getW() {
        return w;
    }

    //Did this because it prevents the user from entering zero or a negative value for the sizes.
    public void setW(double w) {
        if (w <= 0) {
            this.w = 1.0;
        } else {
            this.w = w;
        }
    }

    public double getH() {
        return h;
    }

    //Did this because it prevents the user from entering zero or a negative value for the sizes.
    public void setH(double h) {
        if (h <= 0) {
            this.h = 1.0;
        } else {
            this.h = h;
        }
    }

    //A toString() that will return a String with the w and h values in this format: RectangleShape(3.4, 2.7) 
    @Override
    public String toString() {
        return "RectangleShape(" + w + ", " + h + ")";
    }

    //A int compareRectangles(RectangleShape otherRectangleShape) method that compares the area of this RectangleShape 
    //with otherRectangleShape. The method will return 1 if this rectangle is larger, if the rectangles are the same 
    //area it will return 0, and if otherRectangleShape is larger it will return -1. 
    
    public int compareRectangles(RectangleShape otherRectangleShape) {
        double thisArea = this.w * this.h;
        double otherArea = otherRectangleShape.w * otherRectangleShape.h;
        return Double.compare(thisArea, otherArea);
    }
}
