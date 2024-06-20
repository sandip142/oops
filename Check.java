// variable in java 

//static variable:- always declare in class outside of main method
//local variable:-scope is locally inside that perticular block ,declare in class  anywhere rather than main method
//instance variable:-declare in main method 

public class Check {
	int a=40;
	 void local()
	{
		int z=10;
		System.out.println(z);
	}
	
	static int b=20;  //when classload static variable aoutomatic loaded should 
	
    public static void main(String[] args) {
       // int b@c=100;
       // int c# =200;
        //int b1=20;
        //int _k;
        //int -l;
		//int a_z;
        //int a-b;
		//int _k;
		
		int c=200;
		System.out.println(c);
		System.out.println(b);
		Check o1 =new Check();
		o1.local();
		System.out.println(o1.a);
		
		
    }
}