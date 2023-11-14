import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,38,49},
            {33,34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 15)));
    }


    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        // While the rows dont increast until the end and the colums dont get to 0;
        while(row < matrix.length && column >= 0) {
            if(matrix[row][column] == target) {
                return new int[]{row, column};
            } else if(matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }

        return null;
    }
}
