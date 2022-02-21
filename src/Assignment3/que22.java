package Assignment3;

import java.util.Scanner;

public class que22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
       int n=sc.nextInt();
       int startpoint=1;
       int difference = 1;
       for(int i=1;i<=n;i++)
		{
			System.out.println("Value of i is " + startpoint);
		    int printValue = startpoint + difference;
		     startpoint = difference;
		     difference = printValue;
		   
		}
	sc.close();
	}
}


