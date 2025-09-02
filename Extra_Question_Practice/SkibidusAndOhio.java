package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class SkibidusAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                sb.append(s.charAt(i));
            }
          boolean b=true;
            while(b&&sb.length()!=1){
                for(int i=1; i<sb.length(); i++){
                    if(sb.charAt(i)!='0'&&sb.charAt(i)==sb.charAt(i-1)){
                        sb.deleteCharAt(i);
                        if(i>1){
                            sb.setCharAt(i-1,sb.charAt(i-2));
                        }
                        else if(sb.length()>i){
                            sb.setCharAt(i-1,sb.charAt(i));
                        }
                        b=true;
                        break;
                    }
                    else{
                        b= false;
                    }
                }
            }
            System.out.println(sb.length());

        }
    }
}
