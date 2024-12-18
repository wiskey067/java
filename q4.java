import java.util.Scanner;

// Define an interface Emploee
interface Employee {
    void getDetails();
}

// Define a derived interface Manager
interface Manager extends Employee {
    void getDeptDetails();
}

// Define the Head class implementing Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    // Implement the getDetails method
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        empName = scanner.nextLine();
    }

    // Implement the getDeptDetails method
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
    }

    // Method to print all details of the employee
    public void printDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

// Main class
public class q4{
    public static void main(String[] args) {
        Head head = new Head();

        // Get employee details
        head.getDetails();

        // Get department details
        head.getDeptDetails();

        // Print all details
        System.out.println("Output:");
        head.printDetails();
    }
}
