package Basics;
public class Condition_Statements {
    public static void main(String[] args) {
        boolean a = true;
        if(a == true) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Goodbye, World!");
        }
        String Greets = "Hello, World!";
        if (Greets.startsWith("G")) {
            System.out.println("The message is a greeting");
        } else {
            System.out.println("The message is not a greeting");
        }
        int x = 5;
        if (x == 5) {
            System.out.println("The number is 5");
        } 
        else if (Greets.length() == 11) {
            System.out.println("The message is 11 characters long");
        }
        else {
            System.out.println("The number is not 5");
        }
    }
}