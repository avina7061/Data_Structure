package Data_Structure.Extra_Question_Practice;
//wrong
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k=sc.nextInt();
            String s = sc.next();
            int cnt0=0;
            int cnt1=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    cnt1++;
                }
                else{
                    cnt0++;
                }
            }
            int cnt0pair=cnt0/2;
            int cnt1pair=cnt1/2;

            if(k%2==0){
                if(cnt0pair==cnt1pair||Math.abs(cnt0pair-cnt1pair)==k){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                if(cnt0pair==cnt1pair){
                    System.out.println("No");
                    continue;
                }
                int val =Math.abs(cnt0pair-cnt1pair);
                int min =Math.min(cnt1pair,cnt0pair);
                if(val==k){
                    System.out.println("Yes");
                    continue;
                }

            }
        }
    }
}
