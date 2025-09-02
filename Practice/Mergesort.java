package Data_Structure.Practice;

public class Mergesort {
    static void merge(int[]arr,int left,int mid,int right){
        int i = left;      // Starting index for left subarray
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                i++;  // Move the pointer in the left subarray
            } else {
                // If arr[i] > arr[j], we need to swap elements
                int temp = arr[j];
                // Shift all elements of the left subarray one position to the right
                for (int k = j; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
                // Place arr[j] at its correct position in the left subarray
                arr[i] = temp;

                // Move both pointers
                i++;
               mid++;
                j++;
            }
        }


//        int A[]= new int[mid-left+1];
//        int B[]= new int[right-mid];
//        for(int i=0; i<=mid-left; i++){
//            A[i]=arr[left+i];
//        }
//        for(int j=0; j<right-mid; j++){
//            B[j]=arr[mid+j+1];
//        }
//        int m=0;
//        int n=0;
//        int k=left;
//        while(m<A.length&&n<B.length){
//            if(A[m]<=B[n]){
//                arr[k]=A[m];
//                m++;
//            }
//            else{
//                arr[k]=B[n];
//                n++;
//            }
//            k++;
//        }
//        while(m<A.length){
//            arr[k]=A[m];
//            m++;
//            k++;
//        }
//        while(n<B.length){
//            arr[k]=B[n];
//            n++;
//            k++;
//        }
    }
    static void mergesort(int[] arr, int left, int right){
        if(left<right) {
            int mid = (left + right) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void print(int arr[]){
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={14, 21, 0, 1, 0, 0, 12, 45 };
        mergesort(arr,0, 7);
        print(arr);
    }
}
