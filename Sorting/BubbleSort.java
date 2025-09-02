package Data_Structure.Sorting;

class BubbleSort {  // Change class name to match the filename
    // Bubble sort function
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Function to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();  // Use the correct class name
        int arr[] = {2, 45, 25, 5, 30};
        sort.bubbleSort(arr);  // Perform bubble sort
        sort.printArray(arr);  // Print sorted array
    }
}
