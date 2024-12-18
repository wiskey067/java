interface Greeter {
    void greet();
}

public class anonymous{
    public static void main(String[] args) {

        // Create an anonymous class instance that implements Greeter
        Greeter greeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hello, world!");
            }
        };

        // Call the greet method on the anonymous object
        greeter.greet();
    }
}
