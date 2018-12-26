package decisionMakingAndArrayUsage;

import java.util.*;
public class SumOfNumbers {
	
	public static void main(String args[]){
	     
	   Scanner sc = new Scanner(System.in);
	   
	   int a[] = new int[5];
	   int sum=0;
	   
	  for(int i=0;i<a.length;i++)
		  a[i]= sc.nextInt();

	   for(int i=0;i<a.length; i++){
	       sum+=a[i];
	   }
	   
	   System.out.print(sum);
	   
	}
}
