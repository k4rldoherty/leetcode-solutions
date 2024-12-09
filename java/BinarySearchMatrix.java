import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 38, 49 },
                { 33, 34, 38, 50 }
        };

        System.out.println(Arrays.toString(search(arr, 15)));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[row].length - 1;

        while (row < matrix[row].length && column >= 0) {
            if (matrix[row][column] == target) {
                // if the target is found, return the row and column it is found;
                return new int[] { row, column };
            } else if (matrix[row][column] < target) {
                // if the element is less than target, all the elements before it are also going
                // to be less than the target, so eliminate this row and increase the row index
                row++;
            } else {
                // if the element is more than the target, all the elements in that column will
                // also be bigger than the target as it is sorted both column wise and row wise,
                // so decrease the column and continue.
                column--;
            }
        }

        return new int[] { -1, -1 }; // No Occurance Is Found.
    }
}