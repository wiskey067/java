import java.util.Scanner;

public class Occur {
    public static void main(String[] args) {
        int i, j;
        int n;

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter no. of numbers: ");
            n = obj.nextInt();
            int arr[] = new int[n];

            for (i = 0; i < n; i++) {
                System.out.print("Enter a number: ");
                arr[i] = obj.nextInt();
            }

            int c;

            for (i = 0; i < n; i++) {
                c = 0;  
                for (j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        c++;
                    }
                }
                System.out.println("Number of occurrences of " + arr[i] + " is " + c);
            }
        }
    }
}
