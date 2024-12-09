public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String string : sentences) {
            int stringSplit = string.split(" ").length;
            if(stringSplit > maxWords) {
                maxWords = stringSplit;
            }
        }
        return maxWords;

    }
    
}
