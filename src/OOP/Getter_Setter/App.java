package OOP.Getter_Setter;

public class App {
    public static void main(String[] args) {
        Book b1 = new Book("Java for beginners", "John", "ABC", 100);
        System.out.println(b1.getNumberOfPage());
        b1.setNumberOfPage(300);
        System.out.println(b1.getName());
        System.out.println(b1.getNumberOfPage());
    
    
    }
}