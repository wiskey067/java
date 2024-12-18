import java.util.Scanner;

class ObjectCounter {
    private static int numberOfObjects = 0;

    public ObjectCounter() {
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects to create: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            new ObjectCounter();
        }

        System.out.println("Number of objects created: " + ObjectCounter.getNumberOfObjects());

        scanner.close();
    }
}
