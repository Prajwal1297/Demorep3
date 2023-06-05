package com.variables;

import java.util.Scanner;
public class GreetUser {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// creating a scanner object for getting input from the user
		System.out.println("Please enter the User name:");
		String userName = read.next();
		System.out.println("Hello "+userName+"!");
		read.close();
	}

}
