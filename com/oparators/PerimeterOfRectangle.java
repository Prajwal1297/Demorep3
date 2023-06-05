package com.oparators;
import java.util.Scanner;
/**
 * Perimeter of rectangle program
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */
public class PerimeterOfRectangle {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int length= sc.nextInt();
	int breadth = sc.nextInt();
	
	System.out.println(2*length + 2*breadth);
	
	}

}
