package Assignment3;

import java.util.Scanner;

public class q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int userInputLoop = 5;
		int startPoint = 1;
		for(int i=1;i<=userInputLoop;i++)
		{
		    System.out.println("Value of i is " + startPoint*n);
		   
		    startPoint = startPoint * (i+1);
		}
	sc.close();
	}

}
//20,22,24,25,26,27