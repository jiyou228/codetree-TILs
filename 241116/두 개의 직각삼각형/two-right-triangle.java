import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int k = 0; k < n; k++){
            for(int i = n-k; i > 0; i--){
                System.out.print("*");
            }
            
            for(int j = 0; j < k; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < k; j++){
                System.out.print(" ");
            }

            for(int i = n-k; i > 0; i--){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}