package com.ArraysFunctions;

public class AssignAndPrint {

	public static void main(String[] args) {
      int a[] = {12,34,23,56,78,42};
      System.out.println("Array elements");
      // For loop
      for(int i = 0; i < a.length ; i++) {
    	  System.out.print(a[i] + " ");
      }
      //for each
      System.out.println("\n");
      for(int value : a ) {
    	  System.out.print(value +" ");
      }
	}

}
