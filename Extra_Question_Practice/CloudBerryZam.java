
package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class CloudBerryZam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            long x =3*n;
            long ans = (x*100)/150;
            System.out.println(ans);
        }
    }
}