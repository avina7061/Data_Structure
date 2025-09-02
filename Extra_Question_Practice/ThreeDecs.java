package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class ThreeDecs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a+b+c)%3!=0){
                System.out.println("No");
                continue;
            }
            else{

                int x = (a+b+c)/3;
               int val = c-x;
               if(b>x){
                   System.out.println("No");
                   continue;
               }
               else{
                   int num = x-b;
                   val-=num;
               }
               if(a+val!=x){
                   System.out.println("No");
               }
               else{
                   System.out.println("Yes");
               }
            }
        }
    }
}
