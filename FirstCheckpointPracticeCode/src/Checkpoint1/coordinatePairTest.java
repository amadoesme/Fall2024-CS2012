package Checkpoint1;

public class coordinatePairTest {
	public static void main(String[] args) {
			
			//create two pair coordinated objects
			coordinatePair point1 = new coordinatePair(2, -5);
			coordinatePair point2 = new coordinatePair(-1, 5);
			
			//print the coordinate objects
			System.out.println("Point 1: " + point1);
			System.out.println("Point 2: " + point2);
			
			//calculate and print the euclidean distance between the two points
			double distance = point1.getEuclideanDistance(point2);
			System.out.println("Euclidean Distance: " + distance);
		}
}
