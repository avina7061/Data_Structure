package Data_Structure.Searching;

public class Searching {
     //Linear Search
    public static int linearSearch(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The element is found at the index: " + i);
                return i;
            }
        }
        System.out.println("The element " + value+ " not found.");
        return -1;
    }

    // Binary Search

    class Solution {
        public int binarySearch(int[] arr, int value) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (arr[middle] == value) {
                    System.out.println("The element is found at the index: " + middle);
                    return middle;
                } else if (arr[middle] < value) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
            System.out.println("The element " + value + " not found.");
            return -1;
        }
    }

}
