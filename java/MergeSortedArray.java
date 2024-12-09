import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n,m = 3;
        merge(nums1, m, nums2, m);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Add all elements to list 1
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }


        // sort the array
        Boolean swapped;
        for (int i = 0; i < nums1.length; i++) {
            swapped = false;
            for (int k = 1; k < nums1.length; k++) {
                if (nums1[k] < nums1[k - 1]) {
                    swap(nums1, k, k-1);
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }

    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
