import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int temp = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            arr[temp] = num;
            temp++;
        }
        for(int j = temp - 1; j >= 0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}