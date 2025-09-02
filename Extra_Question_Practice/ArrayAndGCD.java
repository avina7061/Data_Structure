package Data_Structure.Extra_Question_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayAndGCD {

    public static List<Integer> sievePrimes(int maxCount) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[5000000];
        for (int i = 2; i < isComposite.length && primes.size() < maxCount; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i + i; j < isComposite.length; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> primes = sievePrimes(400005);

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            long coin = 0;
            int j = -1;
            boolean possible = true;

            for(int i = n - 1, cnt = 0; i >= 0; i--, cnt++){
                int prime = primes.get(cnt);
                int val = arr[i];
                if(val > prime){
                    coin += val - prime;
                } else {
                    coin -= prime - val;
                }

                if(coin < 0){
                    j = i;
                    possible = false;
                    break;
                }
            }

            if(possible) System.out.println(0);
            else System.out.println(j + 1);
        }
    }
}