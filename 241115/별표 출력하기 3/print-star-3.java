import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int k = 0; k < n; k++){
            for(int j = 0; j < k; j++){
                System.out.print("  ");
            }
            for (int i = 0; i < (2 * (n - k)) - 1; i++) {
                System.out.print("* ");
                
            }
            
            System.out.println();
        }
    }
}