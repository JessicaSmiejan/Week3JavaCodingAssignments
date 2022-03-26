package com.smiejan.main;

public class Week3Javaassignment {

	public static void main(String[] args) {
		// Problem 1
		
		int[] array = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println(array[array.length -1] + array[0]);
		
					int sum =0;
			for ( int number: array) {
				sum += number;
			}
		int average = sum / array.length;
				System.out.println(average);
							
	// Problem 2			
				String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
				int sumOfLetters = 0;
			for (String name: names) {
			sumOfLetters += name.length();
			System.out.println("average number of letters per name. " + sumOfLetters/names.length);}
			{	
	}	for (int i =0; i < names.length; i++) {
		System.out.print(names[i] + ", ");
		
		//  Problem 5 /6
		
		//	int[] nameLengths = {names.length};
		//	for (int name :nameLengths) {
		//		System.out.println(nameLengths);
			}
		}
		// Problem 7
		public static String multiplyPhrase( String phrase, int num) {
			String result ="";
			for (int j =0; j <num; j++) {
				result += phrase;
			}
				return result;
		}

		// Problem 8
		public static String createFullName(String fn, String ln) {
				String fullName = fn + " " + ln;
			return fullName;
}
		
		// Problem 9
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		public static boolean isGreaterthan100(int[]numbers) {
		int sum = 0;
		for (int number:numbers) {
		sum += number;
		}
		return sum > 100;
		}

		// problem 10

		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number: numbers) {
				sum += number;
			}
			return sum/ numbers.length;
			}
		// problem 11
				
		public static boolean strIsBigger(double[]x, double[] y) {
			double average1 = 0;
			double average2 = 0;
			{ 
				for (int i = 0; i < 5; i++) {
			     average1 += x[i];
			     average2 += y[i];{
			   	 if (average1 > average1);
			   	  
			     return true;
			     }

		
		// Problem 12
		public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket > 10.50);
			return true;
		}
// 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// The method  below  adds a a new element to an array
		
	    public static int[] add_element(int n, int myarray[], int ele) 
	    { 
	         int i; 
	 
	         int newArray[] = new int[n + 1]; 
	        //copy original array into new array
	        for (i = 0; i &lt; n; i++) 
	              newArray[i] = myarray[i]; 
	 
	        //add element to the new array
	        newArray[n] = ele; 
	 
	        returnnewArray; 
	    }
		
		}
		
		

	
		
				



