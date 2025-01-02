package testing;

public class MyPoint {
    
    // Data fields
    private double x;
    private double y;
    
    // No-arg constructor that creates a point (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    // Constructor that constructs a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter methods
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    // Method that returns the distance from this point to a specified point of the MyPoint type
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
    // Method that returns the distance from this point to another point with specified x- and y-coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    
    // Static method that returns the distance from two MyPoint objects
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 4);
        
        // Display the distance between point1 and point2
        System.out.println("Distance from point1 to point2: " + point1.distance(point2));
        
        // Display the distance from point1 to specified coordinates (5, 6)
        System.out.println("Distance from point1 to (5, 6): " + point1.distance(5, 6));
        
        // Display the distance between point1 and point2 using the static method
        System.out.println("Distance between point1 and point2 (static method): " + MyPoint.distance(point1, point2));
    }
}

