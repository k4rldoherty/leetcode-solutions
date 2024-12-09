import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] solution = new int[n*2];
        int j = 0;
        for (int i = 0; i < solution.length; i+=2) {
            solution[i] = nums[j];
            solution[i+1] = nums[n];
            j++;
            n++;
        }
        return solution;
    }
}
