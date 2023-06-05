package com.ControlStatements;
import java.util.Scanner;
/**
 * User Name And Password program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class UserNameAndPassword {

	public static void main(String[] args) {
	    System.out.println("Enter the Username and Password: ");
		Scanner sc= new Scanner(System.in);
		String username = sc.nextLine();
		String password = sc.nextLine();
		if(username.equals("Prajwal@.com") && password.equals("Java@123")) 
			System.out.println("Welcome to Home page (Valid Username and password)");
		 else{
				System.out.println("It is Invalid Username and password");
			}
			
		}
		
	}

