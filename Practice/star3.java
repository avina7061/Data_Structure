package Data_Structure.Practice;

public class star3 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= 6; j++) {

                if (i == 6 || j == 1 || j == 6 || i == 1) {
                    System.out.print("4 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
