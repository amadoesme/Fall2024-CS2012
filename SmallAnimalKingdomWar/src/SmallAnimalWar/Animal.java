package SmallAnimalWar;

//abstract class with private variables
abstract class Animal {
    private String name;
    private double weight;

    //constructor that initializes the animals name and height
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    //method to increase the animals weight 
    public void eat(double foodWeight) {
        this.weight += foodWeight;
    }

    //abstract class that represents the animals call
    public abstract void call();

    //showing animals weight and name
    @Override
    public String toString() {
        return String.format("%s is an Animal weighing %.2f grams.", name, weight);
    }
}

