package Data_Structure.Practice;

public class string {
    public static void main(String[] args) {
        String x = "aaaaaaasdf";
        String s = "asdf";
        int index = 0;
        for (int i = 0; i <= 5; i++) {
            if (x.contains(s)) {
                break;
                  } else {
                x = x.concat(x);
                index++;
            }
        }
        if (!x.contains(s)) {
            System.out.println("-1");
        } else {
            System.out.println(index);
        }
    }
}