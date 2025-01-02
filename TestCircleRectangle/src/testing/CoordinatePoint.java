package testing;

public class CoordinatePoint {

	//private data variables
	private int x;
	private int y;
	
	//A constructor which takes two arguments, the x and y values
	public CoordinatePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Another constructor which takes no arguments
	public CoordinatePoint() {
		this.x = 0;
		this.y = 0;
	}
	
	//Getters and setters for each variable (x and y)
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//A toString() that shows the x and y values in this format: CoordinatePair(2, -5)
	@Override
	public String toString() {
		return "Coordinate Pair(" + x + ", " + y + ")";
	}
	
	//A double getEuclideanDistance(CoordinatePair otherPair) method that calculates and returns the Euclidean distance between the instance CoordinatePair and otherPair. 
	public double getEuclideanDistance(CoordinatePoint otherPair) {
		int deltaX = this.x - otherPair.x;
		int deltaY = this.y - otherPair.y;
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}
	
	public static void main(String[] args) {
		CoordinatePoint point1 = new CoordinatePoint(2, -5);
		CoordinatePoint point2 = new CoordinatePoint(-1, 5);
		
		System.out.println("Point 1: " + point1);
		System.out.println("Point 2: " + point2);
		
		double distance = point1.getEuclideanDistance(point2);
		System.out.println("Euclidean Distance: " + distance);
	}
}
