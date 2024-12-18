import java.util.*;

public class LeftRightDiagonal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i, j;
        int arr[][] = new int[3][3];
        int c1 = 0, c2 = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter a number: ");
                arr[i][j] = obj.nextInt();
                if (i == j) {
                    c1 += arr[i][j];
                }
                if (i + j == 2) {
                    c2 += arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagonal = " + c1);
        System.out.println("Sum of secondary diagonal = " + c2);
    }
}
