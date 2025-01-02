package testing;

public class Circle {
	private double radius;

    // Constructor with argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // No-argument constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        System.out.println("The area of the circle with a radius of " + circle1.getRadius() + " is " + circle1.getArea() + 
                           " and it also has a circumference of " + circle1.getCircumference());

        System.out.println("The area of the circle with a radius of " + circle2.getRadius() + " is " + circle2.getArea() + 
                           " and it also has a circumference of " + circle2.getCircumference());
    }
}

}
