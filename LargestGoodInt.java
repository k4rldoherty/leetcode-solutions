public class LargestGoodInt {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num) {
        String[] possibilities = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (int i = 0; i < possibilities.length; i++) {
            if(num.contains(possibilities[i])) {
                return possibilities[i];
            }
        }
        return "";
    }
}
