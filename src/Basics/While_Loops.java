package Basics;
import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number > 5) {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
        }

    }
}