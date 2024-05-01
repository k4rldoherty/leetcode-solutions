public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abczabb";
        char ch = 'z';
        System.out.println(reversePrefix(word, ch)); 
    }

    public static String reversePrefix(String word, char c) {
        int index = word.indexOf(c);
        if(index == -1 || word.length() == 1) return word;
        
        return new StringBuilder(word.substring(0, index+1)).reverse().toString() + word.substring(index+1);
    }
}