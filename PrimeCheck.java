
public class PrimeCheck {

	public static void main(String[] args) {
		int a = 29;
		int i,flag = 0;
		
		for(i=2;i<=a/2;i++)
		{
		  if(a%i==0)
		   {
			 flag=1;
			 break;
		   }
		}
		  
		  if(flag==0)
	       {
			System.out.println(""+a+" is a Prime number.");
		   }
		  else
		   {
			 System.out.println(""+a+" is not Prime.");
		   }
		
	}
}
