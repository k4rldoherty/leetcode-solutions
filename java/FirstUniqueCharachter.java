import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueCharachter {
    public static void main(String[] args) {
        String s = "aabb";
        String s2 = "dddccdbba";
        String s3 = "loveleetcode";
        System.out.println(firstUniqueCharachter(s));
        System.out.println(firstUniqueCharachter(s2));
        System.out.println(firstUniqueCharachter(s3));
    }

    public static int firstUniqueCharachter(String s) {
        if (s.length() == 1) {
            return 0;
        }

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i - 1);
            String subString = s.substring(i);

            // If the rest of the string bar the curr char contains currChar and currChar is
            // not in the list, add it to the list
            if (subString.contains(Character.toString(currChar)) && !list.contains(currChar)) {
                list.add(currChar);
                System.out.println(Arrays.toString(list.toArray()));
            }


            else if (!subString.contains(Character.toString(currChar)) && !list.contains(currChar)) {
                return i - 1;
            }

            else if (i == s.length() - 1 && !list.contains(s.charAt(s.length() - 1))) {
                return i;
            }

            else {
                continue;
            }
        }
        return -1;
    }
}
