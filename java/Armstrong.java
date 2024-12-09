/*
 *  Eg. 153
 *  If 1 cubed + 5 cubed + 3 cubed == 153, it is an armstrong number
 */

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(armstrong(num));
    }

    public static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while(n != 0) {

            // 153 % 10 == 15 remainder 3 so 3 is rem
            int rem = n % 10;

            // Cube the remainder -> 3 which is 27, and add it to sum variable
            sum += Math.pow(rem, 3);

            // 153 / 10 = 15 BECAUSE USING INTEGERS SO NO DECIMAL POINTS
            n /= 10;
        }

        return sum == original;
    }
}
