package OOP.Employee;

public class EmpDriver {
    public static void main(String[] args) {

        Employee emp = new Employee(
                2015,
                "John",
                2000,
                30);

        System.out.println("Tax: " + emp.Tax());
        System.out.println("Bonus: " + emp.Bonus());
        System.out.println("Raise Salary: " + emp.RaiseSalary());
        double totalSalary = emp.salary + emp.Bonus() - emp.Tax() + emp.RaiseSalary();
        System.out.println("Total Salary: " + totalSalary + " Turkish Lira");
    }
}