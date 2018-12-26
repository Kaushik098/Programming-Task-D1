package decisionMakingAndArrayUsage;

import java.util.*;
public class ReverseOfANumber {
  public static void main(String args[]){
	   
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int rem=0;
	  
	  while(n>0){
		  rem = n%10;
		  System.out.print(rem);
		  n=n/10;
	  }
	  
  }
} 
