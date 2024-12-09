public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int[] numsReversed = { 5, 3, 1 };
        int target = 5;
        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearch(numsReversed, target));
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
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
            } else {
                if (target < arr[mid]) {

                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}