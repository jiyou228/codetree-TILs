import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        int cnt = 0;
        int num = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        
        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == c){
                cnt++;
                num += arr[i].length();
            }
        }

        float avg = (float)num / cnt;

        System.out.printf("%d %.2f", cnt, avg);
    }
}