package decisionMakingAndArrayUsage;

import java.util.*;

public class PrimeNumberBetweenTwoIntervals {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int count =0;
		for(int j=a;j<=b;j++){
		    for(int i=2; i<=j/2;i++){
		    	if(j%2 == 0){
		    	    count =1;
		    	    break;
		    	}
		    }
		      if(count == 0)
		    	System.out.print(j+" ");
		    count=0;
		  }
	}
}
