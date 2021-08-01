package mypack1;

public class primenumber {

	public static void main(String[] args) {
		int[] arr = {44, 48, 37, 47, 50};
		findPrimeNumber(arr);

	}
	public static void findPrimeNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i]%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) 
				System.out.println(arr[i]);
		}
	}

}
