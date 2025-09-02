package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class MakeItPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(2*n-3);
            for(int i=2; i<=n; i++){
                System.out.println(i+" "+1+" "+i);
            }
            for(int i=1; i<n-1; i++){
                System.out.println(i+" "+(i+1)+" "+n);
            }
        }
    }
}
