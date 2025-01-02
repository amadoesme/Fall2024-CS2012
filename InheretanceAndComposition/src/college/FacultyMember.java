package college;

//java library
import java.util.ArrayList;

//importing info from the Person class
public class FacultyMember extends Person {
	
	//private data variables
    private String employeeId;
    private ArrayList<Course> teachingSchedule; //array list of courses

    //constructor
    public FacultyMember(String name, Address address, String employeeId) {
        super(name, address);
        this.employeeId = employeeId;
        this.teachingSchedule = new ArrayList<>();
    }
    
    //adding getter for the employee id
    public String getEmployeeId() {
        return employeeId;
    }

    //method that adds a course to to the teaching schedule
    public void assignCourse(Course course) {
        teachingSchedule.add(course);
    }

    //method that removes a course to the teaching schedule
    public void dropCourse(Course course) {
        teachingSchedule.remove(course);
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + employeeId + "\nTeaching Schedule: " + teachingSchedule;
    }
}
