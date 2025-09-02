package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class DoubleEndedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String a = sc.next();
            String b = sc.next();
            int n = a.length()+b.length();
            int min=Integer.MIN_VALUE;
            for(int i=0; i<b.length(); i++){
                int cnt=0;
                for(int j=i+1; j<=b.length(); j++){
                    if(a.contains(b.substring(i,j))){
                        cnt++;
                    }
                    else{
                        break;
                    }
                    min=Math.max(min,cnt);
                }
            }
            System.out.println(n-(min*2));
        }
    }
}
