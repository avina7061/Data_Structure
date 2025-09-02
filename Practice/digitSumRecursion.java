package Data_Structure.Practice;

public class digitSumRecursion {
    public static int recurr(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + recurr(num / 10);
        }
    }

    public static void main(String[] args) {
        int result = recurr(255);
        System.out.println("The sum of the digits is: " + result);
    }
}
