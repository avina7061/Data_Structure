package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class NNandOpticalIllusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        double angle = Math.PI / n;

        double sinValue = Math.sin(angle);
        double result = (r * sinValue) / (1 - sinValue);

        float res = (float) result;

        System.out.println(res);
    }
}
