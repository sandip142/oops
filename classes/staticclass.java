package classes;
public class staticclass {
    static class test{  //class also being static but not external class it must be internal class foer ex test is inside the class staticclass 
        String name;
        public test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) { //in this statement main function is static because it is not depend on another object of class
        test a=new test("sayali");
        test b=new test("sandip");

        System.out.println(a.name);
        System.out.println(b.name);
    }
    
}
/* inside Sysytem.out.println()   System is a class   out is variable  and println is an function 
 * where out is act as an object in this statement
 */