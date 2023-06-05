package com.oparators;
import java.util.Scanner;
/**
 * Simple Interest program
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principle,Rate and Years.");
		 int principle= sc.nextInt();
		 int rate= sc.nextInt();
		 int n= sc.nextInt();
		 System.out.println((principle*rate*n)/100);
	}

}
