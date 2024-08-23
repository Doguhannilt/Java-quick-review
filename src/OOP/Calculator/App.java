package OOP.Calculator;

public class App {
    public static void main(String[] args) {

        // Class Name | Object Name = new Class Name();
                        //Constructor
        Calculator calc = new Calculator(1,3);
        calc.add();
       
        int multiply = calc.multiply();
        System.out.println(multiply);


    }


}