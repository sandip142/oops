package polymorphism;

public class overr {
    public static void main(String[] args) {
        sum two=new sum(2,3,4);
        two.print();
        two.print(two.a,two.b);
        two.print(two.a,two.b,two.c);  // polymorphism means one boy can doing many task 
        // like it shall became student ,sun ,waiter like wise he has many task but h is mane is same 
        //according that we can use same name of method or constructor two passing defferent number of 
        //argument inside it and perform many operation using it with one name
        // mark this point poly means many and morphism means form actuallly it is  nothing but 
        //many forms of single method or constructor
        
    }
}
class sum{
    int a; 
    int b;
    int c;
     void print(){
        System.out.println(-1);
     }
    sum(int a,int b){
        
        this.a=a;
        this.b=b;
        
    }
    void print(int a,int b){
        System.out.println(this.a+this.b);
        
    }
    sum(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void print(int a,int b,int c){
     System.out.println(this.a+this.b+this.c);
    }
    
}
