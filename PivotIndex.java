import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2,1,-1};
        int[] nums4 = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
        System.out.println(pivotIndex(nums4));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if(i != 0 || i != nums.length - 1) {
                int[] left = Arrays.copyOfRange(nums, 0, i);
                int[] right = Arrays.copyOfRange(nums, i + 1, nums.length);
                leftSum = Arrays.stream(left).sum();
                rightSum = Arrays.stream(right).sum();

                if(leftSum == rightSum) return i;
            }
            else if (i == 0) {
                int[] right = Arrays.copyOfRange(nums, i + 1, nums.length);
                rightSum = Arrays.stream(right).sum();
                System.out.println(rightSum + " <- Right Sum");
                if(rightSum == leftSum) return i;
            }
            else {
                int[] left = Arrays.copyOfRange(nums, 0, nums.length - 1);
                leftSum = Arrays.stream(left).sum();
                System.out.println(leftSum + " <- Left Sum");
                if(leftSum == rightSum) return i;
            }
        }
        return -1;
    }
}
