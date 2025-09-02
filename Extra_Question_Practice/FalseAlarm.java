package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class FalseAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[]= new int[n];
            int cnt1=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    cnt1++;
                }
            }
            if(x>n){
                System.out.println("Yes");
                continue;
            }
            if(cnt1>x){
                System.out.println("No");
                continue;
            }
            int cnt=0;
            for(int i=0;i<x; i++){
               if(arr[i]==1){
                   cnt++;
               }
            }
            if(cnt==cnt1) {
                System.out.println("Yes");
                continue;
            }
            int i=0;
            int j=x;
            boolean bt =true;
            while(j<n){
                if(arr[j]==1){
                    cnt++;
                }
                if(arr[i]==1){
                    cnt--;
                }
                if(cnt==cnt1){
                    bt=false;
                    System.out.println("Yes");
                    break;
                }
                i++;
                j++;
            }
            if(bt) System.out.println("No");
        }
    }
}
