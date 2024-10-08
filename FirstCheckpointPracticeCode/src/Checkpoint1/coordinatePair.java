package Checkpoint1;

public class coordinatePair {
	private int x;
	private int y;
	
	public coordinatePair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public coordinatePair() {
		this.x =0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int gety() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//toString method
	@Override
	public String toString() {
		return "CoordinatePair(" + x + ", " + y + ")";
	}
	
	//method to calculate euclidean distance
	public double getEuclideanDistance(coordinatePair otherPair) {
		int deltaX = this.x - otherPair.x;
		int deltaY = this.y - otherPair.y;
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}
}
