// steps :
// Find the Pivot eg the largest element 
// Binary search from 0 -> pivot and from pivot + 1 -> end

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 5,1,3 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(target == nums[0]) {
                return 0;
            } else {
                return -1;
            }
        }
        int peak = findPeak(nums);
        System.out.println("Peak ->" + peak);
        int ascending = binarySearch(nums, target, 0, peak);
        if (ascending == -1) {
            return binarySearch(nums, target, peak + 1, nums.length - 1);
        }
        return ascending;
    }

    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // if the middle element is larger than the element after it, it is the pivot
                // point
                return mid;
            } else if (nums[start] > nums[mid]) {
                // if the start element is larger than the middle element, the ascending part of
                // the array comes before the middle element so put end at mid - 1
                end = mid - 1;
            } else {
                // otherwise, move start to middle + 1
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
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
}
