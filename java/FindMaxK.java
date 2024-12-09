import java.util.HashMap;

public class FindMaxK {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3}; // 3
        int[] nums2 = {-1,10,6,7,-7,1}; // 7
        int[] nums3 = {-10,8,6,7,-2,-3}; // -1
        int[] nums4 = {-1};
        System.out.println(findMaxK(nums));
        System.out.println(findMaxK(nums2));
        System.out.println(findMaxK(nums3));
        System.out.println(findMaxK(nums4));
    }

    public static int findMaxK(int[] nums) {
        if(nums.length == 1) return -1;
        
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) map.put(nums[i] * (-1), nums[i]);
            else if(Math.abs(nums[i]) > k) k = Math.abs(nums[i]);
        }
        
        
        return k == 0 ? -1 : k;
    }
}