import java.util.Arrays;

public class BinarySearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(Arrays.toString(search(matrix, 2)));
    }

    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] matrix, int target) {

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

        int rows = matrix.length;
        int columns = matrix[0].length;

        if(rows == -1) {
            return binarySearch(matrix, 0, 0, columns - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int midCol = columns / 2;

        // run the loop until 2 rows are remaining.
        while(rowStart <= (rowEnd - 1)) { // until there are 2 rows remaining
            int mid = rowStart + (rowEnd - rowStart) / 2;
            
            if(matrix[mid][midCol] == target) {
                return new int[] {mid, midCol};
            } else if(matrix[mid][midCol] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // now we have 2 rows
        // check whether the target is in the middle column of the 2 rows.
        if(matrix[rowStart][midCol] == target) {
            return new int[] {rowStart, midCol};
        }
        
        if(matrix[rowStart + 1][midCol] == target) {
            return new int[] {rowStart + 1, midCol};
        }

        // search in first quarter
        if(target <= matrix[rowStart][midCol - 1]) {
            return binarySearch(matrix, rowStart, 0, midCol - 1, target);
        }
        
        // search in second quarter
        if(target <= matrix[rowStart + 1][midCol - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, midCol - 1, target);
        }
        
        // search in third quarter
        if(target >= matrix[rowStart][midCol + 1] && target <= matrix[rowStart][columns - 1]) {
            return binarySearch(matrix, rowStart, midCol + 1, columns - 1, target);
        }

        // search in fourth quarter
        if(target >= matrix[rowStart + 1][midCol + 1]) {
            return binarySearch(matrix, rowStart + 1, midCol + 1, columns - 1, target);
        }


        return new int[] {-1, -1};
    }
}
