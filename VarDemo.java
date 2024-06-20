class VarDemo{
  int z=105; //non static varible 
  static int c=200;
   void display()
   {
	   int x=205;
	   //static int p=1001;
	   System.out.println(x);
	   System.out.println(z);
   }
   public static void main(String[] args)
   {
	   int y=100;
	   System.out.println(y);
	   VarDemo d2= new VarDemo();
	   System.out.println(d2.z);
	   System.out.println(d2.c);
	   System.out.println(c);
	   System.out.println(VarDemo.c);
	   d2.display();
   }
}