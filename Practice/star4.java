package Data_Structure.Practice;
public class star4 {
    public static void main(String[] args) {
        int l = 0, s = 1,n=11;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = n - 2; a >= 0; a--) {
            for (int b = 1; b <= s; b++) {
                System.out.print("  ");
            }
            if (s <= n - 2) {
                s++;}
            for (int p = 2 * a + 1; p > 0; p--) {
                System.out.print("* ");
            }
            System.out.println();
        }}}


