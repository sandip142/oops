package classes;

public class obj {
    public static void main(String[] args) {
        Student sandip=new Student(); //default constructor
        sandip.prn=211101017;
        sandip.name="Sandip Kankhare";
        sandip.marks=92.7f;


        System.out.println("prn: "+sandip.prn);
        System.out.println("name: "+sandip.name);
        System.out.println("marks: "+sandip.marks);
        
    }
    
}
class Student{
    int prn;
    String name;
    float marks;
}
