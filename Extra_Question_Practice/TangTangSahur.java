package Data_Structure.Extra_Question_Practice;
import java.util.Scanner;

public class TangTangSahur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String p = sc.next();
            String s = sc.next();

            int i = 0; // pointer for p
            int j = 0; // pointer for s
            boolean isValid = true;

            while (i < p.length() && j < s.length()) {
                char c = p.charAt(i);
                if (s.charAt(j) != c) {
                    isValid = false;
                    break;
                }

                // Count how many times c repeats in p
                int pCount = 1;
                while (i + 1 < p.length() && p.charAt(i + 1) == c) {
                    pCount++;
                    i++;
                }

                // Count how many times c repeats in s
                int sCount = 1;
                while (j + 1 < s.length() && s.charAt(j + 1) == c) {
                    sCount++;
                    j++;
                }

                // Each hit can be heard once or twice
                if (sCount < pCount || sCount > 2 * pCount) {
                    isValid = false;
                    break;
                }

                i++;
                j++;
            }

            // If either p or s is not fully traversed, it's invalid
            if (i != p.length() || j != s.length()) {
                isValid = false;
            }

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
