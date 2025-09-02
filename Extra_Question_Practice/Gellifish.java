package Data_Structure.Extra_Question_Practice;

import java.util.Scanner;

public class Gellifish {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long min=Long.MAX_VALUE;
            if(a<min){
                min=a;
            }
            if(b<min){
                min=b;
            }
            if(c<min){
                min=c;
            }
            if(d<min){
                min=d;
            }
            if((min==a||min==c)&&(min==b||min==d)){
                System.out.println("Gellyfish");
                continue;
            }
            if(min==a||min==c){
                System.out.println("Flower");
                continue;
            }
            else{
                System.out.println("Gellyfish");
                continue;
            }

        }
    }
}
