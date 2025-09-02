package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class EqualValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }

            long min = Long.MAX_VALUE;

            for(int i=0; i<n; i++){
                long val = arr[i];
                long x = val * i + val * (n - (i + 1));
                min = Math.min(min, x);
            }

            int prev = 0;
            for(int i = 0; i < n; i++) {
                while(i < n && arr[prev] == arr[i]){
                    long val1 = arr[prev];
                    long val2 = arr[i];
                    long x = val1 * prev + val2 * (n - (i + 1));
                    min = Math.min(min, x);
                    i++;
                }
                prev = i;
            }
            System.out.println(min);
        }
    }
}
