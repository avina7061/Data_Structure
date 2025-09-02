package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class SimpleRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String x = sc.next();
            int k = sc.nextInt();
            if(x.length()==1&&k==1&&Integer.parseInt(x)==1){
                System.out.println("No");
                continue;
            }
            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < k; i++) {
                repeated.append(x);
            }
            String finalStr = repeated.toString();
            int newLength = finalStr.length();
            if (newLength > 2 && isPowerOfTwo(newLength)) {

                System.out.println("No");
            }
            else{
                long val = Long.parseLong(finalStr);

                boolean b=true;
                for(int i=2; i<=Math.sqrt(val); i++){
                    if(val%i==0){
                        System.out.println("No");
                         b = false;
                         break;
                    }
                }
                if(b) System.out.println("Yes");
            }

        }

    }
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
