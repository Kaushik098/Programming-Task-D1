package decisionMakingAndArrayUsage;

import java.util.*;

public class NumberPalindrome {
     public static void main(String args[]){
    	 
    	 Scanner sc =new Scanner(System.in);
    	
    	 int n = sc.nextInt();
    	 int copy_n=n;
    	 String rev_str="";
    	 int rem = 0;
    	
    	 while(n>0)
    	 {
    	    rem = n%10;
    	    rev_str+= Integer.toString(rem);
    	    n = n/10;
    	 }
    	 
    	 int rev_num = Integer.parseInt(rev_str);
    	 
    	 if(rev_num == copy_n)
    		 System.out.print(copy_n+" is a palindrome");
    	 else
    		 System.out.print(copy_n+" is not a palindrome");
    	 
    	 
    	 
     }
}
