class Student{
    String name ;
    int id ;
    public void Info(String name){
    System.out.println(name);}
    public void Info(int id){
        System.out.println(id);
    }
    public void Info(String name, int id) {
        System.out.println(name + " " + id);
    }
    

}
public class poly {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name="elina";
    s1.id=2205452;
    s1.Info(s1.id);
    }
}
