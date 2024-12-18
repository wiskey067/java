import java.util.Scanner;

// Define an interface
interface Payroll {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

// Define the Manager class implementing Payroll interface
class Manager implements Payroll {
    public double earnings(double basic) {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    // The Manager class does not implement the bonus method
    public double bonus(double basic) {
        return 0; // Return 0 as managers don't get a bonus
    }
}

// Define the Substaff class extending from Manager and implementing the bonus method
class Substaff extends Manager {
    // Implement the bonus method for Substaff
    public double bonus(double basic) {
        return 0.5 * basic; // Bonus is 50% of basic salary for Substaff
    }
}

// Main class
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Create object of Substaff class
        Substaff substaff = new Substaff();

        // Calculate earnings, deductions, and bonus
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        // Output earnings, deductions, and bonus
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
