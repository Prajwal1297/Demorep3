package com.ArraysFunctions;

public class PrintEvenNmber {

	public static void main(String[] args) {
		int a[] = {12,34,23,56,78,42,1,45,6};
	      System.out.println("Array elements");
	      // For loop
	      for(int i = 0; i < a.length ; i++) {
	    	  if(a[i] % 2 == 0)
	    	  System.out.print(a[i] + " ");
	      }
	      //for each
	      System.out.println("\n");
	      for(int value : a ) {
	    	  if(value % 2 ==0)
	    	  System.out.print(value +" ");
	      }
		}

	}

