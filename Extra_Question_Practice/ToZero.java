package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class ToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n<=k){
                System.out.println(1);
                continue;
            }
            int cnt=0;
            if(n%2!=0){
                long val=0;
                val=k;
                cnt++;
                n-=val;
            }
            else{
                long val=0;
                val=k-1;
                n-=val;
                cnt++;
            }
                cnt+=n/(k-1);
                if(n%(k-1)!=0){
                    cnt++;
                }
            System.out.println(cnt);
        }
    }
}
