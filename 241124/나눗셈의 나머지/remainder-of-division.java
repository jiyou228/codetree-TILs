import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[b];
        int sum = 0;

        while(a > 1){
            int num = a % b;
            countArr[num]++;
            a = a / b;
        }
        for(int i = 0; i < b; i++){
                sum += countArr[i] * countArr[i];
        }
        System.out.print(sum);
    }
}