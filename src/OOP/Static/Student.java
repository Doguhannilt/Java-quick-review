package OOP.Static;

public class Student {
    public String name;
    static int counter;

    public Student(String name) {
        this.name = name;
        counter++;
    }
}
