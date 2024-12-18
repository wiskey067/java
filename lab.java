import java.util.Scanner;

class plate {
    int length , width; 
    public plate(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class box extends plate {
    int height;

    public box(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }

}

class woodenbox extends box {
    int thickness;
    public woodenbox(int length, int width, int height, int thickness) {
   super(length,width,height);
   this.thickness=thickness;
    }
    public int area() {
        return 2 * ((length * width) + (height * thickness));
    }
}

public class lab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dim of box");
        int l = sc.nextInt();
        int w = sc.nextInt(); 
        int h = sc.nextInt();
        int t = sc.nextInt(); 
        woodenbox w1 = new woodenbox(l,w,h,t);
        System.out.println("the dimensions are"+w1.length +""+w1.height +""+w1.width+"" +w1.thickness);
        int area = w1.area();
        System.out.println("the area is"+area);

    }
}
