package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class DrTc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s =sc.next();
            String temp=s;
            int count=0;
            for(int j=0; j<n; j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            int sum=0;
            int x=count;
            for(int i=0; i<n; i++){
                if(temp.charAt(i)=='1'){
                    x--;
                }
                else{
                    x++;
                }
                sum+=x;
                x=count;
                temp=s;
            }
            System.out.println(sum);
        }
    }
}
