package Data_Structure.Extra_Question_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SkibidusAndFannumTaxHardVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            int arrn[] = new int[n];
            Integer arrm[] = new Integer[m];
            for(int i=0; i<n; i++){
                arrn[i]= sc.nextInt();
            }
            for(int i=0; i<m; i++){
                arrm[i]=sc.nextInt();
            }

            if(n==1){
                System.out.println("Yes");
                continue;
            }
            Arrays.sort(arrm, Collections.reverseOrder());
            int num1=arrn[0];
            for(int i=0; i<arrm.length; i++){

                int val = arrm[i]-num1;

                 if(val<arrn[0]){
                    arrn[0]=val;
                }
            }

            for(int i=1; i<arrn.length; i++){
                    if(arrn[i]<arrn[i-1]){
                        int num2=arrn[i];
                        for(int j=0; j<arrm.length; j++){
                            int val = arrm[j]-num2;

                            if(val>=arrn[i-1]){
                                arrn[i]=val;
                            }
                        }
                    }
                    else{
                        int num3=arrn[i];
                        for(int j=0; j<arrm.length; j++){
                            int val = arrm[j]-num3;

                            if(val>=arrn[i-1]&&val<=arrn[i]){
                                arrn[i]=val;
                            }
                        }
                    }

            }
            int num=-1;
            boolean b =true;
            for(int i=0; i<arrn.length; i++){

                if(num<=arrn[i]){
                    num=arrn[i];
                }
                else{
                    b = false;
                    break;
                }
            }
            System.out.println((b)? "Yes" : "No");
        }
    }
}
