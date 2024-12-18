import java.util.Scanner;

class Subtraction {
    // Subtract method with two integers
    int subtract(int a, int b) {
        return a - b;
    }

    // Subtract method with three integers
    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract method with two doubles
    double subtract(double a, double b) {
        return a - b;
    }

    // Subtract method with an array of integers
    int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}

public class subtraction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Subtraction subtractionObj = new Subtraction();

        System.out.print("Enter two integers to subtract: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Result: " + subtractionObj.subtract(num1, num2));

        System.out.print("Enter three integers to subtract: ");
        int num3 = scanner.nextInt();
        System.out.println("Result: " + subtractionObj.subtract(num1, num2, num3));

        System.out.print("Enter two doubles to subtract: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Result: " + subtractionObj.subtract(double1, double2));

        System.out.print("Enter the number of elements for array subtraction: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Result: " + subtractionObj.subtract(numbers));

        scanner.close();
    }
}
