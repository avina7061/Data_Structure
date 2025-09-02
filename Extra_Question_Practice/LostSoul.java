package Data_Structure.Extra_Question_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class LastSoul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int i = n - 1;
            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();

            while(i>=-1){
                if(i==-1)break;
                if(a[i]==b[i])break;

                if(i%2==0){
                    if(setB.contains(a[i]))break;
                    if(setA.contains(b[i]))break;

                    if(i+1<n){
                        setA.add(a[i+1]);
                        setB.add(b[i+1]);
                    }
                    if(setA.contains(a[i]))break;
                    if(setB.contains(b[i]))break;
                }
                else{
                    if(setA.contains(a[i]))break;
                    if(setB.contains(b[i]))break;

                    if(i+1<n){
                        setB.add(a[i+1]);
                        setA.add(b[i+1]);
                    }
                    if(setB.contains(a[i]))break;
                    if(setA.contains(b[i]))break;
                }
                i--;


            }



            System.out.println(i + 1);
        }
    }
}