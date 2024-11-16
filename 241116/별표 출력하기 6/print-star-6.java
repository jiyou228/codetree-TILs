import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int k = 0; k < n; k++){
            for(int j = 0; j < k; j++){
                System.out.print("  ");
            }
            for(int i = (2*n)-(2*k)-1; i > 0; i--){
                System.out.print("* ");
            }

            for(int j = n-k-2; j > 2; j--){
                System.out.print("  ");
            }
            for(int i = 3 + (2*k); i < 0; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int k = 0; k < n-1; k++){
            for(int j = n-k-2; j > 0; j--){
                System.out.print("  ");
            }
            for(int i = 0; i < 3 + (2*k); i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}