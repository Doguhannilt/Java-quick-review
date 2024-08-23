package OOP.Inheritance;

public class Assistant extends Academician {
    
    Assistant(String department, String[] courses, String fullname, String email, String phoneNumber) {
        super(department, courses, fullname, email, phoneNumber);
    }

    public void getAllParameters() {
        System.out.println("Department: " + department);
        System.out.println("Courses: " + courses);
        System.out.println("Fullname: " + fullname);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
