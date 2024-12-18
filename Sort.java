import java.util.*;

public class Sort {
    public static void main(String[] args) {
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

            System.out.println("Original Array:");
            printArray(arr);

            bubbleSort(arr, n);

            System.out.println("\nSorted Array in Ascending Order:");
            printArray(arr);
        }
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
