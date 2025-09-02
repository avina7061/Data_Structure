package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class IdealGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int k = sc.nextInt();
            if(k%2==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
