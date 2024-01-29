public class MisssingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(getMissing(nums));
    }

    private static int[] sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        return nums;
    }

    private static int getMissing(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
