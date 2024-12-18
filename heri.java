class shape {
    String color;

}
class triangle extends shape{
       System.out.println("Enter the base of the Triangle:");
}

public class heri {
    public static void main(String args[]){
        triangle t = new triangle();
        t.color="red";
        System.out.println(t.color);
    }
}
