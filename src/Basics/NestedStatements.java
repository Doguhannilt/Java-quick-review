package Basics;
import java.util.Scanner;

public class NestedStatements {
    public static void main(String[] args) {
        System.out.println("Input Your Age:");

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int age = Integer.parseInt(text);
        if (age >= 18) {
            System.out.println("You can Vote | You are an adult");
            System.out.println("Input Your Fav Food:");
            String food = sc.nextLine();
            if (food.equals("pizza")) {
                System.out.println("Mine Too!");
            } else {
                System.out.println("Not Mine!");
            }
        }
        else if (age >= 21) {
            System.out.println("You can drink | You are an old man");
        }
        else {
            System.out.println("You cannot do anything with this age!");
        }
    }
}