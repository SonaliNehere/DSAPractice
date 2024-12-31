package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class WindowSliding {

	public static void first_m_n_bonacciSeries(int m, int n) {
		int res[] = new int[m];
		int s = 0;
		int deletesum = 0;
		int sum = 0;
		for (int i = 0; i <= n - 2; i++) {
			res[i] = 0;
		}
		res[n - 1] = 1;
		sum += res[n - 1];
		res[n] = sum;
		sum += res[n];
		for (int i = n + 1; i < m; i++) {
			deletesum += res[s++];
			res[i] = sum - deletesum;
			sum += res[i];
		}
		for (int i = 0; i < m; i++) {
			System.out.println(res[i]);
		}

	}

	public static void countDistinctElementsInEachWindowK(int nums[], int k) {
		int s = 0;
		int l = nums.length;
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < k; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		System.out.println(map.size());

		for (int i = k; i < l; i++) {
			if(map.get(nums[s]) > 1) {
				map.put(nums[s], map.get(nums[s]) - 1);
			}
			else if(map.get(nums[s]) == 1) {
				map.remove(nums[s]);
			}

			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

			System.out.println(map.size());
			s++;
		}

	}
	
	public static void main(String[] args) {
//		first_m_n_bonacciSeries(10, 5);

		int arr[] = { 1, 2, 1, 3, 4, 3, 3 };
		countDistinctElementsInEachWindowK(arr, 4);

		
	}

}
