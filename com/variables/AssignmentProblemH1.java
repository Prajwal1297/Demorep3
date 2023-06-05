package com.variables;

public class AssignmentProblemH1 {

	public static void main(String[] args) {
		int num1 = 100, num2 = 200, num3 = 300, num4 = 1000;
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
		num4 = num3;
		num3 = num2;
		num2 = num1;
		num1 = 100;
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

	}

}
