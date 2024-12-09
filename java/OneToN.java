import java.lang.reflect.Array;
import java.util.Arrays;

class OneToN {

    public static void main(String[] args) {
        String test = "  hello world  ";
        String unFormatted = reverseWords(test);
        System.out.println(unFormatted);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] sArr = s.split("\\s+");
        System.out.println(Arrays.toString(sArr));
        sArr = swap(sArr, 0, sArr.length - 1);
        return String.join(" ", sArr);
    }

    public static String[] swap(String[] sArr, int start, int end) {
        if (start >= end)
            return sArr;

        String temp = sArr[start];
        sArr[start] = sArr[end];
        sArr[end] = temp;

        return swap(sArr, start + 1, end - 1);
    }
}