package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
public class OlympiadDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int tmp[]= new int[6];
            tmp[0]=3;
            tmp[1]=1;
            tmp[2]=2;
            tmp[3]=1;
            tmp[4]=0;
            tmp[5]=1;
            int ans =0;
            boolean bc= true;
            for(int i=0; i<arr.length; i++){
                ans++;
                if(arr[i]<tmp.length&&arr[i]!=4){
                    if(tmp[arr[i]]>0){
                        tmp[arr[i]]--;
                    }
                }
                boolean b= true;
                for(int j=0; j<tmp.length; j++){
                    if(tmp[j]>0){
                        b=false;
                        break;
                    }
                }
                if(b){
                    System.out.println(ans);
                    bc=false;
                    break;
                }
            }
            if(bc) System.out.println(0);

        }
    }
}
