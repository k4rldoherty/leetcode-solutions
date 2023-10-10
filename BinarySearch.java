public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 15, 35, 40, 55, 70, 800, 1000, 3033, 5000 };
        int target = 800;
        int target2 = 69;
        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearch(nums, target2));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // while the start and end indices do not end up overlapping, signalling target
        // has not been found
        while (start <= end) {
            // method for finding the middle of the array that never gives an int too large
            // error
            int mid = start + (end - start / 2);

            // if the target int is larger than the int at the middle element of the array
            if (target > arr[mid]) {
                // sets the start element to one index past the middle element, cutting the
                // array in half
                start = mid + 1;
            } else if (target < arr[mid]) {
                // same idea, just moving end instead of start
                end = mid - 1;
            } else {
                // this is when you find the element if it is not smaller or larger it is the
                // element you are looking for.
                return arr[mid];
            }
        }
        return -1;
    }
}
