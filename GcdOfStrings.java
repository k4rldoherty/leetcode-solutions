public class GcdOfStrings {

    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String sol = "";
        String smallest = str1.length() <= str2.length() ? str1 : str2;
        System.out.println(smallest + " <-- Smallest");
        String largest = str1.length() > str2.length() ? str1 : str2;
        System.out.println(largest + " <-- Largest");

        for (int i = 1; i < smallest.length() + 1; i++) {

            String currSubString = smallest.substring(0, i);

            int repeatNumLargest = largest.length() / currSubString.length();

            int repeatedNumSmallest = smallest.length() / currSubString.length();

            StringBuilder builder = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();

            for (int j = 0; j < repeatNumLargest; j++) {
                builder.append(currSubString);
            }

            for (int j = 0; j < repeatedNumSmallest; j++) {
                builder2.append(currSubString);
            }

            if (builder.toString().equals(largest) && builder2.toString().equals(smallest)) {
                sol = currSubString;
                System.out.println(sol + " <-- Current Answer");
            }
        }
        return sol;
    }
}