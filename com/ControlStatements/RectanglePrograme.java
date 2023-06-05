package com.ControlStatements;
import java.util.Scanner;
/**
 *  Rectangle of area and perimeter Programe
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class RectanglePrograme {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
	   if((length * breadth) > 2*(length+breadth)){
		   System.out.println("Area of the Rectangle is greater than perimeter of Rectangle");
	   }else {
		   System.out.println("Area of the Rectangle is not greater than perimeter of Rectangle");
	   }
		
	}

}
