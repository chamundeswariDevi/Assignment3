package Assignment3;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
	      {
			for(int k=i;k<n;k++)
			
	 
	          
	          for(int j=0;j<=2*i;j++)
	          {
	            
	            System.out.print("* ");
	           }
			
	          System.out.println();
	      }
		for(int i=n;i>0;i--)
	      {
	    	  for(int k=i;k<n;k++)
	          System.out.print("  ");
	 
	          
	         
	    	  for(int j=2*i;j>1;j--)
	          {
	    		  System.out.print("* ");
	      }
	          System.out.println();
	      }
	 sc.close();
	}

}

