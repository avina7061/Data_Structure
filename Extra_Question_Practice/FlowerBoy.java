package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class FlowerBoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(int i=0; i<m; i++){
                b[i] = sc.nextInt();
            }

            // First check if we can collect without inserting
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (c < m && a[i] >= b[c]) {
                    c++;
                }
            }
            if (c == m) {
                System.out.println(0);
                continue;
            }

            int min = Integer.MAX_VALUE;
            int ind = 0;
            int nd = 0;
            int k = 0;

            while (k < m) {
                int val = b[nd]; // try inserting this one
                c = 0;
                int j = 0;
                boolean inserted = false;

                // Simulate collecting flowers
                while (j < n || !inserted) {
                    if (!inserted && j == ind) {
                        if (c < m && val >= b[c]) {
                            c++;
                        }
                        inserted = true;
                    } else {
                        if (j < n && c < m && a[j] >= b[c]) {
                            c++;
                        }
                        j++;
                    }
                }

                if (c == m) {
                    min = Math.min(min, val);
                }

                // Move to next possible b[nd] and where to insert it
                while (ind < n && a[ind] < b[nd]) {
                    ind++;
                }

                if (ind < n) {
                    ind++;
                    nd++;
                } else {
                    break;
                }

                k++;
            }

            if (min != Integer.MAX_VALUE) {
                System.out.println(min);
            } else {
                System.out.println(-1);
            }
        }
    }
}
