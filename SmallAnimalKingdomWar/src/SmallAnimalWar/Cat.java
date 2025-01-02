package SmallAnimalWar;

//concrete class showing a cat as a predator
class Cat extends Predator {
	
	//constructor showing the cats name and weight
    public Cat(String name, double weight) {
        super(name, weight);
    }

    //shows the cats call (noise the cat makes)
    @Override
    public void call() {
        System.out.printf("%s says 'Meow'.%n", getName());
    }

    //returns string with the cats name and weight
    @Override
    public String toString() {
        return String.format("%s is a Cat weighing %.2f grams.", getName(), getWeight());
    }
}

