import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");
        int num = sc.nextInt();
        int front = sc.nextInt();
        int end = sc.nextInt();

        System.out.print("010-" + end + "-"+front);

    }
}