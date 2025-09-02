package Data_Structure.Extra_Question_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
                arr[i] = Math.min(arr[i], n - 1);
            }
            Arrays.sort(arr);
            long[] prefix = new long[m + 1];
            for (int i = 0; i < m; i++) {
                prefix[i + 1] = prefix[i] + arr[i];
            }
            long sum = 0;

            for (int i = m - 1; i >= 0; i--) {
                int left = 0, right = i;
                int j = i;

                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] + arr[i] >= n) {
                        j = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                int count = i - j;
                long sumElements = prefix[i] - prefix[j];
                sum += 2L * (sumElements - (long)(n - arr[i] - 1) * count + count);
            }

            System.out.println(sum);
        }
    }
}
//correct code

//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//public class Codechef
//{
//    public static void main(String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        while (T--> 0) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int[] arr = new int[m];
//            for (int i = 0; i < m; i++) {
//                arr[i] = Math.min(sc.nextInt(), n-1);
//            }
//            Arrays.sort(arr);
//            long ans = 0;
//            int j = m-1;
//            long sum = 0;
//            for (int i = 0; i < m; i++) {
//                while(j>-1&&arr[i]+arr[j]>=n) {
//                    sum += arr[j--];
//                }
//                ans += sum + (arr[i]-n+1L)*(m-j-1L);
//                if(j<i) ans -= 2L*arr[i] - n + 1;
//            }
//            System.out.println(ans);
//        }
//    }
//}