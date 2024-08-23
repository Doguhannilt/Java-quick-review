package OOP.Inheritance;

public class App {
    public static void main(String[] args) {
        // PARENT
        Worker c = new Worker("John Doe", "j@j.com", "123-456-7890");
        c.Enter();

        // CHILD
        Academician a = new Academician( "Department", new String[]{"Course 1", "Course 2"}, "Jane Doe", "j@j.com", "123-456-7890");
        a.Enter();
        a.enterCourse();

        // CHILD
        Civil_Servant cs = new Civil_Servant("Department", "Shift", "Jane Doe", "j@j.com", "123-456-7890");
        cs.Enter();
        // cs.enterCourse(); <- Can't access because Civil servant is not subclass of
        // Academician class

        // GRANDCHILD
        Assistant as = new Assistant( "Department", new String[]{"Course 1", "Course 2"}, "Jane Doe", "j@j.com", "123-456-7890");
        as.Enter();
        as.enterCourse();
        as.getAllParameters();

    }
}