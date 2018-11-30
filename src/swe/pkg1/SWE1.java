/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.pkg1;

import java.util.*;

public class SWE1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String input = "";
		System.out.println("Welcome - Team 20 ");
		System.out.println("Enter the input :");
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		printMenu();
		int choice = s.nextInt();
		switch (choice) {
		case 1: 

			break;

		case 2: 
			System.out.println(sortArray(input));
			break;

		case 3: 

			break;

		case 5: 

			break;
		case 4: 

			break;

		case 6: 

			break;

		case 7: 

			break;

		case 8: 

			break;

		case 9: 

			break;

		case 10: 

			break;

		case 11: 

			break;

		case 12: 

			break;

		case 13:

			break;

		case 14: 

			break;

		case 15: 

			break;

		case 16: 

			break;

		case 17: 

			break;

		case 18: // execute all
			
			System.out.println("Sort : "+sortArray(input)); //2

			break;
		case 19: //exit
			System.out.println("The program is closed Thank you! ");
			System.exit(0);
		}

	}

	private static void printMenu() {
		System.out.println("Choose the number of operation you want to execute:");
		System.out.println("1-\tMost repeated value");
		System.out.println("2-\tSort");
		System.out.println("3-\tShuffle");
		System.out.println("4-\tFind the largest prime");
		System.out.println("5-\tFind the smallest prime");
		System.out.println("6-\tCheck palindrome");
		System.out.println("7-\tCheck sorted");
		System.out.println("8-\tCount primes");
		System.out.println("9-\tReverse array");
		System.out.println("10-\tShift array");
		System.out.println("11-\tDistinct array");
		System.out.println("12-\tGet the maximum 3 numbers");
		System.out.println("13-\tGet the minimum 3 numbers");
		System.out.println("14-\tGet average");
		System.out.println("15-\tGet median");
		System.out.println("16-\tReturn only primes");
		System.out.println("17-\tZero if less than zero");
		System.out.println("18-\tExecute All");
		System.out.println("19-\tExit");

	}

	public static String sortArray(String input) {
		List<Integer> arr = new ArrayList<Integer>();
		String result = "";
		String[] all = input.split(", ");
		// Check in input
		if (!Character.isDigit(input.charAt(0))) {
			result = "Wrong Input!You Must Input Array Of Integers";
			return result;
		}
		// Convert all (array of strings) to array of integers
		for (int i = 0; i < all.length; i++) {
			arr.add(Integer.parseInt(all[i]));
		}
		int temp, min;
		// Selection Sort
		for (int i = 0; i < arr.size(); i++) {
			min = i;
			for (int j = i; j < arr.size(); j++) {
				if (arr.get(j) < arr.get(min))
					min = j;
			}
			temp = arr.get(min);
			arr.set(min, arr.get(i));
			arr.set(i, temp);

		}
		// Convert Output to String again
		for (int i = 0; i < arr.size(); i++) {
			result += arr.get(i);
			if (i != arr.size() - 1)
				result += ", ";
		}
		return result;
	}

}
