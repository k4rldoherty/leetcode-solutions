public class BinarySearch {
    public static void main(String[] args) {
        int[] numsReversed = { 5, 3, 1 };
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 1;
        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearchReversed(numsReversed, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // while the start and end indices do not end up overlapping, signalling target
        // has not been found
        while (start <= end) {
            // method for finding the middle of the array that never gives an int too large
            // error
            int mid = start + (end - start) / 2;

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
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchReversed(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {

                start = mid + 1;
            } else if (target > arr[mid]) {

                end = mid - 1;
            } else {

                return mid;
            }
        }
        return -1;
    }
}
