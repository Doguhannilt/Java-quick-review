package OOP.Employee;

public class Employee {

    // The instance data:
    // 1. The name
    // 2. The salary
    // 3. The work hours
    // 4. The hire year
    private String name;
    public double salary;
    private int workHours;
    private int hireYear;

    // 1. The employee constructor accepts 4 parameters that initialize the name,
    // the salary, the work hours and the hire year.
    Employee(int hireYear, String name, double salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // 2. The tax method computes the tax applied on the salary;
    // A-) No tax on a salary that is less than or equal to 1000 Turkish Lira
    // B-) %3 of tax ona salary that is more than 1000 Turkish Lira
    public double Tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    // 3. The bonus method computes the employee's bonus based on the additional
    // work hours. Such that he gets 30 Turkish Lira for an additional hour.
    public double Bonus() {
        int extraHour = this.workHours - 40;
        if (extraHour > 0) {
            return 30 * extraHour;
        }
        return 0.0;
    }

    // 4. The RaiseSalary method computes the raise of employee's salary (consider
    // the actual year is 2015)
    // A-) If he worked less than 10 years the raise of salary will be %5
    // B-) If he worked less than 20 years and more than 9 years the raise of salary
    // will be 10%
    // C-) If he worked more than 19 years the raise of salary will be 15%
    public double RaiseSalary() {
        int year = this.hireYear;
        if (2022 - year < 10) {
            return this.salary * 0.05;
        } else if (2022 - year < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

}
