package Data_Structure.Extra_Question_Practice;
import java.util.Scanner;

public class TrulimeroTrulicina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[][] dp = new int[n][m];
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = i + 1;
            }

            if (m % k == 0) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        dp[i][j] = arr[(j + i) % k];
                    }
                }
            } else {

                int c = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        dp[i][j] = arr[c];
                        c = (c + 1) % k;
                    }
                }
            }

            // Print the grid
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[0].length; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}