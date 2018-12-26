package decisionMakingAndArrayUsage;

import java.util.*;

public class CheckLeapYear {
	public static void main(String args[]){
          
		int year = 2012;
		boolean val = true;
		
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					val = true;
				}
				else{
					val = false;
				}
			}
			else{
				val = true;
			}
		}
		else{
			val = false;
		}
		
		System.out.print(val);
	}
}
