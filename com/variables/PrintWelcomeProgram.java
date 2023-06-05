package com.variables;

import java.util.Scanner;
/**
 * Print Welcome to Programming
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */
public class PrintWelcomeProgram {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("What is your name");
	  String name= sc.next();
      System.out.println("Hi,"+name+" wellcome to the program...");
	  sc.close();
		
	}

}
