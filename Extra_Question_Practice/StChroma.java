package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class StChroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            int m = 0;
            int i = 0;

            if (n == 1) {
                System.out.println(0);
                continue;
            }

            while (i < n - 1) {
                if (m != x) {
                    arr[i] = m;
                    m++;
                } else {
                    m++; // skip x
                    arr[i] = m;
                    m++;
                }
                i++;
            }

            // Fill last element
            if (x < n) {
                arr[n - 1] = x;
            } else {
                arr[n - 1] = m;
            }

            // Output properly formatted
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j]);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line after each test case
        }

        sc.close();
    }
}
