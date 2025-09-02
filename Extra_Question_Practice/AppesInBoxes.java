package Data_Structure.Extra_Question_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AppesInBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[]= new long [n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            long sum=0;
            Arrays.sort(arr);
            long min=arr[0];
            long max = arr[n-1];
            for(int i=1; i<n-1; i++){
                sum+=arr[i];
            }
            boolean tom= true;
            boolean jerry=false;
            if(max-min>k){
                max=max-1;
                if(max-min>k){
                    System.out.println("Jerry");
                    continue;
                }
                jerry=true;
                tom =false;

            }
            if(sum%2==0){
                tom=true;
                jerry=false;
                long val =min+max;
                        if(tom){

                            if(val%2==0){
                                System.out.println("Jerry");
                            }
                            else{
                                System.out.println("Tom");
                            }
                        }
                        else{
                            if(val%2==0){
                                System.out.println("Tom");
                            }
                            else{
                                System.out.println("Jerry");
                            }
                        }
            }
            else{
                tom=false;
                jerry=true;
                long val = max+min;
                if(tom){

                    if(val%2==0){
                        System.out.println("Tom");
                    }
                    else{
                        System.out.println("Jerry");
                    }
                }
                else{
                    if(val%2==0){
                        System.out.println("Jerry");
                    }
                    else{
                        System.out.println("Tom");
                    }
                }

            }
        }
    }
}
