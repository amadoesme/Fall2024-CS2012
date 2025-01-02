package testing;

public class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    // Constructor with name, age, weight, and height in inches
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with name, weight, and height in inches (age defaults to 20)
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    // New constructor with name, age, weight, feet, and inches
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches; // Convert feet and inches to total inches
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // Method to calculate BMI
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    // Method to get BMI status
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        // Example usage
        BMI bmi1 = new BMI("John Doe", 25, 150, 5, 10);
        System.out.println("Name: " + bmi1.getName());
        System.out.println("Age: " + bmi1.getAge());
        System.out.println("Weight: " + bmi1.getWeight() + " pounds");
        System.out.println("Height: " + bmi1.getHeight() + " inches");
        System.out.println("BMI: " + bmi1.getBMI());
        System.out.println("Status: " + bmi1.getStatus());
    }
}

