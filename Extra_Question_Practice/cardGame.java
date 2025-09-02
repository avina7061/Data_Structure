package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class cardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt=0;
            int cntA=0;
            int cntB=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='A'){
                    cntA++;
                }
                else{
                    cntB++;
                }
            }
            if(n==2&&cntA==cntB&&s.charAt(0)=='A'){
                System.out.println("Alice");
                continue;
            }
            else if(n==2&&cntA==cntB&&s.charAt(0)=='B'){
                System.out.println("Bob");
                continue;
            }
            if(s.charAt(n-1)=='B'){
                for(int i=0; i<n;i++){
                    if(s.charAt(i)=='B'){
                        cnt++;
                    }
                }
                if(cnt>1){
                    System.out.println("Bob");
                    continue;
                }
                else{
                    System.out.println("Alice");
                    continue;
                }
            }
            else{
                  if(s.charAt(0)=='B'&&s.charAt(n-2)=='B'){
                      System.out.println("Bob");
                      continue;
                  }
                  else{
                      System.out.println("Alice");
                  }

            }
        }
    }
}
