package Data_Structure.Extra_Question_Practice;
//wrong ans
import java.util.Scanner;

public class LadyBug {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            char arr[] = a.toCharArray();
            char brr[] = b.toCharArray();
            boolean bt = false;
            for (int i = 0; i < n; i++) {

                if (arr[i] == '1') {
                    if (i == 0) {
                        if (brr[i + 1] == '0') {
                            brr[i + 1] = '1';
                            arr[i] = '0';
                        } else {
                            if (i + 2 < n && arr[i + 2] == '0') {
                                brr[i + 1] = '0';
                                arr[i + 2] = '1';
                                char temp = arr[i];
                                arr[i] = arr[i + 1];
                                arr[i + 1] = temp;
                                if (i + 3 < n && brr[i + 3] == '0') {
                                    arr[i + 2] = '0';
                                    brr[i + 3] = '1';
                                } else {
                                    bt = true;
                                    break;
                                }
                            } else {
                                bt = true;
                                break;

                            }
                        }
                    } else if (i == n - 1) {
                        if (brr[i - 1] == '0') {
                            arr[i] = '0';
                            brr[i - 1] = '1';
                        } else {
                            if (i - 2 >= 0 && arr[i - 2] == '0') {
                                brr[i - 1] = '0';
                                arr[i - 2] = '1';
                                char temp = arr[i];
                                arr[i] = arr[i - 1];
                                arr[i - 1] = temp;
                                if (i - 3 >= 0 && brr[i - 3] == '0') {
                                    arr[i - 2] = '0';
                                    brr[i - 3] = '1';
                                } else {
                                    bt = true;
                                    break;
                                }
                            } else {
                                bt = true;
                                break;
                            }
                        }

                    } else {
                        if (brr[i - 1] == '0') {
                            char temp = arr[i - 1];
                            arr[i] = brr[i - 1];
                            brr[i - 1] = temp;
                        } else if (brr[i + 1] == '0') {
                            char temp = arr[i + 1];
                            arr[i] = brr[i + 1];
                            brr[i + 1] = temp;
                        } else {
                            bt = true;
                            break;
                        }
                    }
                }

            }
            if (bt) {
                System.out.println("No");
            } else System.out.println("Yes");
        }
    }
}
