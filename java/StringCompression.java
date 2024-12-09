import java.util.Arrays;

class StringCompression {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        char[] char2 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        char[] char3 = { 'a' };
        char[] char4 = {'a', 'b', 'c'};
        System.out.println(compress(char4));
    }

    public static int compress(char[] array) {
        StringBuilder builder = new StringBuilder();
        int i = 0;

        if (array.length == 1) {
            return 1;
        }

        while (i < array.length - 1) {
            int repeatCount = 1;
            char currChar = array[i]; // a
            
            if (array[i + 1] == currChar) {
                int j = i + 1;
                while (array[j] == currChar && j < array.length) {
                    if (j == array.length - 1 && array[j] == currChar) {
                        repeatCount++;
                        break;
                    } else {
                        repeatCount++;
                        j++;

                    }
                }
            }
            
            builder.append(currChar);
            if (repeatCount > 1)
                builder.append(repeatCount);
            i += repeatCount;

        }
        int newLength = builder.length();
        for (int k = 0; k < newLength; k++) {
            array[k] = builder.charAt(k);
        }
        System.out.println(Arrays.toString(array));
        return builder.length();
    }
}