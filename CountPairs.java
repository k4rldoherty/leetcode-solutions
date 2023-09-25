import java.util.ArrayList;
import java.util.List;

class CountPairs {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(3);
        int target = -2;
        System.out.println(countPairs(nums, target));
    }

    // TO OPTIMIZE MEMORY USAGE, USE nums.toArray(arr) to create an array and use same code just with array notation.

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}