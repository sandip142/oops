package classes;

public class meth {
    public static void main(String[] args) {
        man sandip=new man();
        sandip.print();
        sandip.greeting();//giving output hello!! my name is sandip
        sandip.changeName("yashodip");//change the name sandip to yashodip
        sandip.greeting();//giving output hello!! my name is yashodip
        sandip.print();
        
        Student rahul=new Student();
        System.out.println(rahul.name);
    }
    
}

class man{
    String name;
    float height;
    int age;

    void greeting(){
        System.out.println("hello !! my name is "+this.name);
    }

    void changeName(String name){
        this.name=name;
    }

    void print(){
        System.out.println("name: "+this.name);
        System.out.println("height: "+this.height+" cm");
        System.out.println("age: "+this.age);
    }

    man(){
        this.name="sandip kankhare";
        this.height=173;
        this.age=19;
    }

}