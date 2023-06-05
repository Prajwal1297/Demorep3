package com.oparators;

import java.util.Scanner;
/**
 * Currency denomination program
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */

public class currencyDenomination {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n1= sc.nextInt();
		int res100 = n1/100;
		n1=n1-(res100*100);
		int res50= n1/50;
		n1=n1-(res50*50);
		int res10=n1/10;
		System.out.println(res10+"," +res50+","+res100);
	}

}
