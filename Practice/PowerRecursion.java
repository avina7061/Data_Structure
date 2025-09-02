package Data_Structure.Practice;

public class PowerRecursion {
    public static int Power(int base, int exp){
        if(exp<0){
            return -1;
        }
        if(exp==0){
            return 1;
        }
        return base*Power( base,  exp-1);
    }
    public static void main(String[] args) {
        System.out.println(Power(3,4));
    }
}
