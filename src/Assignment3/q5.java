package Assignment3;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=8;i++)
		{
		     for(int j=1;j<=8;j++)
		    {
		    	 
		    	 if(i==1 || i==8 || j==1 || j==8) 
		    	 {
		    		 System.out.print("* ");
		    	 }
		    	 else
		    	 {
		    		 System.out.print("  ");
		    	 }
		    }
		   System.out.println(" ");		
		    
		}
	}

}
