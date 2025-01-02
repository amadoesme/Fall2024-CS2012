package PolymorphisimWeek8;

public class Employee extends Person { //class derived from the Person class

    //private data variables
    private double annualSalary;
    private String nationalInsuranceNumber;
    private int yearStarted;

    //constructor
    public Employee() {
        super();
        this.annualSalary = 0.0;
        this.yearStarted = 0;
        this.nationalInsuranceNumber = "doesn't have one yet";
    }

    //constructor with parameters
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.yearStarted = yearStarted;
    }

    //setters and getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) { 
        this.annualSalary = annualSalary;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    //printing the employee's info
    @Override
    public void print() {
        super.print();
        System.out.println("Employee's annual salary: " + annualSalary);
        System.out.println("Employee's national insurance number: " + nationalInsuranceNumber);
        System.out.println("Year that employee started: " + yearStarted);
    }

    //equals method
    @Override
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return super.equals(e) &&
               this.annualSalary == e.annualSalary &&
               this.yearStarted == e.yearStarted &&
               this.nationalInsuranceNumber.equals(e.nationalInsuranceNumber);
    }

    //main class to test if the code works
    public static void main(String[] args) {
        // Testing the default constructor
        Employee emp1 = new Employee();
        System.out.println("Testing default constructor: ");
        emp1.print();
        System.out.println();

        // Testing constructor with parameters
        Employee emp2 = new Employee("Edward", 200000, 2018, "NI123456");
        System.out.println("Testing constructor with parameters: ");
        emp2.print();
        System.out.println();

        // Testing setters
        emp2.setAnnualSalary(250000);
        emp2.setYearStarted(2020);
        emp2.setNationalInsuranceNumber("NI654321");

        // Printing updated employee info
        System.out.println("Updated Employee Info: ");
        emp2.print();
    }
}
