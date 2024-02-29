package com.promineotech;

public class JavaWeek4CodingProject {
	
		public static void main(String args[]) {
		int [] ages = new int[8];//Create an array called ages
		ages[0] = 3; //populate array
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		System.out.println(ages[ages.length-1] - ages[0]); // Programmatically subtract the first from the last element in the array + printing
		
		int[] ages2 = new int[9]; //initiate array of integers with a size of 9
		ages2[0] = 3; //populate array
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 100;
		System.out.println(ages2[ages2.length-1] - ages2[0]); // subtracts last element with first element
		/*this code above is usable in any array, as it merely references the last element as the size of the array - 1 to fit
		 *within the index, as the first element in an array is at index 0
		 * for example, I will initiate an array with a size of 15 below and use the above code
		 */ 
		int[] ages3 = new int[15]; //initiate array of integers with a size of 15
		ages3[0] = 3; //populate array
		ages3[1] = 9;
		ages3[2] = 23;
		ages3[3] = 64;
		ages3[4] = 2;
		ages3[5] = 8;
		ages3[6] = 28;
		ages3[7] = 93;
		ages3[8] = 100;
		ages3[9] = 8;
		ages3[10] = 28;
		ages3[11] = 93;
		ages3[12] = 100;
		ages3[13] = 28;
		ages3[14] = 93;
		System.out.println(ages3[ages3.length-1] - ages3[0]); //Subtract first element from last element
		
		int sum = 0;					//setting a variable to hold the sum of the arrays numbers
		for (int number : ages2) { //for EVERY integer of the name number in the list of ages2
			sum += number; //add the number to the variable of sum
			
			
		} 
		System.out.println(sum / ages2.length); //prints out the outcome of the sum variable divided by the length of the array
		
		String[] names = new String[6]; //Initialize an array of strings under the name of names
		names[0] = "Sam"; //populating array
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		int letterSum = 0; //creating a variable to seat the value of the sum of all letters 
		for (String name : names) {
			letterSum += name.length(); //adding the sum of letters of each string of the array 
		}
		System.out.println(letterSum / names.length); //printing out the outcome of the sum divided by the length of the array
		
		
		//How do you access the last element of any array?
		//arrayName[array.length - 1]
		
		//How do you access the first element of any array?
		//arrayName[0]
		
		int[] nameLengths = new int[names.length]; //creates an array of integers the size of the array of names
		for (int i = 0; i < names.length; i++) { //for index of i starting at 0, before the index reaches the length of names, index adds 1 to itself
			nameLengths[i] = names[i].length(); //the index of namesLengths
				} 
		for (int length : nameLengths) { //for every number in the array of nameLengths
			System.out.println(length); //print out the numbers
		}
		
		
		
		
		
		int sum2 = 0;
		for (int numbers : nameLengths) { //for every number in the nameLengths array
			sum2 += numbers; //add these numbers to the sum2 variable
		}
		System.out.println(sum2); //and print the variable sum2, which is the sum of all the numbers in the array of nameLengths
		
		
		System.out.println(concatWord("Friendly", 3)); //printing out for method for question 7
		
		System.out.println(fullName("Ronald", "Swanson")); //prints out the results for the method of full name with Ronald and Swanson being the parameters
		
		System.out.println(moreThan100(ages3)); //prints out the return for the method determining true or false if sum of array is more than 100
		
		
		
		//array for method 10
		double [] testArrayDouble = new double[5];
		testArrayDouble[0] = 5.55;
		testArrayDouble[1] = 4.55;
		testArrayDouble[2] = 7.55;
		testArrayDouble[3] = 9.55;
		testArrayDouble[4] = 4.55;
		System.out.println(averageArray(testArrayDouble)); //Prints out method 10 for the average of the doubles in the array
		
		
		//method 11
		double [] testArrayDouble2 = new double[5];
		testArrayDouble2[0] = 1.55;
		testArrayDouble2[1] = 4.55;
		testArrayDouble2[2] = 7.55;
		testArrayDouble2[3] = 9.55;
		testArrayDouble2[4] = 2.55;
		System.out.println(arrayLarger(testArrayDouble, testArrayDouble2)); // returns true if array 1 is larger
		
		//method 12
		System.out.println(willBuyDrink(true, 10.51)); //returns true if hot outside is true and above 10.50
		
		
		//method 13
		System.out.println(doINeedMilk(true, false)); //returns true if i need milk (none at home or if cat is thirsty)
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		//write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times
		public static String concatWord (String word, int n) {
			String result = ""; // creates temporary variable for the string concat
			for (int i = 0; i < n; i++) { //for loop that counts the amount of times the word is to be repeated
				result += word; //adds the word to the temporary string
			}
			return result; //returns the string
		}
		
		
		
		//write a method that takes two strings, firstname and lastname, and returns a full name 
		
		public static String fullName (String firstName, String lastName) { //sets the method as a string return with two string parameters
			String results = ""; //creates temporary variable for the string
			results = firstName + " " + lastName; //Concatenates the first and last name variables with a space
			return results; //returns the temporary variable
		} 
		
		public static Boolean moreThan100 (int[] array) { //creates a boolean method intaking an array of int
			int sum = 0; //temporary variable to hold sum
			for (int number : array) { //for every integer number in the array being inserted
				sum += number; //add these numbers to the sum value
			}
			if (sum > 100) { //if the sum is more than 100
				return true; //return true
			} else { //if not
				return false; //return false
			}
		}
		
		public static double averageArray (double [] array) { //returns a double being the average of all elements in the array inserted
			double sum = 0; // temporary variable for sum
			for (double numbers : array) { //for every double number in the array
				sum += numbers; //add these doubles to the sum
			} 
			double average = sum / array.length; //average is the sum of the array divided by the length of the array
			return average; // return the average
		}
		
		public static Boolean arrayLarger (double [] array1, double[] array2) { // takes two arrays populated by doubles and returns a boolean
			double sum1 = 0; //two sum variables to hold the temporary sums
			double sum2 = 0;
			for (double numbers1 : array1) { //for every number in the array1
				sum1 += numbers1; //add these numbers to sum1 variable
			}
			for (double numbers2 : array2) { //for every number in array 2
				sum2 += numbers2; //add these numbers to sum 2
			}
			double average1 = sum1 / array1.length; //average for array 1
			double average2 = sum2 / array2.length; //average for array 2
			
			if (average1 > average2) { //if average of array 1 is larger than average array 2
				return true; //return true
			} else { return false;
		} 
		
			
		}
		
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) { //takes in a boolean and a double 

		
			if (isHotOutside == true && moneyInPocket > 10.50) { //if hot outside is true and money in pocket is above 10.50
				return true; //return true
			} else { //if not,
				return false; //return false
			}
			
}
		
public static boolean doINeedMilk (boolean milkAtHome, boolean isCatThirsty) { // here I setup the problem where I need to know if I need milk, to do that I need to know if I have milk at home or if my cat is thirsty
			if (milkAtHome == true || isCatThirsty == true) { //if i dont have milk at home OR if my cat is thirsty
				return true; //return true!
			} else {//if neither of those are true
				return false;//return false!
			}
		}
}