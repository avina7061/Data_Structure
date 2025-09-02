package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class skibidusAndFanumTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int b = sc.nextInt();

            boolean flag = false;

            // Apply min(v[0], b - v[0])
            arr[0] = Math.min(arr[0], b - arr[0]);

            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    arr[i] = b - arr[i];
                    if (arr[i] < arr[i - 1]) {
                        flag = true;
                        break;
                    }
                } else if (b - arr[i] >= arr[i - 1] && arr[i] > b - arr[i]) {
                    arr[i] = b - arr[i];
                }
            }

            System.out.println(flag ? "No" : "Yes");
        }
    }
}
