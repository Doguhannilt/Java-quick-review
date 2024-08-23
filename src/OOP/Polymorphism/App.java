package OOP.Polymorphism;

import OOP.Polymorphism.Calculator_Poly;

public class App {
    public static void main(String[] args) {
        Calculator_Poly calc = new Calculator_Poly();

        // Calling add() method with two parameters
        int sum1 = calc.add(1, 2); 
        System.out.println("Sum1: " + sum1);

        // Calling add() method with three parameters
        int sum2 = calc.add(1, 2, 3); 
        System.out.println("Sum2: " + sum2);
    }
}