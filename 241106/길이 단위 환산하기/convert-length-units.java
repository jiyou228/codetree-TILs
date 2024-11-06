import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        double ft = 30.48;

        double result = n * ft;

        System.out.printf("%.1f", result);
    }
}