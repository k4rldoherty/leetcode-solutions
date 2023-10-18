// steps :
// Find the Pivot eg the largest element 
// Binary search from 0 -> pivot and from pivot + 1 -> end

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 6, 7, 1, 2, 3, 4, 5 };
        int target = 6;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        // if you did not find a pivot, the array is not rotated so just do a normal
        // binary search
        if (peak == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else {
            if (binarySearch(nums, target, 0, peak) == -1) {
                return binarySearch(nums, target, peak + 1, nums.length - 1);
            }
            return binarySearch(nums, target, 0, peak);
        }
    }

    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                // if the middle element is larger than the element after it, it is the pivot
                // point
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                // if the middle element is smaller than the element before it, the one before
                // it is the pivot element
                return mid - 1;
            } else if (nums[mid] < nums[start]) {
                // if the middle element is less than start, move end back to mid - 1 as the
                // ascending part is before middle
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // return -1 if there is no pivot element, meaning the array is not rotated
        return -1;
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
