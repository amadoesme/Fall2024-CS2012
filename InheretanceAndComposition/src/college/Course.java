package college;

public class Course {
	
	//private data variables
    private String courseId;
    private String courseName;

    //constructor for the private data variables
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    //adding getters 
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    //toString method
    @Override
    public String toString() {
        return courseId + ": " + courseName;
    }
}
