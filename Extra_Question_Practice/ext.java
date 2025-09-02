package Data_Structure.Extra_Question_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            boolean b =true;
            for(int i=1; i<n; i++){
                if(Math.abs(arr[i]-arr[i-1])<=1){
                    System.out.println(0);
                    b=false;
                    break;
                }
            }
            Arrays.sort(arr);
            if(b){
                for(int i=2; i<n; i++){
                    if(Math.abs(arr[i]-arr[i-1])<=1){
                        System.out.println(1);
                        b=false;
                        break;
                    }
                }
            }
            if(b) System.out.println(-1);
        }
    }
}
