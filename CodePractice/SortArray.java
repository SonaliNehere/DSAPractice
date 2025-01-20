package Practice;

public class SortArray {

	public static void bubbleSort(int nums[]) {
		int n = nums.length;
		boolean swapped = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int nums[]) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {

				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int nums[]) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void merge(int nums[], int l, int m, int r) {
		int temp1[] = new int[m - l + 1];
		int temp2[] = new int[r - m];

		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = nums[l + i];
		}

		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = nums[m + i + 1];
		}

		int k = l;
		int i = 0, j = 0;

		while (i < temp1.length && j < temp2.length) {
			if (temp1[i] <= temp2[j]) {
				nums[k] = temp1[i];
				i++;
			} else {
				nums[k] = temp2[j];
				j++;
			}
			k++;
		}

		while (i < temp1.length) {
			nums[k++] = temp1[i++];
		}

		while (j < temp2.length) {
			nums[k++] = temp2[j++];
		}

	}

	public static void mergeSort(int nums[], int l, int r) {

		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(nums, l, m);
			mergeSort(nums, m + 1, r);
			merge(nums, l, m, r);
		}

	}

	public static void intersectionOfTwoSortedArray(int nums1[], int nums2[]) {
		int m = nums1.length;
		int n = nums2.length;
		int nums[] = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if ((i > 0 && nums1[i] == nums1[i - 1])) {
				i++;
				continue;
			}

			if ((j > 0 && nums2[j] == nums2[j - 1])) {
				j++;
				continue;
			}

			if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums2[j] > nums1[i]) {
				i++;
			} else {
				nums[k] = nums1[i];
				k++;
				i++;
				j++;
			}
		}

		for (int i1 = 0; i1 < k; i1++) {
			System.out.print(nums[i1] + " ");
		}
		System.out.println();
	}

	public static void unionOfTwoSortedArray(int nums1[], int nums2[]) {
		int m = nums1.length;
		int n = nums2.length;
		int nums[] = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (i > 0 && nums1[i] == nums1[i - 1]) {
				i++;
				continue;
			}

			if (j > 0 && nums2[j] == nums2[j - 1]) {
				j++;
				continue;
			}

			if (nums1[i] < nums2[j]) {
				nums[k] = nums1[i];
				i++;
			} else if (nums2[j] < nums1[i]) {
				nums[k] = nums2[j];
				j++;
			} else {
				nums[k] = nums2[j];
				i++;
				j++;
			}
			k++;
		}

		while (i < nums1.length) {
			if (i > 0 && nums1[i] != nums1[i - 1]) {
				nums[k++] = nums1[i];
			}
			i++;
		}

		while (j < nums2.length) {
			if (j > 0 && nums2[j] != nums2[j - 1]) {
				nums[k++] = nums2[j];
			}
			j++;

		}

		for (int i1 = 0; i1 < k; i1++) {
			System.out.print(nums[i1] + " ");
		}
		System.out.println();
	}

	public static int lomutoPartition(int nums[], int l, int h) {
		int pivot = nums[h];
		int i = l - 1;
		for (int j = l; j <= h - 1; j++) {
			if (nums[j] < pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[i + 1];
		nums[i + 1] = nums[h];
		nums[h] = temp;

		for (int i1 = 0; i1 <= h; i1++) {
			System.out.print(nums[i1] + " ");
		}
		System.out.println();
		return i + 1;
	}

	public static void quickSortLomuto(int nums[], int l, int h) {
		if (l < h) {
			int p = lomutoPartition(nums, l, h);
			quickSortLomuto(nums, l, p - 1);
			quickSortLomuto(nums, p + 1, h);
		}
	}

	public static int hoaresPartition(int nums[], int l, int h) {
		int pivot = nums[l];
		int i = l - 1, j = h + 1;
		while (true) {
			do {
				i++;
			} while (nums[i] < pivot);

			do {
				j--;
			} while (nums[j] > pivot);

			if (i >= j) {
				return j;
			}

			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

	}

	public static void quickSortHoares(int nums[], int l, int h) {
		if (l < h) {
			int p = hoaresPartition(nums, l, h);
			quickSortHoares(nums, l, p);
			quickSortHoares(nums, p + 1, h);
		}
	}

	static int partition(int arr[], int l, int h) {
		int pivot = arr[l];
		int i = l - 1, j = h + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j)
				return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	static void qSort(int arr[], int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h);
			qSort(arr, l, p);
			qSort(arr, p + 1, h);
		}
	}

	public static int sort(int nums[], int l, int h, int k) {
		if (l <= h) {
			int p = lomutoPartition(nums, l, h);
			if (p == k - 1) {
				return nums[p];
			} else if (k - 1 < p) {
				return sort(nums, l, p - 1, k);
			} else {
				return sort(nums, p + 1, h, k);
			}
		}
		return -1;
	}

	public static int findKthSmallest(int[] nums, int k) {
		return sort(nums, 0, nums.length - 1, k);
	}
	
	 public static  int[][] merge(int[][] intervals) {
	        int[][] res = new int[intervals.length][2];
	        int k = 0;
	        int i = 0;
	        while (i < intervals.length - 1) {
	            if (Math.abs(intervals[i][1] - intervals[i + 1][0]) == 1 ||
	                    Math.abs(intervals[i][1] - intervals[i + 1][0]) == 0) {
	                int arr[] = new int[2];
	                arr[0] = intervals[i][0];
	                arr[1] = intervals[i + 1][1];
	                res[k++] = arr;
	                i = i + 2;
	            } else {
	                int arr[] = new int[2];
	                arr[0] = intervals[i][0];
	                arr[1] = intervals[i][1];
	                res[k++] = arr;
	                i = i+1;
	            }
	        }

//	        int res1[][] = new int[k][2];
//	        for (int i1 = 0; i1 < k; i++) {
//	            res1[i1][0] = res[i1][0];
//	            res1[i1][1] = res[i1][1];
//	            System.out.print( res1[i1][0]  + " " + res1[i1][1]  );
//	            System.out.println();
//	        }
	        
	        for (int i1 = 0; i1 < k; i1++) {
	            System.out.print( res[i1][0]  + " " + res[i1][1]  );
	            System.out.println();
	        }

	        return res;
	    }

	public static void main(String[] args) {
		int nums[] = { 8, 4, 0, 9, 3, 1 };
//		bubbleSort(nums);
//
//		selectionSort(nums);
//
//		insertionSort(nums);
//
//		mergeSort(nums, 0, nums.length - 1);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
//		System.out.println();
//
//		int nums1[] = { 1, 2, 4, 4, 4, 7, 9, 13, 13, 14 };
//		int nums2[] = { 3, 4, 5, 8, 9, 10, 11, 12, 13, 13 };
//		intersectionOfTwoSortedArray(nums1, nums2);
//
//		unionOfTwoSortedArray(nums1, nums2);

//		quickSortLomuto(nums, 0, nums.length - 1);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
//		System.out.println();

//		quickSortHoares(nums, 0, nums.length - 1);
//		for (int x : nums)
//			System.out.print(x + " ");
//		System.out.println();

//		hoaresPartition(nums, 0, nums.length - 1);
//
//		for (int x : nums)
//			System.out.print(x + " ");

//		System.out.println(findKthSmallest(nums, 4));
		
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		merge(intervals);

	}

}
