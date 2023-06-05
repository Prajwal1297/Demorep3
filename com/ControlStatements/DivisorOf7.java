package com.ControlStatements;
import java.util.Scanner;
/**
 *  Divisor Of 7 program
 *  program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class DivisorOf7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if((num%7)==0) {
			System.out.println("It is Divisor of 7");
		}else {
			System.out.println("It is not Divisor of 7");
		}

	}

}
