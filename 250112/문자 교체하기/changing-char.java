import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] str1_arr = str1.toCharArray();
        char[] str2_arr = str2.toCharArray();

        char ch0 = str1_arr[0];
        char ch1 = str1_arr[1];

        //System.out.println(ch0);
        //System.out.println(ch1);

        str2_arr[0] = ch0;
        str2_arr[1] = ch1;

        str2_arr = String.valueOf(str2_arr);

        System.out.print(str2_arr);

    }
}