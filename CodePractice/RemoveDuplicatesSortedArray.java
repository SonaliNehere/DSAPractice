package Practice;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		int arr[]  = {0, 10, 10, 20, 20, 30, 30, 30, 40};
		int k=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[k]) {
				k++;
				arr[k] = arr[i];
			}

		}
		
		for(int i=0; i<=k; i++) {
			System.out.println(arr[i]);
		}
	}

}
