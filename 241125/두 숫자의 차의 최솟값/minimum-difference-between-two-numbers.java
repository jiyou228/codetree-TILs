import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int minVal = 100;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = n-1;  j > 0; j--){
                if(arr[i+1] - arr[i] < minVal){
                minVal = arr[j] - arr[i];
            }
            }
        }
        System.out.print(minVal);
    }
}