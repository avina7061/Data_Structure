package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
import java.util.Stack;
public class TheFirstSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Stack<Integer>st = new Stack<>();
            for(int i=0; i<n;i++){
                st.push(sc.nextInt());
            }
            if(st.size()==1){
                System.out.println(st.peek());
            }
            else{
                 while(st.size()!=1){
                     int x = st.pop();
                     int y= st.pop();
                     int ans =(x+y)-1;
                     st.push(ans);
                 }
                System.out.println(st.peek());
            }
        }
    }
}
