package OOP.Inheritance;

public class Civil_Servant extends Worker {
    String department, shift;

    Civil_Servant(String department, String shift, String fullname, String email, String phoneNumber) {
        super(fullname, email, phoneNumber);
        this.department = department;
        this.shift = shift;   
    }

    public void Enter() {
        System.out.println("Civil Servant Enter");
    }
}
