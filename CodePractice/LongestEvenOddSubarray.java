package Practice;

public class LongestEvenOddSubarray {
	
	public static void longestEvenOddSubarray(int arr[]) {
		int ml = 1;
		int l = 1;
		int res[] = new int[arr.length];
		int k = 0;
		res[k++] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ((arr[i - 1] % 2 == 0 && arr[i] % 2 != 0) || (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0)) {
				l++;
				ml = Math.max(l, ml);
				if (k == 0) {
					res[k++] = arr[i-1];
				}
				res[k++] = arr[i];
			} else {
				l = 1;
				k = 0;
			}
		}
		System.out.println(ml);
		for (int i = 0; i < ml; i++) {
			System.out.println(res[i]);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = { 10, 12, 14, 7, 8 };
		int arr[] = {7,10,13,14};
//		int arr[] = { 10, 12, 8, 4 };
		longestEvenOddSubarray(arr);

	}

}
