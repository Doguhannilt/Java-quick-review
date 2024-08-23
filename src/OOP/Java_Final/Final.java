package OOP.Java_Final;

public class Final {

    // The final keyword in Java is used to indicate that a variable, method, 
    // or class cannot be changed or overridden after it has been initialized or 
    // declared. When you declare a variable as final, its value becomes constant, 
    // meaning it cannot be modified once it has been assigned.
    final double pi = 3.14;

    // The final keyword in Java is used to indicate that a variable, method, 
    // or class cannot be changed or overridden after it has been initialized or 
    // declared. When you declare a variable as final, its value becomes constant, 
    // meaning it cannot be modified once it has been assigned.
    final int number = 5;

    // The final keyword in Java is used to indicate that a variable, method,
    // or class cannot be changed or overridden after it has been initialized or
    // declared. When you declare a variable as final, its value becomes constant,
    // meaning it cannot be modified once it has been assigned.
    final String name = "John";

    // The final keyword in Java is used to indicate that a variable, method,
    // or class cannot be changed or overridden after it has been initialized or
    // declared. When you declare a variable as final, its value becomes constant,
    // meaning it cannot be modified once it has been assigned.
    final int[] numbers = { 1, 2, 3, 4, 5 };
    
    void Print() {
        System.out.println(this.pi);
        System.out.println(this.number);
        System.out.println(this.name);
        System.out.println(this.numbers[0]);
    }
}
