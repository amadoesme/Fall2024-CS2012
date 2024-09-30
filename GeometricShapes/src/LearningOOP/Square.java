package LearningOOP;

public class Square {

    private double side;
    private String color;

    //default constructor
    Square() {
    }

    //constructor with sides and color
    public Square(double newSide, String newColor) {
        side = newSide;
        color = newColor;
    }

    //getting for side
    public double getSide() {
        return side;
    }

    //setting for side
    public void setSide(double newSide) {
        side = newSide;
    }

    //getting for color
    public String getColor() {
        return color;
    }

    //setting for color
    public void setColor(String newColor) {
        color = newColor;
    }

    //calculating the area of the square
    public double getArea() {
        return side * side;
    }
}
