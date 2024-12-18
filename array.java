
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] roll = new int[n];
        String[] name = new String[n];
        double[] cgpa = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Roll: ");
            roll[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            name[i] = scanner.nextLine();
            System.out.print("CGPA: ");
            cgpa[i] = scanner.nextDouble();
        }
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - Roll: " + roll[i] + ", Name: " + name[i] + ", CGPA: " + cgpa[i]);
        }
        double lowestCGPA = cgpa[0];
        int lowestCGPAIndex = 0;
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < lowestCGPA) {
                lowestCGPA = cgpa[i];
                lowestCGPAIndex = i;
            }
        System.out.println("\nStudent with the lowest CGPA: " + name[lowestCGPAIndex] + " (CGPA: " + lowestCGPA + ")");
        scanner.close();
    }
}
}