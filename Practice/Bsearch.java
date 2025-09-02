package Data_Structure.Practice;

import java.util.Arrays;
public class Bsearch {
    public static void main(String[] args) {
        int arr[]={54,14,25,32,63,12,5,41,30};
        int target= arr[4];
        Arrays.sort(arr);

        int start =0;
        int end = arr.length-1;
        for(int i=0; i<arr.length; i++){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("value found");
                return;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
    }
}