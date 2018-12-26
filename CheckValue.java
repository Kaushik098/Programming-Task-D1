package decisionMakingAndArrayUsage;

import java.util.*;

public class CheckValue {
	public static void main(String args[]){
		 
		int a[] = {11,22,33,44,55};
		
		int search_value = 34, count = 0;
		
		for(int i=0; i<a.length; i++)
			 if(a[i] == search_value)
		         count++;
		
		System.out.print((count == 0)?"Value does not exist in Array":"Value exist in Array");
	}
}
