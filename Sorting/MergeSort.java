package Data_Structure.Sorting;
 class MergeSort {

     void merge(int[] A, int left, int middle, int right) {
        int[] leftTmpArray = new int[middle-left+2];
        int[] rightTmpArray = new int[right-middle+1];
        for (int i=0; i<=middle-left; i++) {
            leftTmpArray[i] = A[left+i];
        }
        for (int i=0; i<right-middle; i++) {
            rightTmpArray[i] = A[middle+1+i];
        }


        leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
        rightTmpArray[right-middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k<=right; k++) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                A[k] = leftTmpArray[i];
                i++;
            } else {
                A[k] = rightTmpArray[j];
                j++;
            }

        }

        // we also sort as like this
//         int m=0;
//         int n=0;
//         int k=left;
//         while(m<A.length&&n<B.length){
//             if(A[m]<=B[n]){
//                 arr[k]=A[m];
//                 m++;
//             }
//             else{
//                 arr[k]=B[n];
//                 n++;
//             }
//             k++;
//         }
//         while(m<A.length){
//             arr[k]=A[m];
//             m++;
//             k++;
//         }
//         while(n<B.length){
//             arr[k]=B[n];
//             n++;
//             k++;
//         }

    }

    public  void mergeSort(int[] Array, int left, int right) {
        if (right > left) {
            int m = (left+right)/2;
            mergeSort(Array, left, m);
            mergeSort(Array, m+1, right);
            merge(Array, left, m, right);
        }
    }



    public  void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

}

class Merge {
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int arr[]= {3,76,65,45,0,0,9};
        obj.mergeSort(arr,0,6);
        obj.printArray(arr);
    }
}
