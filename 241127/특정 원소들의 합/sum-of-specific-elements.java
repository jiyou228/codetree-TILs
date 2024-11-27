import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        
        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int j = 0; j<1;j++ ){
            for(int i = 0; i < 4; i++){
                sum += arr[i][j];
            }
        }
         for(int j = 1; j<2; j++){
            for(int i = 1; i < 4; i++){
           
                sum += arr[i][j];
            }
        }
        for(int j = 2; j < 3; j++){
            for(int i = 2; i < 4; i++){
            
                sum += arr[i][j];
            }
        }
        for(int j = 3; j < 4; j++){
            for(int i = 3; i < 4; i++){
            
                sum += arr[i][j];
            }
        }
        
        System.out.println(sum);
    }
}