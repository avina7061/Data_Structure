package Data_Structure.Extra_Question_Practice;

import java.util.Arrays;
import java.util.Scanner;
public class TeamTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x= sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans=0;
            int count=0;
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int i=n-1; i>=0; i--){
                count++;
                min = Math.min(min,arr[i]);
                sum =count*min;
                if(sum>=x){
                    ans++;
                    count=0;
                    sum=0;
                    min=Integer.MAX_VALUE;
                }
            }
            System.out.println(ans);

        }
    }
}
