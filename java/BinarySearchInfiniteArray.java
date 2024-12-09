// amazon interview question
// search for element in an infinite length array - no arr.length can be used
// solution 1 - brute force - i = 0, while arr[i] != target i++ ...
// solution 2 - binary search in chunks starting from index 0,1 then going to 2,5 then to 6,13 .... 

public class BinarySearchInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 20, 21, 25, 30, 50, 70, 90, 100};
        int target = 20;
        System.out.println(binarySearchInfiniteArray(nums, target));
    }

    public static int binarySearchInfiniteArray(int[] nums, int target) {        
        int start = 0;
        int end = 1;
        while(target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(nums, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // method for finding the middle of the array that never gives an int too large
            // error
            int mid = start + (end - start / 2);

            // if the target int is larger than the int at the middle element of the array
            if (target > arr[mid]) {
                // sets the start element to one index past the middle element, cutting the
                // array in half
                start = mid + 1;
            } else if (target < arr[mid]) {
                // same idea, just moving end instead of start
                end = mid - 1;
            } else {
                // this is when you find the element if it is not smaller or larger it is the
                // element you are looking for.
                return mid;
            }
        }
        return -1;
    }
}
