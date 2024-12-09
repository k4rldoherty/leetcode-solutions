import java.util.HashMap;

public class NumberOfWonderfulSubstrings {

    public static void main(String[] args) {
        String word = "aba";
        String word2 = "aabb";
        String word3 = "hello";
        System.out.println(wonderfulSubstrings(word));
        System.out.println(wonderfulSubstrings(word2));
        System.out.println(wonderfulSubstrings(word3));
    }

    public static long wonderfulSubstrings(String word) {
        long numWonderful = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                String substring = word.substring(i, j);
                if (isWonderful(substring)) {
                    numWonderful++;
                }
            }
        }
        return numWonderful;
    }

    public static boolean isWonderful(String substring) {
        if (substring.length() == 1)
            return true;
        HashMap<String, Integer> letterMap = new HashMap<>();
        for (String letter : substring.split("")) {
            if(letterMap.get(letter) == null) {
                letterMap.put(letter, 1);
            } else {
                letterMap.put(letter, letterMap.get(letter) + 1);
            }
        }

        int oddCount = 0;

        for(Integer letterCount: letterMap.values()) {
            if(letterCount % 2 != 0) oddCount++; 
        }
        
        return oddCount <= 1 ? true : false;
    }
}

// Logic was correct but program was not efficient enough for leetcode