package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class NewWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int opr=0;
            k=Math.abs(k);
            if(k%p==0){
                opr=k/p;
            }
            else{
                opr=(k/p)+1;
            }
            if(opr>n){
                System.out.println(-1);
            }
            else{
                System.out.println(opr);
            }
        }
    }
}
