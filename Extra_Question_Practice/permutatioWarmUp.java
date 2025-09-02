package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

 class DistinctFValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            System.out.println((long) Math.round((n*n+3)/4));
        }

    }
}
