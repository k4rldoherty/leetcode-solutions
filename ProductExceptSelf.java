import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf((nums))));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        for (int i = 0; i < sol.length; i++) {
            int prod = multiplyRest(nums, i);
            // Make the skip element the product of the rest
            sol[i] = prod;
        }

        return sol;
    }

    public static int multiplyRest(int[] arr, int skipIndex) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i == skipIndex) continue;
            prod *= arr[i];
        }

        return prod;
    }
}
