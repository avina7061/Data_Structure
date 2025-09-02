package Data_Structure.Practice;

public class star2 {
    public static void main(String[] args) {
        int l =0;
        int p=1;
        for(int i=0; i<5; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int k =1; k<=2*i+1; k++){
                if(k+l<=2*i+1) {
                    System.out.print(k + l+" ");
                }
                else{
                    System.out.print(k + l-p+" ");
                }
            }
            System.out.println("");
            l++;
            p++;

        }
    }
}
