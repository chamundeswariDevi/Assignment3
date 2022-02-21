package Assignment3;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
				{
					System.out.print(j);
				}
				
				else 
				{
					System.out.print(i);
				}
				
			}
			System.out.println();
		}
	}
		
	}


