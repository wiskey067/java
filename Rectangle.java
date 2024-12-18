import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public void setDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();  

        scanner.close();  
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
