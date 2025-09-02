package Data_Structure.Practice;

public class DecimalToBinary {
    public static String DTB(int n){
        if(n==0){
            return "";
        }
        return DTB(n/2)+n%2;
    }
    public static void main(String[] args) {
        System.out.println(DTB(15));
    }
}
