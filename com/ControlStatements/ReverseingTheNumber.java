package com.ControlStatements;
import java.util.Scanner;
/**
 *  Reversing The Number Program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class ReverseingTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int N = scan.nextInt();
		
		System.out.println("Digits in reverse order");
		
      while(N != 0){
    	  int digit = N % 10;
         System.out.println(digit + " ");
         N /= 10;
      }
        System.out.println();
	   
	}
}
