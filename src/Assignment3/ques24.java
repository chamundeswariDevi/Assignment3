package Assignment3;

import java.util.Scanner;

public class ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int startPoint = 1;
		for(int i=1;i<=n;i++)
		{
		    System.out.println(startPoint);
		    startPoint = startPoint + (i+1);
		   
		}
	sc.close();
	}

}
