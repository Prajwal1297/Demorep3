/*
 * Square Pattern program
 * @author Prajwal
 * @Since 05/06/2023
 * @version jdk11
 */
package nestedProgram;

import java.util.Scanner;

public class PatternPrograme {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
