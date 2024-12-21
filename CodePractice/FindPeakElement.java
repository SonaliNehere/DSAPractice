package Practice;
public class FindPeakElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1}; // Example input
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }

    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            if (arr[mid] > arr[mid + 1]) {
                high = mid; // Peak is in the left half or at mid
            } else {
                low = mid + 1; // Peak is in the right half
            }
        }

        return low; // or high, as low == high
    }
}

