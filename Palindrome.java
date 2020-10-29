
public class Palindrome {

	public static void main(String[] args) {
		int rem,var;
		int reverse=0,n=1001;
		
		var=n;
		
		 while(n>0)
		 {
		   rem=n%10;
		   reverse=(reverse*10)+rem;
		   n=n/10;
		 }
		
          if(var==reverse)
           {
        	System.out.println(""+var+" is a Palindrome number.");
           }
          else
           {
        	 System.out.println(""+var+" is not Palindrome number.");
           }
	}

}
