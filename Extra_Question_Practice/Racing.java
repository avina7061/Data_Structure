package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class Racing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int d[] = new int[n];
            for(int i=0; i<n; i++){
                d[i]= sc.nextInt();
            }
            int ansL[] = new int[n];
            int ansR[] = new int[n];
            int j=0;
            int xl=0;
            int xr=0;
            boolean b =false;
            while(j<n){
                int l= sc.nextInt();
                int r= sc.nextInt();
                xr+=1;
                xl = Math.min(xr,l);
                if(xl==xr){
                    b=true;
                    break;
                }
                xr=Math.min(xr,r);
                ansL[j]=xl;
                ansR[j]=xr;
                j++;
            }
            if(b){
                System.out.println(-1);
                continue;
            }
            else{
                System.out.println("No");
            }
        }
    }
}
