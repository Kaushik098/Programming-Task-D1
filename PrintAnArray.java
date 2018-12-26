package decisionMakingAndArrayUsage;

import java.util.*;
public class PrintAnArray {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] = new int[10];
	int n = a.length,j=100;
	//get an array values and print
	for(int i:a){
		a[i] = ++j;
		System.out.print(a[i]+" ");
	}
	
	
  }
}
