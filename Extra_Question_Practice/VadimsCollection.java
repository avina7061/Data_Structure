package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class VadimsCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int[] count = new int[10];

            for (char ch : s.toCharArray()) {
                count[ch - '0']++;
            }

            StringBuilder ans = new StringBuilder();
            int val = 9;

            for (int i = 0; i < 10; i++) {
                if (count[val] > 0) {
                    ans.append(val);
                    count[val]--;
                    val--;
                } else {
                    int x = val + 1;
                    while (x < 10 && count[x] == 0) x++;
                    ans.append(x);
                    count[x]--;
                    val--;
                }
            }

            System.out.println(ans.toString());
        }
    }
}
