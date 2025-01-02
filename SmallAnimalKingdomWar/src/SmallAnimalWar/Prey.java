package SmallAnimalWar;

//abstract class for all animals who are the prey
abstract class Prey extends Animal {
	
	//constructor with the preys name and weight
    public Prey(String name, double weight) {
        super(name, weight);
    }

    //abstract method representing how the prey flees
    public abstract void flee();
}
