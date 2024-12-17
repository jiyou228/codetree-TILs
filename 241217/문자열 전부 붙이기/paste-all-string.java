import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            System.out.print(str[i]);
        }
    }
}