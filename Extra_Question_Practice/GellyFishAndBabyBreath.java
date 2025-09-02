package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class GellyFishAndBabyBreath {

    static final long MOD = 998244353;

    public static long powerMod(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] p = new long[n];
            long[] q = new long[n];

            for (int i = 0; i < n; i++) p[i] = sc.nextLong();
            for (int i = 0; i < n; i++) q[i] = sc.nextLong();

            long[] arr = new long[n];
            int sw = -1, sw2 = -1, ind = -1, ind2 = -1;
            long val = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (val <= p[i]) {
                    if (val == p[i]) {
                        sw2 = 1;
                        ind2 = i;
                    } else {
                        val = p[i];
                        sw = 1;
                        ind = i;
                    }
                }

                if (val <= q[i]) {
                    if (val == q[i]) {
                        sw2 = 2;
                        ind2 = i;
                    } else {
                        val = q[i];
                        sw = 2;
                        ind = i;
                    }
                }

                long res = 0;

                if (sw == 1 && i - ind >= 0 && i - ind < n) {
                    res = (powerMod(2, p[ind], MOD) + powerMod(2, q[i - ind], MOD)) % MOD;
                } else if (sw == 2 && i - ind >= 0 && i - ind < n) {
                    res = (powerMod(2, p[i - ind], MOD) + powerMod(2, q[ind], MOD)) % MOD;
                }

                if (sw2 == 1 && i - ind2 >= 0 && i - ind2 < n) {
                    long temp = (powerMod(2, p[ind2], MOD) + powerMod(2, q[i - ind2], MOD)) % MOD;
                    res = Math.max(res, temp);
                } else if (sw2 == 2 && i - ind2 >= 0 && i - ind2 < n) {
                    long temp = (powerMod(2, p[i - ind2], MOD) + powerMod(2, q[ind2], MOD)) % MOD;
                    res = Math.max(res, temp);
                }

                arr[i] = res;
            }

            for (long ans : arr) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
