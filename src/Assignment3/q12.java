package Assignment3;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
	      {
	          
	          for(int j=i;j<=n-1;j++)
	          {
	            
	            System.out.print("* ");
	          }
	 
	        System.out.println("");
	      }
	 
		for(int i=0;i<n-1;i++)
	      {
	          for(int j=0;j<i;j++)
	          {
	              System.out.print("* ");
	          }
	          System.out.println();
	      }  
		sc.close();
	}

}
