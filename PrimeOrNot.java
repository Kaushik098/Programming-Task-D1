package decisionMakingAndArrayUsage;

import java.util.*;

public class PrimeOrNot {

	public static void main(String args[]){
	     
		Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int count =0;
	    for(int i=2;i<n/2;i++){
	         if(n%i == 0){	
           	    count=1;	
	             break;
	     }
	   }
	    
	    if(count ==0)
	    	System.out.print(n+" is a prime number");
	    else
	    	System.out.print(n+" is not a prime number");
 }
}
	