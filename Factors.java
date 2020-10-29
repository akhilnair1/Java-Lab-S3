
public class Factors {

	public static void main(String[] args) {
	
		int n = 24;
		int i;
		
		System.out.println("Factors of "+n+" :");
		for(i=1;i<=n;i++)
		{
		 if(n%i==0)
		 {
			System.out.println(""+i);
		 }
		}

	}

}
