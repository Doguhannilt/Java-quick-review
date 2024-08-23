package OOP.Inheritance;

public class Academician extends Worker {
    String department;
    String[] courses;

    Academician( String department, String[] courses, String fullname, String email, String phoneNumber) {
        super(fullname, email, phoneNumber);
        this.department = department;
        this.courses = courses;
    }

    public void enterCourse() {
        System.out.println("Course Entered");
    }

    public void enterDepartment() {
        System.out.println("Department Changed");
    }


}
