package com.oparators;
import java.util.Scanner;
/**
 * Cube of number program
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */
public class CubeOfNumber {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int num= sc.nextInt();
	 System.out.println(num*num*num);
	 sc.close();
	}
}