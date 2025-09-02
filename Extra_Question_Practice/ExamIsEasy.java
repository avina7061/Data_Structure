package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class ExamIsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int  n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int l=-1;
            int m =-1;
            int max2=Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                int cnt=0;
                int val=arr[i];
                int max=max2;
                for(int j=i+1; j<n; j++){
                    if(arr[j]<val){
                        cnt++;
                    }
                    else if(arr[j]>val){
                        cnt--;
                    }
                    if(max<cnt && cnt>=0){
                        l=i;
                        m=j;
                        max=Math.max(max,cnt);
                    }
                }
                max2=Math.max(max2,max);
            }
            if(l==-1)l=0;
            if(m==-1)m=0;
            l=l+1;
            m=m+1;
            System.out.println(l+" "+m);
        }
    }
}
