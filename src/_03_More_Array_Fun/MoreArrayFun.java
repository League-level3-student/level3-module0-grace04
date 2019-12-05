package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arr = {"one ", "two ", "three ", "four ", "five "};
		MoreArrayFun maf = new MoreArrayFun();
		maf.norm(arr);
		System.out.println("");
		maf.back(arr);
		System.out.println("");
		maf.even(arr);
		System.out.println("");
		maf.rand(arr);
		System.out.println("");
		maf.rand(arr);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void norm(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void back(String[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void even(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void rand(String[] arr) {
		Random gen = new Random();
		int x;
		ArrayList<String> lis = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			lis.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			x = gen.nextInt(lis.size());
			System.out.print(lis.get(x));
			lis.remove(x);
		}
	}
}
