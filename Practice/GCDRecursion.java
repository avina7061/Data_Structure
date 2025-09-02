package Data_Structure.Practice;

public class GCDRecursion {
    public static int GCD(int n1,int n2 ){
        if(n1<0||n2<0){
            return -1;
        }
        if(n2==0){
            return n1;
        }
        return GCD(n2,n1%n2);
    }
    public static void main(String[] args) {
        System.out.println(GCD(18,48));
    }
}//IMPORTANT
