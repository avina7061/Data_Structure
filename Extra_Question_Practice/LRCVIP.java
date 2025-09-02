package Data_Structure.Extra_Question_Practice;
//wrong
import java.util.Scanner;


public class LRCVIP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            boolean b = false;
            for(int i=1;i<n; i++){
                if(arr[i]!=arr[i-1]){
                    b=true;
                    break;
                }
            }
            if(!b){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
            for(int i=0; i<n-1; i++){
                System.out.print(1+" ");
            }
            System.out.print(2);
            System.out.println();
        }


    }
}
