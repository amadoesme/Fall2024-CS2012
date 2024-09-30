package LearningOOP;

public class Circle {

	private String color;
	
	private double radius;
	
	//default constructor
	Circle(){
	}
	
	//constructor with radius and color
	public Circle(double newRadius, String newColor){
		radius = newRadius;
		color = newColor;
	}
	
	//getting the radius of the circle
	public double getRadius() {
		return radius;
	}
	
	//setting a radius for this circle
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	//getting color for the circle
	public String getColor() {
		return color;
	}
	
	//setting color for the circle
	public void setColor(String newColor) {
		color = newColor;
	}
	
	//calculating the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
