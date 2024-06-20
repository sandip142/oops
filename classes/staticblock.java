package classes;



public class staticblock {
    static int a=4;
    static int b;
    
    //static block is only call once
    static {
        System.out.println("i am the staticblock");
        b=a*5;
    }
    public static void main(String[] args) {
        
    
    staticblock s=new staticblock();
    System.out.println(s.a+" "+s.b);

    b+=5;

    staticblock k=new staticblock();
    System.out.println(k.a+" "+k.b);
    
    staticblock j=new staticblock();
    System.out.println(j.a+" "+j.b);
    } 
}
