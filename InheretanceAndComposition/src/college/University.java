package college;

/* For the University class I had to get some guidance from my teammates from ASME.
 * The instructions where tricky for me to understand, but in the end i did understand
 */

//java library for making arrays and so the user can interact with the program
import java.util.ArrayList;
import java.util.Scanner;

public class University {
	
	//private variables for the array lists
    private ArrayList<Student> students;
    private ArrayList<FacultyMember> facultyMembers;
    private ArrayList<Course> courses;

    //constructor initializing the array lists
    public University() {
        students = new ArrayList<>();
        facultyMembers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    //making a menu so the user can interact with the university information
    public void menu() {
        Scanner scanner = new Scanner(System.in); //for user interaction
        int choice;
        
        //loop until the user presses the exit option. user chooses option by numbers 1-9
        do {
            System.out.println("1. Add Student"); //if user decides to add a student to the database
            System.out.println("2. Add Faculty Member"); //if user decides to add a professor to the database
            System.out.println("3. Add Course"); //if user decides to add a course to the database
            System.out.println("4. Assign Course to Student"); //if user decides to assign a class to a student
            System.out.println("5. Assign Course to Faculty"); //if user decides to add a course to a professor
            System.out.println("6. List All Students"); //if user decides to check all students in the database
            System.out.println("7. List All Faculty"); //if user decides to check all professors in the database
            System.out.println("8. List All Courses"); //if user decides to check all classes in the database
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            //handling the users choice of number input
            choice = scanner.nextInt();
            scanner.nextLine();
            
            //doing a certain action based on what the user chose
            switch (choice) {
                case 1 -> addStudent(scanner); //adding a student
                case 2 -> addFacultyMember(scanner); //adding a faculty member
                case 3 -> addCourse(scanner); //adding a course
                case 4 -> assignCourseToStudent(scanner); //adding a class to a student
                case 5 -> assignCourseToFaculty(scanner); //adding a class to a professor
                case 6 -> listStudents(); //list of students that have been added to the program
                case 7 -> listFaculty(); //list of faculty members that have been added to the program
                case 8 -> listCourses(); //list of classes that have been added to the program
                case 9 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);
    }

    //method to add a new student
    private void addStudent(Scanner scanner) {
        System.out.print("Enter student name: "); //adding the students name
        String name = scanner.nextLine();
        System.out.print("Enter street number: "); //adding the street number
        String streetNumber = scanner.nextLine();
        System.out.print("Enter street name: "); //adding the street name
        String streetName = scanner.nextLine();
        System.out.print("Enter city: "); //adding the city the student lives in
        String city = scanner.nextLine();
        System.out.print("Enter state: "); //adding the state from where the student lives in
        String state = scanner.nextLine();
        System.out.print("Enter postal code: "); //adding the postal code
        String postalCode = scanner.nextLine();
        System.out.print("Enter CIN: "); //adding the university identification number of the student
        String cin = scanner.nextLine();

        //for when the user wants to see all the information together of the student
        Address address = new Address(streetNumber, streetName, city, state, postalCode);
        Student student = new Student(name, address, cin);
        students.add(student);
        System.out.println("Student added successfully!"); //shows that the student is added to the database
    }

    //method to add a new professor 
    private void addFacultyMember(Scanner scanner) {
        System.out.print("Enter faculty name: "); //user enters the professors name
        String name = scanner.nextLine();
        System.out.print("Enter street number: "); //street number professor lives in
        String streetNumber = scanner.nextLine();
        System.out.print("Enter street name: "); //street name
        String streetName = scanner.nextLine();
        System.out.print("Enter city: "); //city the professor lives in
        String city = scanner.nextLine();
        System.out.print("Enter state: "); //state where the professor lives
        String state = scanner.nextLine();
        System.out.print("Enter postal code: "); //postal code
        String postalCode = scanner.nextLine();
        System.out.print("Enter employee ID: "); //university employee id of the professor
        String empId = scanner.nextLine();

        //information entered for the new faculty member
        Address address = new Address(streetNumber, streetName, city, state, postalCode);
        FacultyMember faculty = new FacultyMember(name, address, empId);
        facultyMembers.add(faculty);
        System.out.println("Faculty member added successfully!"); //shows that the professor was added to the database
    }

    //method for adding a course to the database
    private void addCourse(Scanner scanner) {
        System.out.print("Enter course identifier: "); //id number of the class
        String courseId = scanner.nextLine();
        System.out.print("Enter course name: "); //name of the class 
        String courseName = scanner.nextLine();

        //information of the course that was added to the database
        Course course = new Course(courseId, courseName);
        courses.add(course);
        System.out.println("Course added successfully!"); //shows that the class was added to the database
    }

    //method to assign a course to a student
    private void assignCourseToStudent(Scanner scanner) {
        System.out.print("Enter CIN of the student: "); //university id of the student
        String cin = scanner.nextLine();
        Student student = findStudentByCIN(cin);

        //if the database cant find the student by their id number
        if (student != null) {
            System.out.print("Enter course identifier to assign: "); //adds course number instead
            String courseId = scanner.nextLine();
            Course course = findCourseById(courseId);

            //if it cant find the course by its number id
            if (course != null) {
                student.addCourse(course);
                System.out.println("Course assigned to student successfully!");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    //method to add a professor to teach a course
    private void assignCourseToFaculty(Scanner scanner) {
        System.out.print("Enter faculty employee ID: "); //entering the id number of the professor
        String empId = scanner.nextLine();
        FacultyMember faculty = findFacultyById(empId);

        //if it cant find the id number of the professor
        if (faculty != null) {
            System.out.print("Enter course identifier to assign: "); //adds the course number instead
            String courseId = scanner.nextLine();
            Course course = findCourseById(courseId);

            //if it cant find the course by its number id
            if (course != null) {
                faculty.assignCourse(course);
                System.out.println("Course assigned to faculty successfully!");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Faculty member not found.");
        }
    }
    
    
    //method to remove a student using their university id number
    private void removeStudent(Scanner scanner) {
        System.out.print("Enter CIN of the student to remove: ");
        String cin = scanner.nextLine();
        Student student = findStudentByCIN(cin);

        //if the database cant find the student with their college id
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    
  //method to remove a professor using their employee id number
    private void removeFacultyMember(Scanner scanner) {
        System.out.print("Enter employee ID of the faculty member to remove: ");
        String empId = scanner.nextLine();
        FacultyMember faculty = findFacultyById(empId);

        //if the database cant find the professor by their employee id
        if (faculty != null) {
            facultyMembers.remove(faculty);
            System.out.println("Faculty member removed successfully!"); 
        } else {
            System.out.println("Faculty member not found.");
        }
    }
    
    //method to remove a course from the students schedule
    private void removeCourseFromStudent(Scanner scanner) {
        System.out.print("Enter CIN of the student: ");
        String cin = scanner.nextLine();
        Student student = findStudentByCIN(cin);

        //if the program cant find the student with their college id
        if (student != null) {
            System.out.print("Enter course identifier to remove: ");
            String courseId = scanner.nextLine();
            Course course = findCourseById(courseId);

            //if the program cant find the course by the class id
            if (course != null) {
                student.dropCourse(course);
                System.out.println("Course removed from student successfully!");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    //method to remove a course from a professors schedule
    private void removeCourseFromFaculty(Scanner scanner) {
        System.out.print("Enter faculty employee ID: ");
        String empId = scanner.nextLine();
        FacultyMember faculty = findFacultyById(empId);

        //if the program cant find the professor by id number
        if (faculty != null) {
            System.out.print("Enter course identifier to remove: ");
            String courseId = scanner.nextLine();
            Course course = findCourseById(courseId);

            //if the database cant find the course by its course number
            if (course != null) {
                faculty.dropCourse(course);
                System.out.println("Course removed from faculty successfully!");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Faculty member not found.");
        }
    }
    
    //method to find the student by their student id number
    private Student findStudentByCIN(String cin) {
        for (Student student : students) {
            if (student.getCIN().equals(cin)) {
                return student;
            }
        }
        return null;
    }

    //method to find the professor by their employee id number
    private FacultyMember findFacultyById(String empId) {
        for (FacultyMember faculty : facultyMembers) {
            if (faculty.getEmployeeId().equals(empId)) {
                return faculty;
            }
        }
        return null;
    }

    //method to find a course by their course id number
    private Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    //method to show all students in the database
    private void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //method to show all faculty members in the database
    private void listFaculty() {
        for (FacultyMember faculty : facultyMembers) {
            System.out.println(faculty);
        }
    }

    //method to show all courses in the database
    private void listCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
