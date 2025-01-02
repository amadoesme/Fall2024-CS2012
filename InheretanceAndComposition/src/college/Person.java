package college;

public abstract class Person {
	
	//private data variables
    private String name;
    private Address address;

    //constructor for the private variables
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    //toString for the constructor
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address.toString();
    }
}
