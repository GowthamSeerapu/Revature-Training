package mypack1;

public class FLsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {101,22,344,699};
		FLsame(arr);

	}
	public static void FLsame(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int lastDigit = 0;
			lastDigit = x%10;
			while(!(x > 0 && x <= 9)) {
				x/=10;
			}
			if(x!=lastDigit) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
