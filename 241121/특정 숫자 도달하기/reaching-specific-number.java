import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;
        

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] <= 250){
                sum += arr[i];
                cnt++;
            }else if(arr[i] > 250){
                break;
            }
            
        }
            float avg = (float)sum/cnt;
            System.out.printf("%d %.1f", sum, avg);
    }
}