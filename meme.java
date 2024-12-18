class Pen {
    String color ;
    String type;
    public void write(){
       System.out.println("thinking about it" );
    }
    public void PrintColor(){
        System.out.println(this.color);

    }
        
    }
    class Student{
        int rollno;
        String name;
        int age;
        public void PrintName()
        {
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.rollno);
        }
    }
public class meme{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type ="gelpen";
        Pen pen2 = new Pen();
        pen2.color="green";
        pen2.type="ballpen";
        pen1.write();
        pen1.PrintColor();
        pen2.PrintColor();
        Student s1 = new Student();
        s1.name = "raj";
        s1.age=23;
        s1.rollno=2205452;
        s1.PrintName(); 
    }
}