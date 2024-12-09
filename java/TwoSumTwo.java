import java.util.Arrays;

public class TwoSumTwo {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 13;
        System.out.println(Arrays.toString(twoSumTwo(numbers, target)));
    }

    public static int[] twoSumTwo(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (nums[start] + nums[end] != target) {
            if(target > nums[start] + nums[end]) {
                start+=1;
            } else {
                end-=1;
            }
        }
        return new int[] {start + 1, end + 1};
    }
}


// Binary search method

/*
public int[] twoSum_bs(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; ++i) {
        int low = i + 1;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Corrected mid calculation
            if (numbers[mid] == target - numbers[i]) {
                return new int[]{i + 1, mid + 1};
            } else if (numbers[mid] > target - numbers[i]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
    return new int[]{-1, -1}; // Return this if no such pair exists
}
 */