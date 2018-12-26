package decisionMakingAndArrayUsage;

import java.util.*;

public class PowerOfNumber {

	public static void main(String args[]){
		
	   Scanner sc = new Scanner(System.in);
	   int number = sc.nextInt();
	   int pow = sc.nextInt();
	   long val=1;
	   
	   while(pow!=0){
		   val*=number;
		   --pow;
	   }
	   
	   System.out.print(val);
}
}

