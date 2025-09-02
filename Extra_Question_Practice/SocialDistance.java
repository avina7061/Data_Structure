package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class SocialDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();

            int ans = 0;
            int lastOne = -k - 1; // to allow placing at index 0 if possible

            for (int i = 0; i < n; i++) {
                if (arr[i] == '1') {
                    lastOne = i; // update last position where '1' is found
                } else {
                    if (i - lastOne > k) {
                        // check forward: if any '1' within k ahead, skip
                        boolean canPlace = true;
                        for (int j = i + 1; j <= i + k && j < n; j++) {
                            if (arr[j] == '1') {
                                canPlace = false;
                                break;
                            }
                        }
                        if (canPlace) {
                            arr[i] = '1';
                            lastOne = i;
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
