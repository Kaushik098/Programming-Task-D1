package decisionMakingAndArrayUsage;

import java.util.*;

public class SumOfDigits {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0,rem=0;
		
		while(n>0){
			rem = n%10;
			sum+= rem;
			n = n/10;
		}
		
		System.out.print(sum);
	}
}
