package Data_Structure.Linked_List;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be print in decreasing order ");
        int layers = scanner.nextInt();
        int n = layers * 2 - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                int num = layers - layer;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
