import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int[] arr = new int[10];
        arr[0] = a1;
        arr[1] = a2;

        for(int i = 2; i < 10; i++){
            arr[i] = arr[i-1] + (2 * arr[i-2]);
        }
        for(int j = 0; j < 10; j++){
            System.out.print(arr[j] + " ");
        }
    }
}