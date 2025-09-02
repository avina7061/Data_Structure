package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class KthLargestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count1 = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                count1++;
            }
        }

        for (int j = 0; j < q; j++) {
            int type = sc.nextInt();
            int val = sc.nextInt();

            if (type == 1) {
                if (arr[val - 1] == 1) {
                    arr[val - 1] = 0;
                    count1--;
                } else {
                    arr[val - 1] = 1;
                    count1++;
                }
            } else if (type == 2) {
                if (count1 >= val) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
