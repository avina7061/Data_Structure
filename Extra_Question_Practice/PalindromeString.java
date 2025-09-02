package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int pairCnt=0;
            int num0Pairs=0;
            int num1Pairs=0;
            for(int i=0; i<n/2; i++){
                if(s.charAt(i)==s.charAt(n-i-1)){
                    pairCnt++;
                    if(s.charAt(i)=='0'){
                        num0Pairs++;
                    }
                    else{
                        num1Pairs++;
                    }
                }
            }
            if(Math.abs(pairCnt-k)%2!=0){
                System.out.println("No");
                continue;
            }
            else if(pairCnt==k){
                System.out.println("Yes ");
                continue;
            }
            if(k<pairCnt){
                if((pairCnt-k)<=Math.min(2*num1Pairs,2*num0Pairs)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }

            }
            else{
                int x = (n-(pairCnt*2))/2;
              if(k-pairCnt<=x){
                  System.out.println("Yes");
              }
              else{
                  System.out.println("No");
              }
            }
        }
    }
}
