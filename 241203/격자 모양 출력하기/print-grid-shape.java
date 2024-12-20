import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = r*c;
        }

        for(int i = 1; i < n+1; i++){
            for(int j =1; j < n+1; j++){
                if(arr[i][j] == 0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}