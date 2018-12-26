package decisionMakingAndArrayUsage;

import java.util.*;

public class GCDofTwoNumbers {
     
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    
	    int first_value = sc.nextInt();
	    int second_value = sc.nextInt();
	    int gcd=0;
	    
	    for(int i=1; i<=first_value && i<=second_value; i++){
	    	if((first_value%i==0) && (second_value%i==0))
	    			{
	    		          gcd = i;
	    			}
	    }
	    
	    
	    System.out.print(gcd);
	}
}
