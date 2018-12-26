package decisionMakingAndArrayUsage;

import java.util.*;

public class ArrayTranspose {

	public static void main(String args[]){
		
		int row = 2;
		int column = 2;
		int a[][] = new int[row][column];
		int x=1;
		
		System.out.println("Before tranpose");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				   a[i][j] = x;
				   x++;
				   System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After tranpose");
		for(int i=0;i<column;i++){
			for(int j=0;j<row;j++){
				   System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		       
		
		
	}
}
