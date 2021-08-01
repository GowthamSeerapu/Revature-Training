package mypack1;

import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {585, 489, 1001, 1006};
		findPalindrome(arr);
	}
	
	public static void findPalindrome(int[] arr) {
		System.out.println("Array : " +Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int rev = 0;
			while(x!=0) {
				rev = rev * 10 + x%10;
				x /= 10;
			}
			if(rev==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}


}
