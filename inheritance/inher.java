package inheritance;

public class inher {
    public static void main(String[] args) {
        
    }
    
}
class box{
    float h;
    float b;
    float l;
    public static void stat(){
        System.out.println("jai ho");
    }

    void print(){
        System.out.println("i am get inherited");
    }

    box(){
        this.h=-1;
        this.b=-1;
        this.l=-1;
    }
    box(float side){
        this.h=side;
        this.b=side;
        this.l=side;
    }
    box(float h,float b,float l){
        this.h=h;
        this.b=b;
        this.l=l;
    }

    box(box old){
        this.h=old.h;
        this.b=old.b;
        this.l=old.l;
    }
}