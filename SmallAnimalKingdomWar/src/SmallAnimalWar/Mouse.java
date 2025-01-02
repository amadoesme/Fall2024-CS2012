package SmallAnimalWar;

//concrete class showing a mouse being a prey
class Mouse extends Prey {
	
	//constructor of the mouse name and weight
    public Mouse(double weight, String name) {
        super(name, weight);
    }

    //implements how the mouse flees (escapes from predator)
    @Override
    public void flee() {
        System.out.printf("%s the Mouse scurries away quickly!%n", getName());
    }

    //implements the animals sound (noise that the mouse makes)
    @Override
    public void call() {
        System.out.printf("%s squeaks.%n", getName());
    }
 
    //returns string with the mouses name and weight
    @Override
    public String toString() {
        return String.format("%s is a Mouse weighing %.2f grams.", getName(), getWeight());
    }
}

