import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 65;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((char)s);
                s++;
            }
            System.out.println();
        }
    }
}