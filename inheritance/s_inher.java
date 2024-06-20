package inheritance;

public class s_inher {
    public static void main(String[] args) {
        boxprice random= new boxprice(); // no argument
        System.out.println(random.h+" "+random.price+" "+random.b);

        boxprice meta=new boxprice(10,29,30,40); // 3 argumment
        System.out.println(meta.h+" "+meta.b+" "+meta.l+" "+meta.price);

        boxprice tesla=new boxprice(20,60);// one argument
        System.out.println(tesla.h+" "+tesla.b+" "+tesla.l+" "+tesla.price); 

    }
    
}
class boxprice extends box{  // extends keyword inheriit the property  of parent class box
    
    float price;
    boxprice(){
        super.print(); // inherited the method using super keyword   
        this.price=-1;//if there is no super keyword by default it is super() and inherit the no argument constructor
    }
    boxprice(float side,float price){
        
     super(side);// its inherite the propety of one argument constructor
     super.print();// always remember the sequence while using super keyword 
     this.price=price;    
    }
    boxprice(float h,float b,float l,float price){
        super(h,b,l);// by using super and passing the 3 argument inside it its inherit the propepty of 3 argument constructor
        this.price=price;//always write super keyword  at uper side
    }
}
