
public class Armstrong {

	public static void main(String[] args) {
		int n=407,add=0;
		int r,var;
		
		var=n;
		
		while(var!=0)
		 {
		  r=var%10;
		  var=var/10;
		  add+=(r*r*r);
		 }
		
		if(add==n)
	   	 { 
		  System.out.println(""+n+" is an Armstrong number.");
		 }
		else
		 {
		  System.out.println(""+n+" is not an Armstrong number.");
		 }

	}

}
