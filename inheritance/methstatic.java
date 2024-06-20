package inheritance;
public class methstatic {
    public static void main(String[] args) {
       
    }
    static void fun(){
      //greeting(); //its trow an error because u cant call non static mathod inside static one
      // u can make a object and u can call greeting method
      methstatic obj=new methstatic();
      obj.greeting();
    }
 
        void greeting(){
        System.out.println("hey helllo buddy");
        fun();//u can call static method inside  non static one

    }
    
}
