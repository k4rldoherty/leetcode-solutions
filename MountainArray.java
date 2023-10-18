// An numsay nums is a mountain if the following properties hold:
// nums.length >= 3
// There exists some i with 0 < i < nums.length - 1 such that:
// nums[0] < nums[1] < ... < nums[i - 1] < nums[i] 
// nums[i] > nums[i + 1] > ... > nums[nums.length - 1]
// Given a mountain numsay nums, return the index i such that nums[0] < nums[1] < ... < nums[i - 1] < nums[i] > nums[i + 1] > ... > nums[nums.length - 1].
// You must solve it in O(log(nums.length)) time complexity.

// Example 1:

// Input: nums = [0,1,0]
// Output: 1
// Example 2:

// Input: nums = [0,2,1,0]
// Output: 1
// Example 3:

// Input: nums = [0,10,5,2]
// Output: 1
 

// Constraints:

// 3 <= nums.length <= 105
// 0 <= nums[i] <= 106
// nums is guaranteed to be a mountain numsay.

public class MountainArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};  // Peak in the middle
        int[] nums2 = {1, 3, 5, 4, 2};  // Peak after an initial increase
        int[] nums3 = {2, 4, 3, 2, 1};  // Peak after an initial decrease
        int[] nums4 = {1, 2, 3, 4, 3, 2, 1};  // Peak at the max value in the middle
        
        System.out.println("Peak in nums1: " + findPeak(nums1)); // Expected output: 2
        System.out.println("Peak in nums2: " + findPeak(nums2)); // Expected output: 2
        System.out.println("Peak in nums3: " + findPeak(nums3)); // Expected output: 1
        System.out.println("Peak in nums4: " + findPeak(nums4)); // Expected output: 3
    }

    // My initial version
    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == 0) {
                return mid + 1;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                // if middle element is greater than the one before it and less than the one
                // after it, the peak is after mid
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                // if middle element is less than the one before it and greater than the one after it
                end = mid - 1;
            } else {
                // if mid is larger than the one after it and larger than the one before it, it
                // is the peak
                return mid;
            }
        }
        return -1;
    }

    // Version From Course Creator - More optimized with less checks
    // public static int findPeak(int[] nums) {
    //     int start = 0;
    //     int end = nums.length - 1;

    //     while (start != end) {
    //         int mid = start + (end - start) / 2;

    //         if (nums[mid] > nums[mid + 1]) {
    //             end = mid;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return start; 
    // }

}
