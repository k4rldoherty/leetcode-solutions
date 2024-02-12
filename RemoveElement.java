import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        
        int k = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = -500;
                k--;
            }
        }
        
        int end = nums.length - 1;
        
        for (int j = 0;j < nums.length; j++) {
            if(nums[j] == -500) {
                swap(nums, j, end);
                end--;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }

    private static int[] swap(int[] arr, int start, int end) {
        while (start < end) {
            while (start < end && arr[start] != -500) {
                start++;
            }
            while (start < end && arr[end] == -500) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}
