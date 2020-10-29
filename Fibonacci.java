
public class Fibonacci {

	public static void main(String[] args) {
		int i,n=7;
		int a=0,b=1;
		int next;
		
      System.out.println("Fibonacci Sequence till "+n+" is :");
      
        for(i=0;i<n;i++)
         {
        	System.out.println(""+a);
        	next=a+b;
        	a=b;
        	b=next;
        	
        	
         }
      
	}

}
