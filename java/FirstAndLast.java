// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        System.out.println(Arrays.toString(firstAndLast(nums, target)));
    }

    public static int[] firstAndLast(int[] nums, int target) {
        int[] ans = new int[2];
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // binary search taking a boolean in the parameters which defines whether it is
    // searching on the left side of mid or the right side
    public static int search(int[] nums, int target, boolean searchFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // a potential answer is found here.
                ans = mid;
                if (searchFirst) {
                    // if we want to search for the first occurance of the target we move end to mid
                    // - 1 so we are only searching the first half of the array
                    end = mid - 1;
                } else {
                    // otherwise we are searching the second half of the array and move start to 
                    // mid + 1
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}