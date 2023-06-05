package com.ArraysFunctions;
import java.util.Scanner;

public class VotingFunction {

	public static boolean isEligible(int age) {
		
         if (age >= 18)
        	 return true;
         else
        	 return false;
	}
	 public static void main(String[] agrs) {
		 Scanner read = new Scanner(System.in); {
			 System.out.println("Read age ");
			 int age = read.nextInt();
			 boolean check = isEligible(age);//function call
			 if(check)
				 System.out.println("Is Eligible to vote");
			 else
				 System.out.println("Not eligible to vote");
		 }
	 }
	
	}


