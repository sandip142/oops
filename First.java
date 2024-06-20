import java.util.*;

class First
{
  public static void main(String[] args){
    System.out.println(args[0]);
	First.main();
	First.main(2);
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(2);
	System.out.println(arr.get(0));
  }
   public static void main(){
    System.out.println("1234");
  }
  
     public static void main(int a){
    System.out.println("integer");
  }
}