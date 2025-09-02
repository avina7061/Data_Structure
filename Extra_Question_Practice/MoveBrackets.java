package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
import java.util.Stack;
public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int j=0;
        while(j<t){
            int n =sc.nextInt();
            sc.nextLine();
            String s =sc.nextLine();
            Stack<Character> st = new Stack<>();
            int count=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='('){
                    st.push('(');
                }
                else{
                    if(st.isEmpty()){
                        count++;
                    }
                    else{
                        st.pop();
                    }
                }

            }
            j++;
            count+=st.size();
            System.out.println(count/2);
        }
    }


}
