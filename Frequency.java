import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int i;
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter no. of numbers: ");
            int n = obj.nextInt();
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                System.out.print("Enter a number: ");
                arr[i] = obj.nextInt();
            }
            obj.close();
            int[] fr = new int[arr.length];
            int visited = -1;
            for (i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        fr[j] = visited;
                    }
                }
                if (fr[i] != visited)
                    fr[i] = count;
            }

            for (i = 0; i < fr.length; i++) {
                if (fr[i] != visited)
                    System.out.println(" " + arr[i] + " | " + fr[i]);
            }
        }
    }
}