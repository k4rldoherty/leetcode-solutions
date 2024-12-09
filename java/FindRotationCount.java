public class FindRotationCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3};
        System.out.println(findRotationCount(arr));
    }

    public static int findRotationCount(int[] nums) {
        // find the largest element in the array
        int peak = findPeak(nums);
        // if the peak element is at the end of the array, the array is not rotated so
        // return 0
        if (peak == nums.length - 1) {
            return 0;
        } else {
            // otherwise, the next element is the index of first element in the array, which
            // is the amount of rotations
            return peak + 1;
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
}
