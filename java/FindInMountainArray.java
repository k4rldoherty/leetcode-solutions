// You may recall that an array arr is a mountain array if and only if:
// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array.
// Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

// Example 1:
// Input: array = [1,2,3,4,5,3,1], target = 3
// Output: 2
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

// Example 2:
// Input: array = [0,1,2,4,2,1], target = 3
// Output: -1
// Explanation: 3 does not exist in the array, so we return -1.

// Constraints:

// 3 <= mountain_arr.length() <= 104
// 0 <= target <= 109
// 0 <= mountain_arr.get(index) <= 109

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0,5,3,1 };
        int target = 3;
        System.out.println(findInMountainArray(arr, target));
    }

    public static int findInMountainArray(int[] nums, int target) {
        int peak = findPeak(nums);
        System.out.println(peak + " <- Peak");
        int ascending = binarySearch(nums, target, peak - 1);
        System.out.println(ascending + " <- Ascending");
        int descending = binarySearchReversed(nums, target, peak + 1);
        System.out.println(descending + " <- Descending");
        if (ascending == -1 || descending == -1) {
            return Math.max(ascending, descending);
        } else {
            return Math.min(ascending, descending);
        }
    }

    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchReversed(int[] arr, int target, int start) {
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
