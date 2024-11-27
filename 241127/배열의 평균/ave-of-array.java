import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int sum = 0;
            
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        for(int i = 0; i < 2; i++){
            int w_sum = 0;
            for(int j = 0; j < 4; j++){
                w_sum += arr[i][j];    
            }
            float w_avg = (float)w_sum / 4;
            System.out.printf("%.1f ", w_avg);
        }
        System.out.println();

        for(int j = 0; j < 4; j++){
            int l_sum = 0;
            for(int i = 0; i < 2; i++){
                l_sum += arr[i][j];    
            }
            float l_avg = (float)l_sum / 2;
            System.out.printf("%.1f ", l_avg);
        }   
        System.out.println();
        float avg = (float)sum / 8;
        System.out.printf("%.1f ", avg);
    }
}