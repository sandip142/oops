package classes;

public class pack {
    public static void main(String[] args) {
        message();
    }
    public static void message(){

        jayesh sandip=new jayesh(182,"sandip");
        System.out.println(sandip.height);
        System.out.println(sandip.name);
        System.out.println("hey!! i am here");
    }
}

 class jayesh{
          int height;
          String name;

          jayesh(int height,String name){
            this.height=height;
            this.name=name;
          }
}
