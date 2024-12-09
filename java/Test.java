import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            l.add(i);
        }

        System.out.println(
            l.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList())    
        );
    }
}
