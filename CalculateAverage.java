package decisionMakingAndArrayUsage;

import java.util.*;

public class CalculateAverage {

	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		double avg,sum = 0;;
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		
		avg = sum/n;
		
		System.out.print(sum+" "+avg);
	
	}
	
}
