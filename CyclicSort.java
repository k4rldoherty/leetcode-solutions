import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 4, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }

    private static int[] sort(int[] nums) {
        int i = 0;
        // If the value is not == the index + 1
        while (i < nums.length) {

            // the index the element should be at, in the first instance of my example
            // correct will be 1 as 2 should be located at index 1
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                // Swap the elements
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                // Otherwise increment i to progress
                i++;
            }
        }

        return nums;
    }
}
