package week1;

public class helloworld {
	 public static int forMax(int[] m) {
		 int max=0;
		 for (int i=0;i<m.length;i++) {
			 
			 if (m[i]>max) {
			 
			 max=m[i];
		 }
			 
			 
		 }
		
		return max;
		
		
		
	    }
	 public static int sum(int[] a) {
	      int sum = 0;
	      for (int i = 0; i < a.length; i = i + 1) {
	        sum = sum + a[i];
	      }
	      return sum;
	    }
public static void main(String[] args) {
	
	
	
//	# an array
//	int[] numbers=new int[] {4,7,10};
//	System.out.println(numbers.length);

int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
System.out.println(forMax(numbers));
	}}

    /** Uses a basic for loop to sum a. */
    









/**
1. all code in java must be part of class
2. using the curly braces{} to  delimit the begining and the end of the code
3. all statments in java must be in a semi colom ;
4. for code to run we need public static void main
**/