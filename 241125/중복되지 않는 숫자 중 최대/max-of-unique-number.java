import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] countArr = new int[1001];
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }
        
        for(int i = 0; i < n; i++){
            if(countArr[arr[i]] == 1 && arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        
        if(maxVal == Integer.MIN_VALUE){
            System.out.print(-1);
        }else{
            System.out.print(maxVal);
        }
    }
}