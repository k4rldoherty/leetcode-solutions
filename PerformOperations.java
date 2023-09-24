public class PerformOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(performOperations(operations));
    }

    public static int performOperations(String[] operations) {
        int finalValue = 0;
        for(String operation : operations) {
            switch(operation) {
                case "++X" -> finalValue++;
                case "X++" -> finalValue++;
                case "X--" -> finalValue--;
                case "--X" -> finalValue--;
            }
        }
        return finalValue;
    }
}
