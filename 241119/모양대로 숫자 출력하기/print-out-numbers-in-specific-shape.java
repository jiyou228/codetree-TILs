import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            for(int j = n; j > i; j--){
                System.out.print(j-i+" ");
            }
            System.out.println();
        }
    }
}