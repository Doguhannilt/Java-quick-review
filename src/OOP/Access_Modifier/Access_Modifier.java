package OOP.Access_Modifier;

public class Access_Modifier {
    public static void main(String[] args) {
        Car car = new Car();

        // You can't access this data from outside the class
        // car.enginePower = 100;
        // car.engine = 1;
        
        // You can access this data from outside the class
        car.speed = 0;

        // You can't access this data from outside the class
        // car.color = "red";
    }
}