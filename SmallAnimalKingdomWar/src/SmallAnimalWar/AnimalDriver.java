package SmallAnimalWar;

//from java library
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//main driver class
public class AnimalDriver {
    public static void main(String[] arg) {
        Random r = new Random();
        
        //cat object known as the predator
        Cat precious = new Cat("Precious", 1223.34);

        //list of object of all the prey animals
        List<Prey> prey = new ArrayList<>();
        Mouse m1 = new Mouse(25.3, "Mickey");
        Mouse m2 = new Mouse(28.0, "Minnie");
        Bird b1 = new Bird(50.9, "Daisy");
        Bird b2 = new Bird(55.1, "Donald");

        //adding prey animals to the list
        prey.add(m1);
        prey.add(m2);
        prey.add(b1);
        prey.add(b2);

        //printing the initial state of the cat
        System.out.println(precious.toString());
        precious.call();

        //printing the initial state of all the prey animals
        StringBuilder sb = new StringBuilder();
        for (Prey p : prey)
            sb.append(p.toString()).append("\n");
        System.out.println(sb);

        //predator-prey interactions
        for (Prey p : prey) {
            p.call(); //each prey makes its call (noise)
            if (r.nextBoolean()) {
                precious.predate(p); //if random value is true, predator is eaten
            } else {
                p.flee(); //if random value is false, predator flees (escapes)
            }
        }

        //final weight of the predator after eating its preys
        System.out.println("\nFinal weight of " + precious.getName() + ": " + precious.getWeight() + " grams.");
    }
}

