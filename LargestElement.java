package decisionMakingAndArrayUsage;

import java.util.*;

public class LargestElement {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int a[] = new int [n];
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		max = a[0];
		
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		
		System.out.print(max);
		
	}
	
}
