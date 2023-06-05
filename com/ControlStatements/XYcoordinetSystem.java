package com.ControlStatements;
import java.util.Scanner;
/**
 *  XY co-ordinet System program
 * @author Prajwal
 * @since 31/05/2023
 * @version jdk11
 */
public class XYcoordinetSystem {

	public static void main(String[] args) {
		System.out.println("Enter the inputs: ");
		Scanner scan= new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x==0 && y==0) System.out.println("The point is in origin "); //1
		 else if(x==0 && y>0) System.out.println("The point is in Y axis");//2
		 else if(x>0 && y==0) System.out.println("The point is in X axis");//3
		 else if(x>0 && y>0) System.out.println("The point is in Qudrent1");//4
		 else if(x>0 && y<0) System.out.println("The point is in Qudrent2");//5
		 else if(x<0 && y>0) System.out.println("The point is in Qudrent4");//6
		 else if(x==0 && y<0) System.out.println("The point is in Y axis");//7
		 else if(x<0 && y==0) System.out.println("The point is in X axis");//8
		 else if(x<0 && y<0) System.out.println("The point is in Qudrent3");//9
			
	    }
		
	}
