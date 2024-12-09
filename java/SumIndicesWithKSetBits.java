import java.util.ArrayList;

public class SumIndicesWithKSetBits {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int k = 2;
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        // nums.add(2);

        System.out.println(sumIndicesWithKSetBits(nums, k));
    }

    public static int sumIndicesWithKSetBits(ArrayList<Integer> nums, int k) {
        int count = 0;
        
        /* 
         loop through list 
         convert each index to binary
         loop through binary digits
         if binary has same number of 1's beside eachoher as k's value
         add THE VALUE OF THE INDEX to count 
         */
        
        // for each element in the array
        for (int i = 0; i < nums.size(); i++) {
            
            // convert the index to binary
            String binarySting = Integer.toBinaryString(i);
            System.out.println(binarySting + " <--> "+ i + "<- In Binary");
            
            // if the length of the binary string is less than k it cant have 
            // set bits so automatically ignore
            if(binarySting.length() < k) {
                continue;
            }
            
            int setBitCount = 0;

            // loop through the binary string, checking how many 1's are in the binary String
            for(int j = 0; j < binarySting.length(); j++) {
                // define a set bit counter
                if (Character.getNumericValue(binarySting.charAt(j)) == 1) {
                    setBitCount += 1;
                }

            }
            System.out.println(setBitCount + " Bit Count");

            // if the setBitCount == k, add nums[i] to count and return count.
            if(setBitCount == k) {
                count+=nums.get(i);
            }
        }

        return count;

    }
}
