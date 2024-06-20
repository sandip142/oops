package classes;

import java.util.*;


public class ex {
    public static void main(String[] args) {
        boy[] sandip=new boy[8];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            System.out.println("enter the prn and name of "+i+"th person");
            sandip[i].prn=sc.nextInt();
            sandip[i].name=sc.nextLine();
            System.out.println(i+": prn::"+sandip[i].prn);
            System.out.println("\t\t name::"+sandip[i].name);
        }
        
    }
    
}
class boy{
    String name;
    int prn;
}
