package com.ControlStatements;
import java.util.Scanner;
/**
 *  IPL Match program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */
public class IplMatch {

	public static void main(String[] args) {
		System.out.println("Enter the Date:");
		
		Scanner match= new Scanner(System.in);
		String numberString = match.next();
		
		switch(numberString) {
		case "TWENTY ONE":
			System.out.println(1);
			break;
		case "TWENTY TWO":
			System.out.println(2);
			break;
		case "TWENTY THREE":
			System.out.println(3);
			break;
		case " TWENTY FOUR":
			System.out.println(4);
			break;
		case " TWENTY FIVE":
			System.out.println(5);
			break;
		case " TWENTY SIX":
			System.out.println(6);
			break;
		case " TWENTY SEVEN":
			System.out.println(7);
			break;
			default:
				System.out.println("Invalid date numberstring");
			
		}
	  }
			
	}
