package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class NeedmoreArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int prev=0;
            int curr=1;
            int cnt=1;
            while(curr<n){
               if(arr[curr]>arr[prev]+1){
                   prev=curr;
                   cnt++;
               }
               curr++;
            }
            System.out.println(cnt);
        }
    }
}
