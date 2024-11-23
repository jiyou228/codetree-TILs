import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];

        int a = sc.nextInt();
        int b = sc.nextInt();

        arr[0] = a;
        arr[1] = b;

        for(int i = 2; i < 11; i++){
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i] >= 10){
                arr[i] = arr[i] % 10;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i]+" ");
        }

        

    }
}