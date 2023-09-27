import java.util.Arrays;

public class LeftRightDifference {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        // populate right and left sum arrays 
        // RIGHT SUM
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum+=nums[j];
            }
            rightSum[i] = sum;
        }
        System.out.println(Arrays.toString(rightSum) + " RIGHTSUM");

        // LEFT SUM
        for (int i = nums.length - 1; i > 0; i--) {
            int sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                sum+=nums[j];
            }
            leftSum[i] = sum;
        }
        System.out.println(Arrays.toString(leftSum) + " LEFTSUM");

        // populate the ans array
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
