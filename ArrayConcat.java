package decisionMakingAndArrayUsage;

import java.util.*;

public class ArrayConcat {
     
	public static void main(String args[]){
     	 
	    int a[] = {10,20,30,40,50};
	    int b[] = {20,40,60,80,100};
	    
	    int n = a.length + b.length;
	    
	    int c[] = new int[n];
	    int x=0;
	    
	    for( int i=0; i<a.length;i++){
	    	c[x] = a[i];
	    	x++;
	    }
	   
	    
	    for(int i=0;i<b.length;i++){
	    	c[x] = b[i];
	    	x++;
	    }
	    
	    //printing the array after concatenation
	    for(int i=0;i<n;i++)
	    	System.out.print(c[i]+" ");
		
     }
	
}
