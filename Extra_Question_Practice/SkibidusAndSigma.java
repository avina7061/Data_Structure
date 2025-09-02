package Data_Structure.Extra_Question_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SkibidusAndSigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    temp.add(sc.nextInt());
                }
                list.add(temp);
            }

            list.sort((a, b) -> {
                int sumA = a.stream().mapToInt(Integer::intValue).sum();
                int sumB = b.stream().mapToInt(Integer::intValue).sum();
                return Integer.compare(sumB, sumA); // descending
            });
long ans=0;
long sum=0;

            for (ArrayList<Integer> row : list) {
                for(int num: row){
                    sum+=num;
                    ans+=sum;
                }
            }
            System.out.println(ans);
        }
    }
}
