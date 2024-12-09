import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(shuffleString(s, indices));  
    }


    public static String shuffleString(String s, int[] indices) {
        String ans = ""; 
        HashMap<Integer, String> wordHash = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            wordHash.put(indices[i], Character.toString(s.charAt(i)));
        }

        for (int i = 0; i < wordHash.size(); i++) {
            ans+=wordHash.get(i);
        }
        return ans;
    }
}
