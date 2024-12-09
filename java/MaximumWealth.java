// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has 
// in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,334},{3,2,1}};
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i < accounts.length; i++) {
            // loop through the accounts array
            int count = 0;
            // loop through the inner array, and get a running sum
            for(int j = 0; j < accounts[i].length; j++) {
                count+= accounts[i][j];
            }
            // check if the running sum is larger than the current answer 
            if(count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
