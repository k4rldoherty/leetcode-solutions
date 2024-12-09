import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        
        int[] answer = new int[2];
        
        for(int i=0; i<nums.length; i++) {

            for(int j=1; j<nums.length; j++) {
                System.out.println(i + "<- " + nums[i] + " " + j + "<- " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                } else {
                    j++;
                }

            }
        }
        return nums;
    }
}
