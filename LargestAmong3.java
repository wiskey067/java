import java.util.*;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = obj.nextInt();
        System.out.print("Enter a Number: ");
        int y = obj.nextInt();
        System.out.print("Enter a Number: ");
        int z = obj.nextInt();
        int largest;
        if (x > y && x > z)
            largest = x;
        else if (y > x && y > z)
            largest = y;
        else
            largest = z;
        System.out.println("Largest Number: " + largest);
        obj.close();
    }
}