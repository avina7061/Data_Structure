package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
public class BrBrrPotapim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int sum= ((2*n)*(2*n+1))/2;
            int arr[]= new int[2*n];
            int dp[][]= new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    dp[i][j]= sc.nextInt();
                    arr[i+j+1]= dp[i][j];

                }
            }
            for(int i=1; i<arr.length; i++){
                sum-=arr[i];
            }
            arr[0]=sum;
            for(int num: arr){
                System.out.println(num);
            }


        }
    }
}
