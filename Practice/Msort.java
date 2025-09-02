package Data_Structure.Practice;


 class Msort {

    public static void merge(int []arr,int left,int mid, int right){
        int lefttmparr[]=new int [mid-left+2];
        int righttmparr[]=new int[right-mid+1];
        for(int i=0; i<=mid-left; i++){
            lefttmparr[i]=arr[left+i];
        }
        for(int i=0; i<right-mid; i++){
            righttmparr[i]=arr[mid+1+i];
        }
        lefttmparr[mid-left+1] = Integer.MAX_VALUE;
        righttmparr[right-mid] = Integer.MAX_VALUE;
        int l=0;
        int m=0;
        for(int i=left;i<=right; i++){
            if(lefttmparr[l]<righttmparr[m]){
                arr[i]=lefttmparr[l];
                l++;
            }
            else{
                arr[i]=righttmparr[m];
                m++;
            }


        }

    }
    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

    public static void mergeSort(int []arr,int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int arr[]= {3,76,65,45,0,0,9};
        mergeSort(arr,0,6);
        printArray(arr);
    }
}
