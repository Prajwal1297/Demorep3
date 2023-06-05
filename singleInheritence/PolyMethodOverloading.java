package singleInheritence;
public class PolyMethodOverloading {
	
	static int add(int first,int second) {
		return first+second;
	}
	static double add(double first, double second) {
		return first+second;
	}
	static char add(char first, char second) {
		return (char)(first = second);
	}
	static String add(String first, String second) {
		return first.concat(second);
	}
	static float add(float a,float b) {
        return (a+b);
	}   
	public static void main(String[] args) {
		System.out.println("Adding two Integers :"+ add(2,3));
		System.out.println("Adding two double :"+ add(5.8,3.6));
		System.out.println("Adding two char :"+ add('d','y')); 
		System.out.println("Adding two String :"+ add("Method","Overloading"));
		System.out.println("Adding float numbers : "+add(5.3f,7.5f));
	}
}



