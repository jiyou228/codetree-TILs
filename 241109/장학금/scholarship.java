import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mid_score = sc.nextInt();
        int fin_score = sc.nextInt();

        if(mid_score >= 90){
            if(fin_score >= 95){
                System.out.print(100000);
            }else if(fin_score >= 90){
                System.out.print(50000);
            }else{
                System.out.print(0);
            }
        }else{
            System.out.print(0);
        }
    }
}