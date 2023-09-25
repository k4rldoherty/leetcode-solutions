import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] solution = new int[nums.length];
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0){
                solution[i] = nums[i];
            }
            solution[i] = nums[i] + runningSum;
            runningSum += nums[i];
        }
        return solution;
    }
}
