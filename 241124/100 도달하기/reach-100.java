import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[30];

        for(int i = 2; i < 30; i++){
            arr[0] = 1;
            arr[1] = n;

            arr[i] = arr[i-1]+arr[i-2];

            //System.out.print(arr[0] + " " + arr[1]+ " " );
            //System.out.print(arr[i] + " ");

            if(arr[i] >= 100){
                break;
            }
        }
        for(int j = 0; j < 30; j++){
            if(arr[j] != 0){
                System.out.print(arr[j] + " ");
            }
            
        }
    }
}