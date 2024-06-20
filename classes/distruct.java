package classes;

public class distruct {
    public static void main(String[] args) {

        women obj;

        for(int i=0;i<100000000;i++){
            obj= new women("jagruti");
        }
        
    }
    
}
class women{
    String name;
    float height;
    int age; 
    
    women(String name){
        this.name=name;
        System.out.println("object is created"+this);
      
        
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
    System.out.println("object is destroyed");
    }
}
