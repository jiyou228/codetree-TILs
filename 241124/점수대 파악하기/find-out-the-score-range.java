import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];
        int[] Countarr = new int[11];

        for(int i = 0; i < 101; i++){
            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                break;
            }
        }
        for(int i = 0; i < 101; i++){
            if(arr[i] < 10){
                continue;
            }
            arr[i] = (arr[i] / 10);
            Countarr[arr[i]]++;
        }
        for(int i = 10; i > 0; i--){
            System.out.println(i*10 + " - " + Countarr[i]);
        }
    }
}