package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
public class RomanAndBroweser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int e=0;
        int s=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                e++;
            }
            else{
                s++;
            }
        }
        int max=0;
        for(int i=1; i<=k; i++){
            int ek=e;
            int sk=s;
            for(int j=i-1; j<n; j+=k){
                if(arr[j]==1){
                    ek--;
                }
                else{
                    sk--;
                }
            }
            max= Math.max(max,Math.abs(ek-sk));
        }
        System.out.println(max);
    }
}
