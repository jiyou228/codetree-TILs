import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = n*n;

        // 3 3 1
        // 2 3 2
        // 1 3 3
        // 0 3 4
        // 0 2 5
        // 1 2 6
        // 2 2 7
        // 3 2 8

        for(int i = n-1; i >= 0; i--){
            if(i % 2 == 0){
                
                for(int j = n-1; j >= 0; j--){
                    arr[i][j] = num;
                    num--; 
                }
            }else{
                for(int j = 0; j < n; j++){
                    arr[i][j] = num;
                    num--; 
                }
            }
            
        }

        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}