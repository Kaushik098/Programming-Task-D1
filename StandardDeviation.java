package decisionMakingAndArrayUsage;

import java.util.*;

public class StandardDeviation {

	public static void main(String args[]){
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 double d[] =new double[n];
		 
		 double sum = 0.0, stand_dev = 0.0;
		 int length = d.length;
         double mean = 0.0;
         
		 for(int i=0;i<length;i++){
			  d[i] = sc.nextInt();
			  sum+=d[i];
		 }

			 
		 mean = sum/length;
		 
		 for(int i=0; i<length; i++)
			 stand_dev+= Math.pow((d[i]-mean), 2);
		 
		double sd = Math.sqrt(stand_dev/length);
			 
			 System.out.print(sd);
		 
		 
	}
}
