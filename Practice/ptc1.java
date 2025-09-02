package Data_Structure.Practice;

public class ptc1 {
    static void bubblesort(int arr[]){

        for(int i=0; i<arr.length; i++){
            boolean flag =true;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }
    }
    //selection sort
    static void selectionSort(int []arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int ind =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    ind =j;
                }

            }
            System.out.println(ind);
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
        }
    }

    //insertion sort
    static void insertionSort(int[]arr){
        for(int i=1; i<arr.length; i++){
            int j=i-1;
            int temp=arr[i];
            while(j>0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    static void print(int arr[]){
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }
    public static void main(String[] args) {

     //   int arr[]={54,12,5,0,1,1,25};
        int arr[]={0,1,1,25,20};
//        bubblesort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        print(arr);

    }
}
