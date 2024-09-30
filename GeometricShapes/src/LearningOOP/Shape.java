/* Names: Esmeralda Amado
 * Course: CS2012
 * Section: 01 & 4
 * Description: Learning to use Object Oriented Programming
 * Other comments: Besides the lectures I read the Liang
 * textbook (chap 9) and it was very helpful for this assignment. 
 * I did it similar to the example the book provided.
 */

package LearningOOP;

public class Shape {

	public static void main(String[] args) {
		
		//creating a circle with radius one and color pink
		Circle circle1 = new Circle(1, "pink");
		System.out.println("The area of the " + circle1.getColor()
							+ " circle with a radius of "+ circle1.getRadius()
							+ " is " + circle1.getArea());
		
		//creating a circle with radius 25 and color pink
		Circle circle2 = new Circle(25, "yellow");
		System.out.println("The area of the " + circle2.getColor()
							+ " circle with a radius of "+ circle2.getRadius()
							+ " is " + circle2.getArea());
		
		//creating an instance of a square with sides 4 and color red
		Square square1 = new Square(4, "red");
		System.out.println("The area of the " + square1.getColor()
							+ " square with sides of " + square1.getSide()
							+ " is " + square1.getArea());
		
		//creating an instance of a square with sides 12 and color purple
		Square square2 = new Square(12, "purple");
		System.out.println("The area of the " + square2.getColor()
							+ " square with sides of " + square2.getSide()
							+ " is " + square2.getArea());
		
		//creating an instance of a rectangle with a width of 4, height 2 and color green
		Rectangle rectangle1 = new Rectangle(4, 2, "green");
		System.out.println("The area of the " + rectangle1.getColor()
		                    + " rectangle with a width of " + rectangle1.getWidth()
		                    + " and a height of " + rectangle1.getHeight()
		                    + " is " + rectangle1.getArea());

		//creating an instance of a rectangle with a width of 20, height 10 and color blue
		Rectangle rectangle2 = new Rectangle(20, 10, "blue");
		System.out.println("The area of the " + rectangle2.getColor()
		                    + " rectangle with a width of " + rectangle2.getWidth()
		                    + " and a height of " + rectangle2.getHeight()
		                    + " is " + rectangle2.getArea());
	}
}
