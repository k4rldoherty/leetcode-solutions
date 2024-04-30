import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindDiffOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        List<List<Integer>> l = findDiff(nums1, nums2);
        System.out.println(Arrays.toString(l.toArray()));
    }

    public static List<List<Integer>> findDiff(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(new ArrayList<Integer>());
        ans.add(new ArrayList<Integer>());

        for (int i = 0; i < nums1.length; i++) {
            int curr = nums1[i];
            if(!contains(nums2, curr) && !ans.get(0).contains(curr)) ans.get(0).add(curr);
        }

        for (int j = 0; j < nums2.length; j++) {
            int curr = nums2[j];
            if(!contains(nums1, curr) && !ans.get(1).contains(curr)) ans.get(1).add(curr);
        }
        return ans;
    }

    public static boolean contains(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return true;
        }

        return false;
    }
}