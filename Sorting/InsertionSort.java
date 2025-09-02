package Data_Structure.Sorting;
public class InsertionSort {

    // InsertionSort
    public void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while ( j> 0 && arr[j-1]>temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }


    public  void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

}

class Insertion {
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int arr[] = {2, 45, 25, 5, 30};
        obj.insertionsort(arr);
        obj.printArray(arr);
    }
}
