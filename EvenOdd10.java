import java.util.Scanner;

public class EvenOdd10 {
    public static void main(String[] args) {        
        int i, x, c1 = 0, c2 = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < 10; i++) {
                System.out.println("Enter num");
                x = scanner.nextInt();
                if (x % 2 == 0)
                    c1++;
                else
                    c2++;
            }
        }
        System.out.println("No. of Even Numbers: " + c1);
        System.out.println("No. of Odd Numbers: " + c2);
    }
}