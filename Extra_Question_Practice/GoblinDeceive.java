package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class GoblinDeceive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long cnt1 = 0;
            long cnt2 = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '-') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            }

            if (cnt1 < 2) {
                System.out.println(0);
                continue;
            }

            long x = cnt1 / 2;
            long y = cnt1 - x;
long ans=x * y * cnt2;
            System.out.println(ans);
        }
        sc.close();
    }
}
