package OOP.Static;

public class App {
    public static void main(String[] args) {
       Student student = new Student("John");
       Student student2 = new Student("Doe");
       System.out.println(student.counter);
       System.out.println(student2.counter);
    }
}