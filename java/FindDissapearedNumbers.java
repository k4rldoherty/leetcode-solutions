import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDissapearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDissapearedNumbers(nums));
    }

    public static List<Integer> findDissapearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        getMissing(nums, missing);
        return missing;
    }

    private static int[] sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    private static void getMissing(int[] nums, List<Integer> missing) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                missing.add(i);
            }
        }
    }
}
