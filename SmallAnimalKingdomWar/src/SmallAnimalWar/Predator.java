package SmallAnimalWar;

//abstract class for all predator animals
abstract class Predator extends Animal {
	
	//constructor for the predator showing name and weight
    public Predator(String name, double weight) {
        super(name, weight);
    }

    //method for the predator hunting an animal and eating it
    public void predate(Prey prey) {
        eat(prey.getWeight());
        System.out.printf("%s the %s eats %s the %s.%n", 
                getName(), this.getClass().getSimpleName(), 
                prey.getName(), prey.getClass().getSimpleName());
    }
}

