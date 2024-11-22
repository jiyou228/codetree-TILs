import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum_1 = 0;
        float avg = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
            for(int j = 1; j < 10; j+=2){
                sum += arr[j];
            }

            for(int j = 2; j < 10; j+=3){
                sum_1 += arr[j];
                cnt++;
            }
            
        
        avg = (float) sum_1 / cnt;
        System.out.print(sum + " " + avg);

    }
}