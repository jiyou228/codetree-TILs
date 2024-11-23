import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] new_arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                new_arr[i] = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(new_arr[i] != 0){
                System.out.print(new_arr[i] + " ");
            }
            
        }
    }
}