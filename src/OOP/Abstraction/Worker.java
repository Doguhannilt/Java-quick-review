package OOP.Abstraction;

public class Worker {
    String fullname, email;
    String phoneNumber;

    public Worker(String fullname, String email, String phoneNumber) {
        this.fullname = fullname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void Enter() {
        System.out.println("Worker Entered!");
    }
}
