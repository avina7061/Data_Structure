package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class CherryBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            boolean bt = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int val = -1;

            for (int i = 0; i < n; i++) {
                if (b[i] != -1) {
                    val = a[i] + b[i];
                    break;
                }
            }

            if (val != -1) {
                for (int i = 0; i < n; i++) {
                    if (b[i] != -1) {
                        if (a[i] + b[i] != val) {
                            bt = true;
                            break;
                        }
                    } else {
                        int bi = val - a[i];
                        if (bi < 0 || bi > k) {
                            bt = true;
                            break;
                        }
                    }
                }

                if (bt) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    min = Math.min(min, a[i]);
                    max = Math.max(max, a[i]);
                }

                System.out.println((min + k - max + 1));
            }
        }
    }
}
