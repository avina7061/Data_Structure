package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class ExpensiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();

            long lastInd=0;
            for(int i=n.length()-1; i>=0; i--){
                if(n.charAt(i)!='0'){
                    lastInd=i;
                    break;

                }
            }
            int count=0;
            for(int i=0; i<lastInd; i++){
                if(n.charAt(i)!='0'){
                    count++;
                }
            }
            System.out.println(count+(n.length()-1-lastInd));
        }
    }
}
