public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9, 30, 60, 300};
        int target = 60;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binSearchRec(arr, target, start, end)); 
    }

    public static int binSearchRec(int[] arr, int target, int start, int end) {
        if(start > end) {
            return - 1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] < target) {
            return binSearchRec(arr, target, mid + 1, end);
        }

        else {
            return binSearchRec(arr, target, start, mid - 1);
        }
    }
}
