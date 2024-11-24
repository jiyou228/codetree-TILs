import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[12];
        int cnt = 0;

        int n = sc.nextInt();

        for(int i = 0; i < 12; i++){
            // arr[0] = n;
            arr[i] = n * (i+1);
            System.out.print(arr[i] + " ");

            if(arr[i] % 5 == 0){
                cnt++;
                if(cnt == 2){
                    break;
                }
                
            }
            // if(arr[i] != 0){
                
            // }
            
        }
        // for(int j = 0; j < 12; j++){
            
        // }
    }
}