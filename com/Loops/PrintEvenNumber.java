package com.Loops;
import java.util.Scanner;
/**
 * Print Even numbers program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */

public class PrintEvenNumber {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    int N = scan.nextInt();
	    for(int counter = 1; counter <= N; counter++) {
	    	if(counter % 2 == 0) {
	    		System.out.print(counter + " ");
	    	}
	    
	    }
		

	}

}
