package inheritance;

public class statinher {
    public static void main(String[] args) {

        boxcolor red=new boxcolor();
        red.stat();
        boxcolor.stat();
        box.stat();  // you can acces static variable  using any object and class because its object independent and common for all
        boxprice.stat();
        System.out.println(red.h);
        System.out.println(red.color);


        
        
    }
    
}
class boxcolor extends box{
        String color;
         
        boxcolor(){
            super.h=h;
            super.print();
            super.stat();
            this.color=color;
        }
}
