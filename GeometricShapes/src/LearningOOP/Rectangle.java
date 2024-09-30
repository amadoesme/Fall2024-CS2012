package LearningOOP;

public class Rectangle {
	
	private String color;
	private double width;
	private double height;
	
	//default constructor
	Rectangle(){
	}
	
	//constructor with three attributes
	Rectangle(double newWidth, double newHeight, String newColor){
		width = newWidth;
		height = newHeight;
		color = newColor;
	}
	
	//getting for color
	public String getColor(){
		return color;
	}
	
	//setting for color
    public void setColor(String newColor) {
        color = newColor;
    }
    
    //getting for width
    public double getWidth(){
    	return width;
    }
    
    //setting for width
    public void setWidth(double newWidth) {
    	width = newWidth;
    }
    
    //getting for height
    public double getHeight(){
    	return height;
    }
    
    //setting for height
    public void setHeight(double newHeight) {
    	height = newHeight;
    }
    
    //returns area of the shape
    double getArea() {
    	return width * height;
    }
}
