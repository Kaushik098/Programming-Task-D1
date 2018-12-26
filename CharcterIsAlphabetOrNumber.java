package decisionMakingAndArrayUsage;

import java.util.*;

public class CharcterIsAlphabetOrNumber {
 
    public static void main(String args[]){
    	
    	char ch = '&';
    	
    	if(( ch >= 65 && ch <= 90) || (ch >= 97 && ch >= 122))
    		     System.out.print("Entered charater is an Alphabet");
    	else if( ch >= 48 && ch <=57 )
    		System.out.print("Entered character is an Digit");
    	else
    		System.out.print("Entered character is neither an Aplphabet or Number");
    	
    }
	
}
