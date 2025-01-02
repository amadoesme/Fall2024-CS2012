package testing;

//chap 10 programming excersies

public class rectangle {
	
	//double data fields
	private double width;
	private double height;
	
	//no arg constructor
	public rectangle() {
		this.width = 1;
		this.height = 1 ;
	}
	
	//specified constructor
	public rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//setters and getters
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}
	
	public static void main(String[] args) {
		
		rectangle rec1 = new rectangle(4, 40);
		rectangle rec2 = new rectangle(3.5, 35.9);
		
		System.out.println("The area of the rectangle with a width of " + rec1.getWidth() + " and a height of " + 
		                    rec1.getHeight() + " is " + rec1.getArea() + " and it also has a perimeter of " + rec1.getPerimeter());
		
		System.out.println("The area of the rectangle with a width of " + rec2.getWidth()+ " and a height of " + 
		                    rec2.getHeight() + " is " + rec2.getArea() + " and it also has a perimeter of " + rec2.getPerimeter());
	}
}
