package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] things = {"hi","what","huh","is","this"};
		//2. print the third element in the array
		System.out.println(things[2]);
		//3. set the third element to a different value
		things[2] = "value";
		//4. print the third element again
		System.out.println(things[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0;i<things.length;i++) {
			things[i] = "rip";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<things.length;i++) {
			System.out.println(things[i]);
		}
		//7. make an array of 50 integers
		int[] tegs = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random gen = new Random();
		int g;
		for(int i = 0;i<tegs.length;i++) {
			g = gen.nextInt(50)+1;
			tegs[i] = g;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int low = 50;
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
