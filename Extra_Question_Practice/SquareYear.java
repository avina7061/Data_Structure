package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class SquareYear {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int val=Integer.parseInt(s);
            if(!isPerfectSquare(val)){
                System.out.println(-1);
                continue;
            }
            int val2=(int) Math.sqrt(val);
            System.out.println(0+" "+val2);

        }
    }
}
