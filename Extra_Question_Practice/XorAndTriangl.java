package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class XorAndTriangl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int x = sc.nextInt();
            boolean b =true;
            for(int i=x-1; i>=0;i--){
                int y= i;
                int z = x^y;
                if(x-y<z&&z<x+y){
                    System.out.println(y);
                    b= false;
                    break;
                }
            }
            if(b)System.out.println(-1);
        }
    }
}
