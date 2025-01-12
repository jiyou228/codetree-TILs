import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] Arrstr = str.toCharArray();

        int len = str.length();
        Arrstr[1] = 'a';
        Arrstr[len - 2] = 'a';

        str = String.valueOf(Arrstr);

        System.out.print(str);
    }
}