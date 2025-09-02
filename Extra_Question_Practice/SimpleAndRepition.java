package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class SimpleAndRepition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         int newNum=0;
        while(t-->0){
            String x = sc.next();
            int k = sc.nextInt();

            int num = x.length()*k;
            if(num>=4&&num%2==0){
                System.out.println("No");
            }
            else{
                boolean b = true;
                StringBuilder sb = new StringBuilder(x);
               for(int i=0; i<k-1; i++){
                   sb.append(x);
               }
               String s =sb.toString();
               int val = Integer.parseInt(sb.toString());
               newNum=val;
               for(int i=2;i<=Math.sqrt(val); i++){
                   if(val%i==0){
                       b=false;
                       break;
                   }
               }
               if(newNum==1){
                   System.out.println("No");
               }
              else if(b){
                   System.out.println("Yes");
               }
               else{
                   System.out.println("No");
               }
            }
        }
    }
}
