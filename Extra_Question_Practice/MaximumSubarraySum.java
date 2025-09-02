package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            String s = sc.next();
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            long max = 0;
            long res = Long.MIN_VALUE;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != '0'){
                    max = Math.max(max + arr[i], arr[i]);
                    res = Math.max(res, max);
                } else {
                    max = 0;
                }
            }

            if(res > k){
                System.out.println("No");
            }
            else if(res == k){
                System.out.println("Yes");
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == '0'){
                        arr[i] = -1000000000000000000L;
                    }
                }
                for(long i : arr){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            else {
                int point = -1;
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == '0'){
                        point = i;
                        break;
                    }
                }
                if(point == -1){
                    System.out.println("No");
                } else {
                    long psum = 0, prefix = 0;
                    for(int i = point - 1; i >= 0; i--){
                        if(s.charAt(i) == '0') break;
                        psum += arr[i];
                        prefix = Math.max(prefix, psum);
                    }

                    long ssum = 0, suffix = 0;
                    for(int i = point + 1; i < n; i++){
                        if(s.charAt(i) == '0') break;
                        ssum += arr[i];
                        suffix = Math.max(ssum, suffix);
                    }

                    long val = k - (prefix + suffix);

                    for(int i = 0; i < n; i++){
                        if(s.charAt(i) == '0' && i != point){
                            arr[i] = -1000000000000000000L;
                        }
                    }

                    arr[point] = val;

                    System.out.println("Yes");
                    for(long i : arr){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}