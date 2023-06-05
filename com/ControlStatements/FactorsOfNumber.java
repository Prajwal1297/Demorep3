package com.ControlStatements;

import java.util.Scanner;

/**
 * Factors Of Number program
 * 
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		int i = 1;
		while (i <= number) {
			if (number % i == 0)
				System.out.println(i);
			i++;
		}
		read.close();
	}

}
