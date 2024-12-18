import java.util.Scanner;

abstract class student {
    protected int rollNo;
    protected long regNo;


    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = scanner.nextLong();
    }

    public abstract void course();
}


class kiitian extends student {

    public void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg) in java");
    }
}

// Driver class
public class q1{
    public static void main(String[] args) {
 
        kiitian obj = new kiitian();
        
     
        obj.getInput();
        

        System.out.println("Roll No: " + obj.rollNo);
        System.out.println("Registration No: " + obj.regNo);

        obj.course();
    }
}
