package com.Loops;
import java.util.Scanner;
/**
 * Divisible By 2 And 4 program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class DivisibleBy2And4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int counter = 1; counter <= N; counter++) {
			if(counter % 2 == 0 && counter % 4 == 0) {
				System.out.println("Number Divisible by 2 and 4");
				counter++;
			}
		}
		
	  }
         
	

}
