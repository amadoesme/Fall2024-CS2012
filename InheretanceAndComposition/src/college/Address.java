package college;

public class Address {
	
	//private data variables
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String postalCode;

    //constructor for the private data variables
    public Address(String streetNumber, String streetName, String city, String state, String postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    //toString that we have to do after the constructor
    @Override
    public String toString() {
        return streetNumber + " " + streetName + ", " + city + ", " + state + " " + postalCode;
    }
}
