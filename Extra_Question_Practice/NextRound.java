package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int i=0;
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }
        int val = arr[k-1];
        int count=0;
        for(int j=0; j<n; j++){
            if(val==0){
                if(val<arr[j]){
                    count++;
                }
            }
            else{
                if(val<=arr[j]){
                    count++;
                }
            }

        }
        System.out.println(count);
    }


}
