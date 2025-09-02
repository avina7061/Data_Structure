package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class KthNotDivisibleByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long start = 1;
            long end = n * k;
            long ans = -1;

            while(start <= end){
                long mid = (start + end) / 2;
                if(mid - (mid / n) < k){
                    start = mid + 1;
                } else {
                    ans = mid;
                    end = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }
}
