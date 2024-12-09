public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        char[] reversed = new char[Integer.toString(x).length()];
        int j = 0;
        for (int i = reversed.length - 1; i >= 0; i--) {
            reversed[j] = Integer.toString(x).charAt(i);
            j++;
        }
        String reversedString = String.valueOf(reversed);
        System.out.println(reversedString);
        System.out.println(x);
        return Integer.toString(x).equals(reversedString);
    }
}
