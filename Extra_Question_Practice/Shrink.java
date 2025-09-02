package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class Shrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int ind=1;
            int m =n;
            for(int i=ind; i<n; i+=2){
                if(i!=n-1){
                    arr[i]=m;
                     m--;
                }
            }
            for(int i=2; i<n; i+=2){
                arr[i]=m;
                m--;
            }
            for(int i=0; i<n; i++){
                if(arr[i]==0){
                    arr[i]=m;
                    m--;
                }
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
