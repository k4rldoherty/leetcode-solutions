import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int max = 100;
        int min = 1;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * max) + min;
            arr[i] = random;
        }

        System.out.println("The randomly generated array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nSorting...\n");

        System.out.println("The Sorted Array is:");
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        // outer loop - runs through every element in the array
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // inner loop - runs through the array from the second element onwards
            // comparing.
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    swapped = true;
                }
            }
            // if the program makes one full loop through and does not swap any elements it
            // is already sorted.
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
