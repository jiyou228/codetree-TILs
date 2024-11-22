import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int odd_sum = 0;
        int sum = 0;

        for(int i = 0; i <10; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < 10; j+=2){
            odd_sum += arr[j]; //홀수
        }
        for(int j = 1; j < 10; j+=2){
            sum += arr[j]; //짝수
        }

        if(odd_sum >= sum){
            System.out.print(odd_sum - sum);
        }else{
            System.out.print(sum - odd_sum);
        }
        
    }
}