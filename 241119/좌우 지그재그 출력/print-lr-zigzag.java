import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i % 2 == 0){
                    System.out.print(cnt+n+1-2*j +" ");
                    cnt++;
                }else{
                    System.out.print(cnt+ " ");
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}