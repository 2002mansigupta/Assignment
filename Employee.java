package anudip;

// Base class Employee
// Base class Employee
class Employe {
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    public Employe(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Subclass Manager that extends Employee
class Manager extends Employe{
    double bonus;

    // Constructor to initialize manager details, including bonus
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);  // Call the constructor of the Employee class
        this.bonus = bonus;
    }

    // Method to display manager details, including bonus
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the displayDetails method of Employee
        System.out.println("Manager Bonus: " + bonus);
    }
}

// Main class to test the Employee and Manager classes
public class Employee {
    public static void main(String[] args) {
        // Creating an Employee object
        Employe emp = new Employe("John Doe", 101, 50000);
        emp.displayDetails();

        System.out.println();

        // Creating a Manager object
        Manager mgr = new Manager("Jane Smith", 102, 80000, 15000);
        mgr.displayDetails();
    }
}
