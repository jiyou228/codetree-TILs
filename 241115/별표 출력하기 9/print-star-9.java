import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  n = sc. nextInt();

        for(int j = 0; j < n; j++){
            for (int a = n-j-1; a > 0; a--){
                System.out.print("  ");
            }
            for (int i = 0; i < 2*j+1; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}