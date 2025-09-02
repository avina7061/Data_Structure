package Data_Structure.Extra_Question_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoolPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Set<Integer> list = new HashSet<>();
            Set<Integer> temp = new HashSet<>();

            list.add(arr[0]);
            int cnt = 1;

            for(int i = 1; i < n; i++){
                temp.add(arr[i]);
                if(list.contains(arr[i])){
                    list.remove(arr[i]);
                }
                if(list.isEmpty()){
                    list = new HashSet<>(temp);
                    temp.clear();
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
