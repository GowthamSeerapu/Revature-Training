package mypack1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr1 = {1,8,9,84,8,56,79,94,84,8,1};
		removeDuplicates(arr1);
	}
	
	public static void removeDuplicates(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		int j = 0;
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length-1; i++) {
			if(arr1[i] != arr1[i+1]) {
				arr2[j++] = arr1[i];
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	}

}
