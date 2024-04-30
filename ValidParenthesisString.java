public class ValidParenthesisString {
    public static void main(String[] args) {
        // String s1 = "()()*)"; // true
        // String s2 = "()())"; // false 
        // String s3 = "("; // false
        // String s4 = "**"; // true
        // String s5 = "("; // false 
        String s6 = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"; // false
        // String[] strings = {s1, s2, s3, s4, s5, s6};
        // for (int i = 0; i < strings.length; i++) {
        //     System.out.println(checkValidString(strings[i]) + "\n\n");
        // }

        System.out.println(checkValidString(s6));
    }

    public static boolean checkValidString(String s) {
        if(s.length() == 1) {
            return s.equals("*") ? true : false;
        }
        char[] charArray = s.toCharArray();
        int lCount = 0; 
        int rCount = 0;
        int starCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '(':
                    lCount++;
                    break;
                
                case ')':
                    rCount++;
                    break;
                
                case '*':
                    starCount++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Left Count->%d\nRight Count->%d\nStar Count->%d\n", lCount,rCount, starCount);
        if(lCount == rCount) return true;
        else {
            if(lCount > rCount) {
                return rCount + starCount == lCount ? true : false;
            } else {
                return lCount + starCount == rCount ? true : false;
            }
        }
    }
}
