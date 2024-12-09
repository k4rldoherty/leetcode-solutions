// Given an integer array nums of length n, you want to create an array ans of length 2n 
// where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

 

// Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

import java.util.Arrays;

public class ConcatonateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        boolean repeatComplete = false;
        int j = 0;
        for(int i = 0; i < ans.length; i++) {
            if(j == nums.length && repeatComplete == false) { 
                j = 0;
                repeatComplete = true;
            }
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
    
}
