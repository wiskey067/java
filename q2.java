// Define the Motor interface
interface Motor {
    int capacity = 100; // Default capacity
    void run();
    void consume();
}

// Implement the Motor interface in WashingMachine class
class WashingMachine implements Motor {
    // Override methods from Motor interface
    public void run() {
        System.out.println("Washing machine is running...");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity...");
    }
}

// Main class
public class q2{
    public static void main(String[] args) {
        // Create an object of WashingMachine class
        WashingMachine machine = new WashingMachine();

        // Print the capacity of the motor through the object
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
