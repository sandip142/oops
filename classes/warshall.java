package classes;
import java.util.*;
 

public class warshall {
    public static void main(String[] args) {
        int[][] d=new int[5][5];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of vertices:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
              if(i!=j){
                System.out.print("d["+i+"]["+j+"] =");
                d[i][j]=sc.nextInt();
              }
            }
        }
        System.out.println("*******************************************************");
        System.out.println("the given graph is as follows :");
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
             if(i==j){
                d[i][j]=0;
                System.out.print(d[i][j]+" ");
             }else{
                System.out.print(d[i][j]+" ");
             }
            }
            System.out.println();
        }
            System.out.println();
            System.out.println("*******************************************************");
            System.out.println("the sortest path is as follows: ");
              
            for(int k=0;k<n;k++){
                for(int m=0;m<n;m++){
                    for(int j=0;j<n;j++){
                        if(d[m][j]>d[m][k]+d[k][j]){
                            d[m][j]=d[m][k]+d[k][j];
                            System.out.print(d[m][j]+" "); 
                        }
                    }
                    System.out.println();
                }
        }
        
    }
    
}
