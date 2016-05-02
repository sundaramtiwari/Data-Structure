package main;

public class LangfordSequenceNew {

	public static void print(int input) {
		int[] arr = new int[input * 2];
		arr[0] = arr[input+1] = input;

		for (int i = input; i > 0; i--) {
			insert(i, arr);
		}
	}

	private static void insert(int i, int[] arr) {
		
	}

	public static void main(String args[]) {
		print(3);
	}
}
