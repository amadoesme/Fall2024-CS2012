package college;

//java library
import java.util.ArrayList;

//importing information from the Person class
public class Student extends Person {
	
	//private data variables
    private String cin;
    private ArrayList<Course> courseSchedule; //turning the courses into an array list

    //constructor for private data variables
    public Student(String name, Address address, String cin) {
        super(name, address);
        this.cin = cin;
        this.courseSchedule = new ArrayList<>();
    }
    
    //adding a getter for CIN
    public String getCIN() {
        return cin;
    }

    //method that adds a course to the course schedule
    public void addCourse(Course course) {
        courseSchedule.add(course);
    }

    //method that removes a course from the course schedule
    public void dropCourse(Course course) {
        courseSchedule.remove(course);
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + "\nCIN: " + cin + "\nCourses: " + courseSchedule;
    }
}
