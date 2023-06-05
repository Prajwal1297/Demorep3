package com.ControlStatements;
import java.util.Scanner;

/**
 * Checking for Voting eligibility program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */
public class VotingPrograme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=scan.nextInt();
		
		if(age>0) {
			if(age>18) {
				System.out.println("Has a Eligibility for Voting");
			}else
			System.out.println("Has not Eligibility for Voting");
		}else {
			System.out.println("Not Eligibility for voting");
		}
		

	}

}
