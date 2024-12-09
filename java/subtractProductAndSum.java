import java.util.Scanner;

/**
 * subtractProductAndSum
 * Example 1:
 * Input: n = 234
 * 
 * Output: 15
 * 
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * 
 */
public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        System.out.println(subProd(number));
        in.close();
    }

    public static int subProd(int num) {
        int prod = 1;
        int sum = 0;
        String numString = Integer.toString(num);
        for(String number: numString.split("")) {
            prod *= Integer.parseInt(number);
            sum += Integer.parseInt(number);
        }

        return prod - sum;
    }
}
