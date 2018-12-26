package decisionMakingAndArrayUsage;

import java.util.*;


public class MultiplyUsingFunc {
        
	 	

       public static void main(String args[]) {
    	    
    	   Scanner sc = new Scanner(System.in);
    	    int row = sc.nextInt();
		    int column = sc.nextInt();
			
			int a[][] = new int[row][column];
			int b[][] = new int[row][column];
			
			
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					a[i][j] = sc.nextInt();
					
				}
			}
		
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					b[i][j] = sc.nextInt();
				}
			}
		
			Multiply(a,b,row,column);
			
    	   
       }

	public static void Multiply(int[][] a, int[][] b,int row, int column) {
		
		int c[][] = new int[row][column];
		// TODO Auto-generated method stub
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
