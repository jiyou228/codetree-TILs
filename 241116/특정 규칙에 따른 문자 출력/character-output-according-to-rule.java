import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n-i-1; j > 0; j--){
                System.out.print("  ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("@ ");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++){
            for(int k = n-i; k > 0; k--){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}