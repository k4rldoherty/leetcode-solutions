import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }

    public static int romanToInteger(String s) {
        int result = 0;
        Map<Character, Integer> romanNumeralsMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char currNumeral = s.charAt(i);
            switch (currNumeral) {
                case 'I':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                        result += 4;
                        i += 1;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                        result += 9;
                        i += 1;
                    } else
                        result += romanNumeralsMap.get(currNumeral);
                    break;

                case 'X':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                        result += 40;
                        i += 1;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                        result += 90;
                        i += 1;
                    } else
                        result += romanNumeralsMap.get(currNumeral);
                    break;

                case 'C':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                        result += 400;
                        i += 1;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                        result += 900;
                        i += 1;
                    } else
                        result += romanNumeralsMap.get(currNumeral);
                    break;
                default:
                    result += romanNumeralsMap.get(currNumeral);
                    break;
            }
        }

        return result;
    }
}
