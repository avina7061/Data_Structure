package Data_Structure.Practice;

public class Insertion {
    public static void insertion(int arr[]){


        for(int i=1; i<arr.length; i++){
            int j=i-1;
            int tempr = arr[i];
            while(j>0&&tempr<arr[j]){

                j--;
            }
            arr[j]=tempr;
            arr[i]=arr[j];
        }
    }
    public static  void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
    public static void main(String[] args) {
int arr[]={1,1,5,45,1,1,0};
insertion(arr);
printArray(arr);
    }
}
