import java.util.Scanner;

class AreaCalculator {
    // Method to calculate and display the area of a circle
    void calculateCircleArea(double radius) {
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + circleArea);
    }

    // Method to calculate and display the area of a triangle
    void calculateTriangleArea(double base, double height) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);
    }

    // Method to calculate and display the area of a square
    void calculateSquareArea(double sideLength) {
        double squareArea = Math.pow(sideLength, 2);
        System.out.println("Area of the square: " + squareArea);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                areaCalculator.calculateCircleArea(radius);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                areaCalculator.calculateTriangleArea(base, height);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                areaCalculator.calculateSquareArea(sideLength);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }
        scanner.close();
    }

}