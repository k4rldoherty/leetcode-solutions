import java.util.Arrays;

// take middle col and perform binary search
// middle element == 6
// if target < element so everything after element must be greater than target
// if target > element everything before element must be less than target
// Bounds = Lower(0) and Upper(Rows.length - 1)
// mid = lower + (upper - lower) / 2
// in the end only 2 rows will be remaining.
// check if answer is found in middle column
// break matrix into 4 parts around the middle column
// perform binary search on each part until solution found.

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 33;

        System.out.println(search(matrix, target));
    }

    public static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            // if there is only one row it is a normal array
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int startRow = 0;
        int endRow = rows - 1;
        int midCol = (cols / 2);

        while(startRow <= (endRow - 1)) {
            int midRow = startRow + (endRow - startRow) / 2;

            if(matrix[midRow][midCol] == target) {
                return true;
            } else if (matrix[midRow][midCol] < target) {
                startRow = midRow;
            } else {
                // greater than
                endRow = midRow;
            }
        }

        // 2 rows left.
        // Check if answer is in remaining rows.
        if(matrix[startRow][midCol] == target) {
            return true;
        }

        if(matrix[startRow + 1][midCol] == target) {
            return true;
        }

        // Next Split matrix into 4 parts around the middle col and perform binary search in each part.'
        boolean[] result = {
            binarySearch(matrix, startRow, 0, midCol - 1, target),
            binarySearch(matrix, startRow + 1, 0, midCol - 1, target),
            binarySearch(matrix, startRow, midCol + 1, cols - 1, target),
            binarySearch(matrix, startRow + 1, midCol + 1, cols - 1, target)
        };

        for (int i = 0; i < result.length; i++) {
            if(result[i] == true) return true;
        }

        return false;
    }

    public static boolean binarySearch(int[][] matrix, int row, int startCol, int endCol, int target) {
        while(startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;

            if(matrix[row][midCol] == target) {
                return true;
            } else if(matrix[row][midCol] < target) {
                startCol = midCol; 
            } else {
                endCol = startCol;
            }
        }
        return false;
    }
}
