package OOP.Try_Catch_Exception;

public class Throw {

    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a cannot be 0");
            throw new RuntimeException("a cannot be 0");
        }
     
    }
}
