package inheritance;
public class stat {
    public static void main(String[] args) {
        human sandip=new human("sandip",19,false);
        human rahul=new human("rahul",26,true);
        human harshal=new human("harshal",20,false);
        System.out.println(human.population);//u can access static by using class also and object also but by convension you have to go by class for an object

        System.out.println(human.population);
        System.out.println(human.population);
    }
}
class human{
    String name;
    int age;
    boolean married;
    static int population;

    human(String name,int age,boolean married){
        this.name=name;
        this.age=age;
        this.married=married;
        human.population+=1;  //access by class because static is commmon for all object and it is object independent

    }
}
