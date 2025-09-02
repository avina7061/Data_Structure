package Data_Structure.Extra_Question_Practice;
//its a wrong code does not satisfy all case
import java.util.Scanner;

public class SkibidusAndRizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if(Math.abs(m-n)>k||Math.max(n,m)<k){
                System.out.println(-1);
            }
            else{

                int x=n;
                int y=m;
                if(x>y){
                    while(n>0||m>0){

                        if(n>0){
                            for(int i=0;n>0&&i<k; i++){
                                sb.append('0');

                                n--;
                            }

                        }

                        if(m>0){
                            for(int j=0; m>0&&j<k; j++){
                                sb.append('1');

                                m--;
                            }

                        }

                    }
                }
                else{
                    while(n>0||m>0){
                        if(m>0){
                            for(int j=0; m>0&&j<k; j++){
                                sb.append('1');
                                m--;
                            }

                        }
                        if(n>0){
                            for(int i=0;n>0&&i<k; i++){
                                sb.append('0');
                                n--;
                            }

                        }

                    }
                }
            }

            System.out.println(sb);
        }

    }
}
