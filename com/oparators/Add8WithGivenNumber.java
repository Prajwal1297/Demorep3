package com.oparators;
import java.util.Scanner;
/**
 * Add 8 With Given Number
 * @author Prajwal
 * @since 30/05/2023
 * @version jdk11
 */
public class Add8WithGivenNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int num= sc.nextInt();
		 System.out.println((((num+8)/3)%5)*5);
      
	}

}
