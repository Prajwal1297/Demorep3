package com.ArraysFunctions;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
		int a[] = {12,34,23,56,78,42,1,45,6};
	      System.out.println("Array elements");
	      
	      // For loop
	      System.out.println("\n");
	      for(int value : a ) {
	    	  if(value % 2 == 0)
	    	  System.out.print(value + " ");
	      }
	      //for each
	      System.out.println("\n");
	      for(int value : a ) {
	    	  if(value % 2 ==0)
	    	  System.out.print(value +" ");
	      }
		}//not completed

	}
