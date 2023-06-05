package com.ControlStatements;
import java.util.Scanner;
/**
 * Currency CompareValues program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */
public class CompareValues {

	public static void main(String[] args) {
		
		int first;
		int second;
		Scanner sc= new Scanner(System.in);
		//Reading the inputs from the user
		
		System.out.println("Please enter values greater than zero and also do not enter the same number");
		System.out.println("enter the First number");
		
		first= sc.nextInt();
		System.out.println("enter the Second number");
		second= sc.nextInt();
		
		//nested if.. else condition testing
		if((first > 0 && second > 0) && (first != second )) {
		if(first>second) {
			System.out.println(first+" is greater than "+second);
		}else {
			System.out.println(second+" is greater than "+first);
		}
		}else {
			System.out.println("Please enter values greater than Zero");
		}
		
	}
	
}
