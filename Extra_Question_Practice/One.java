package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<=n; i++){
                if(i<=k){
                    sb.append("1");
                }
                else{
                    sb.append("0");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
