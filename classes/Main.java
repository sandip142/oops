package classes;



public class Main {
    public static void main(String[] args) {
        
        Student s1=new Student(15,"Nirali",168);
        s1.Printdata();
    }
    
}

class Student{
    int Roll_no;
    String name;
    int height;

    Student(int Roll_no,String name,int height){
        this.Roll_no=Roll_no;
        this.name=name;
        this.height=height;
    }
    void Printdata(){
        System.out.println("Roll_no: "+this.Roll_no); 
        System.out.println("Roll_no: "+this.name);
        System.out.println("Roll_no: "+this.name);
    }
}
