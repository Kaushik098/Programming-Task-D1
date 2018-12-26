
package programmingFundamentals;

import java.util.*;

public class AreaPerimeterOfRectangle {

	public static void main (String args[]){
		
		double length = 8.5;
		double breadth  = 5.6;
		
		double perimter = 2*(length+breadth);
		double area = length * breadth;
		
		System.out.printf("%.2f \n", perimter);
		System.out.printf("%.2f \n", area);
	}
}
