package SmallAnimalWar;

//concrete class of a bird being a prey
class Bird extends Prey {
	
	//constructor for the birds weight and name
    public Bird(double weight, String name) {
        super(name, weight);
    }

    //implementation of how the bird flees (flys away/escapes)
    @Override
    public void flee() {
        System.out.printf("%s the Bird flies away!%n", getName());
    }

    //implements the noise of the bird (sound it makes)
    @Override
    public void call() {
        System.out.printf("%s chirps.%n", getName());
    }

    //returns string with the birds name and weight
    @Override
    public String toString() {
        return String.format("%s is a Bird weighing %.2f grams.", getName(), getWeight());
    }
}

