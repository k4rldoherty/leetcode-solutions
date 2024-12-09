public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // true
        int[] nums2 = {5, 4, 3, 2, 1}; // false
        int[] nums3 = {20,100,10,12,5,13}; // true
        // System.out.println(increasingTriplet(nums));
        // System.out.println(increasingTriplet(nums2));
        System.out.println(increasingTriplet(nums3));
    }

    public static boolean increasingTriplet(int[] nums) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; } // update small if n is smaller than both
            else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
            else return true; // return if you find a number bigger than both
        }
        return false;
    }
}
