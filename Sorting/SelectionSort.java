package Data_Structure.Sorting;

class selection {

    static void selectionsort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                // Swap the elements
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}

 class SelectionSort {
    public static void main(String[] args) {
        // Create an array to sort
        int arr[] = {2, 45, 25, 5, 30};
selection Sort = new selection();

        Sort.selectionsort(arr);

        Sort.printArray(arr);
    }
}
