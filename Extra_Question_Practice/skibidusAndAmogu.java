package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class skibidusAndAmogu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String w = sc.next();
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<w.length()-2; i++){
                sb.append(w.charAt(i));
            }
            sb.append('i');

            System.out.println(sb.toString());
        }
    }
}
