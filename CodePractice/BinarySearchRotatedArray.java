package Practice;

public class BinarySearchRotatedArray {

    public static void main(String[] args) {
        int n = 0; // Target to find
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int result = searchInRotatedArray(arr, n);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2; // Avoid overflow
            
            if (arr[mid] == target) {
                return mid; // Element found
            }
            
            // Determine which part of the array is sorted
            if (arr[s] <= arr[mid]) { // Left half is sorted
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1; // Search in the left half
                } else {
                    s = mid + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1; // Search in the right half
                } else {
                    e = mid - 1; // Search in the left half
                }
            }
        }
        
        return -1; // Element not found
    }
}
