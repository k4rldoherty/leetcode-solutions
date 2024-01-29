import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] mat = {{1,2,}, {3,4}, {5,6}};
        int[][] sol = transpose(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(sol[i]));
        }
    }

    public static int[][] transpose(int[][] mat) {
        int[][] sol = new int[mat[0].length][mat.length];

        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                sol[i][j] = mat[j][i];
            }
        }
        return sol;
    }
} 