package com.ControlStatements;
import java.util.Scanner;
/**
 * Check Positive Or Negetive Number program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class CheckPositiveOrNegetiveNumber {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		int a1 = sc.nextInt();
		 if(a1>0) {
			System.out.println("It is a Positive Number");
		}else {
	       System.out.println("It is a Negative number");
		}

	}

}
