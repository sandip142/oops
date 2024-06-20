package classes;

public class cons {
    public static void main(String[] args) {
      human sandip=new human();
      sandip.print(); // calling no argument constuctor
      
      human yashodip=new human("yashodip",174,19);
      yashodip.print(); // caalling parametric constuctor

      human harshal=new human(sandip);
      harshal.print();  //calling properties of other object in this object
    }
    
}
class human{
    String name;
    float height;
    int age;        // class define

    human(){
        this.name="sandip"; // no argument contructor
        this.height=162;
        this.age=19;
    }
    human(String name, float height, int age){
        this.name=name;   //paramatric constructor
        this.height=height;
        this.age=age;

    }
    void print(){
        System.out.println("name: "+this.name);
        System.out.println("height: "+this.height+" cm");
        System.out.println("age: "+this.age);
    }
    human( human other){
        this.name=other.name;
        this.height=other.height;
        this.age=other.age;
    }
}
