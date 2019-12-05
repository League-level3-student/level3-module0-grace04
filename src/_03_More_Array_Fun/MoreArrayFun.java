package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void norm(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void back(String[] arr) {
		for(int i=arr.length;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void even(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void rand(String[] arr) {
		Random gen = new Random();
		int x;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
