import java.util.*;

class InOut{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Welcome to Rcpit:");
    System.out.println("enter your First name:");
    String  fname = sc.nextLine();
	 System.out.println("enter your last name:");
    String  lname = sc.nextLine();
	 System.out.println("enter your education:");
    String  edu = sc.nextLine();
	 System.out.println("enter your address:");
    String  address = sc.nextLine();
	 System.out.println("enter your email:");
    String  email = sc.nextLine();
	 System.out.println("enter your contact:");
    double  contact = sc.nextDouble();
	sc.nextLine();
	 System.out.println("enter your password:");
    String  password = sc.nextLine();
	 System.out.println("enter your percentage:");
    double percentage = sc.nextDouble();
	
	System.out.println("your first name:"+fname);
	 System.out.println("your last name:"+lname);
    System.out.println("your education:"+edu);	
  System.out.println("your address:"+address);
    System.out.println("your email:"+email);
     System.out.println("your contact:"+contact);
    System.out.println("your password:"+password);
    System.out.println("your percentage:"+percentage);
	System.out.println("Register Succesfully");
	System.out.println("Please Enter your login Credentials");
	sc.nextLine();
	System.out.println("Enter Your Email:");
	String email2= sc.nextLine();
	System.out.println("Enter Your password");
	String password2 =sc.nextLine();
	
	if(email2.equals(email) && password2.equals(password))
	{
		System.out.println("Login succefully");
	}else{
		System.out.println("Please check your credentials");
	}
	}
}