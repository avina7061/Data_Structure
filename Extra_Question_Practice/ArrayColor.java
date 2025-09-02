package Data_Structure.Extra_Question_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n];

            ArrayList<Long>dup = new ArrayList<>();
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
                dup.add(arr[i]);
            }
            Collections.sort(dup);
            HashSet<Long> set = new HashSet<>();
            for(int i=0; i<k; i++){
                set.add(dup.get(n-1-i));
            }
            if(k==1){
                long max=0;
                max=Math.max((arr[0]+arr[n-1]),max);
                for(int i=1; i<n-1; i++){
                    max=Math.max(max,Math.max(arr[0],arr[n-1])+arr[i]);
                }
                System.out.println(max);
            }
            else{
                    long sum=0;
                    for(int i=dup.size()-1; i>=dup.size()-1-k; i--){
                        sum+=dup.get(i);
                    }
                    System.out.println(sum);
                }
            }
        }
    }
