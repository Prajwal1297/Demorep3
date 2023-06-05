package com.ArraysFunctions;
import java.util.Scanner;

public class SalaryAndHike {
	
	static int gettingSalary(int sal, int hike) {
		return sal+ sal*hike/100;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int sal=scan.nextInt();
		int hike=scan.nextInt();
		System.out.println("Actual Salary : "+sal);
		System.out.println("hike Percentage : "+hike);
		System.out.println("Getting Salary : "+gettingSalary(sal,hike));
       
	}

}
