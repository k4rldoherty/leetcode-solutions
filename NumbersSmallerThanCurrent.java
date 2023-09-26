import java.util.Arrays;

public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(howManySmaller(nums)));
    }

    public static int[] howManySmaller(int[] nums) {
        int[] solution = new int[nums.length];
        for (int i = 0; i < solution.length; i++) {
            int curr = nums[i];
            int numsSmaller = 0;
            for (int j = 0; j < solution.length; j++) {
                if(curr > nums[j]) {
                    numsSmaller++;
                }

            }
            solution[i] = numsSmaller;
        }
        return solution;
    }
}
