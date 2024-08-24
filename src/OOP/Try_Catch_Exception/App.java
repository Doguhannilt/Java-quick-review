package OOP.Try_Catch_Exception;

public class App {
    public static void main(String[] args) {
        try{
            int a = 2/0;
            System.out.println(a);
        }catch(ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}