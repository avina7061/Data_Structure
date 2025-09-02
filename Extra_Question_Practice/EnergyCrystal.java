package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class EnergyCrystal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long x = sc.nextLong();
            if(x==1){
                System.out.println(3);
                continue;
            }
            int a =0;
            int b= 0;
            while(a<x){
                a=a*2+1;
                b+=2;
            }
            b+=1;
            System.out.println(b);
        }
    }
}
