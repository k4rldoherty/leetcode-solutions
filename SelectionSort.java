import java.util.Arrays;
// OUTPUT
// The Sorted Array is:
// [3, 99, 31, 53, 81, 26, 30, 26, 88, 46, 48, 4, 83, 97, 63, 48, 62, 83, 52, 54]
// [3, 54, 31, 53, 81, 26, 30, 26, 88, 46, 48, 4, 83, 97, 63, 48, 62, 83, 52, 99]
// [3, 54, 31, 53, 81, 26, 30, 26, 88, 46, 48, 4, 83, 52, 63, 48, 62, 83, 97, 99]
// [3, 54, 31, 53, 81, 26, 30, 26, 83, 46, 48, 4, 83, 52, 63, 48, 62, 88, 97, 99]
// [3, 54, 31, 53, 81, 26, 30, 26, 62, 46, 48, 4, 83, 52, 63, 48, 83, 88, 97, 99]
// [3, 54, 31, 53, 81, 26, 30, 26, 62, 46, 48, 4, 48, 52, 63, 83, 83, 88, 97, 99]
// [3, 54, 31, 53, 63, 26, 30, 26, 62, 46, 48, 4, 48, 52, 81, 83, 83, 88, 97, 99]
// [3, 54, 31, 53, 52, 26, 30, 26, 62, 46, 48, 4, 48, 63, 81, 83, 83, 88, 97, 99]
// [3, 54, 31, 53, 52, 26, 30, 26, 48, 46, 48, 4, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 53, 52, 26, 30, 26, 48, 46, 48, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 48, 52, 26, 30, 26, 48, 46, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 48, 46, 26, 30, 26, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 48, 46, 26, 30, 26, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 26, 46, 26, 30, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 31, 26, 30, 26, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]
// [3, 4, 26, 26, 30, 31, 46, 48, 48, 52, 53, 54, 62, 63, 81, 83, 83, 88, 97, 99]

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int max = 100;
        int min = 1;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * max) + min;
            arr[i] = random;
        }

        System.out.println("The randomly generated array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nSorting...\n");

        System.out.println("The Sorted Array is:");
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] nums) {
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Set last to dynamically decrease by one every time the loop executes
            int last = nums.length - i - 1;
            // Get the index of the largest number
            int maxIndex = getMaxIndex(nums, 0, last);
            // Add that element to the end of the list
            swap(nums, maxIndex, last);
        }
        return nums;
    }

    public static void swap(int[] arr, int first, int second) {
        // Simple swap function to swap 2 elements in a list
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        // Sets the maximum index to the start of the list
        int maxIndex = start;
        // Loops through from start to end
        for (int i = start; i <= end; i++) {
            // Checks if the elenent at the maxIndex is smaller than the element at i
            if (arr[maxIndex] < arr[i]) {
                // Updates maxIndex to be i if this is true
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        return maxIndex;
    }
}
