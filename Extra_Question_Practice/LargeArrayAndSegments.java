package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;
// we didnt solve this problem
public class LargeArrayAndSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      while(t-->0){
          int n = sc.nextInt();
          int k = sc.nextInt();
          long x = sc.nextLong();
          long arr[]= new long[n];
          for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
          }
          int z= n*k;
          long b [] = new long[z];
          b[0]=arr[0];
          for (int i = 1; i < z; i++) {
              b[i] = b[i - 1] + arr[i % n];
          }

          int l =0;

          int left=0;
           int val=0;
          int right= b.length-1;
          while(left<=right){
              int mid = (left+right)/2;

              if(b[mid]>=x){
                  val++;
                  long p = b[mid];
                  while(p>=x){
                      l++;
                   p= p-b[left];
                   left++;
                  }
              }
              else {
                  left=mid+1;
              }
          }

          System.out.println(l);
          System.out.println(val);
      }
    }
}
