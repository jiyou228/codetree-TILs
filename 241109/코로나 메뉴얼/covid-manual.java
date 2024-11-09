import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a_check = sc.next().charAt(0);
        int a_temp = sc.nextInt();
        char b_check = sc.next().charAt(0);
        int b_temp = sc.nextInt();
        char c_check = sc.next().charAt(0);
        int c_temp = sc.nextInt();

        char a_result;
        char b_result;
        char c_result;

        
        if(a_check == 'Y' && a_temp >= 37){
            a_result = 'A';
        }else if(a_check == 'N' && a_temp >= 37){
            a_result = 'B';
        }else if(a_check == 'Y' && a_temp < 37){
            a_result = 'C';
        }else{
            a_result = 'D';
        }

        if(b_check == 'Y' && b_temp >= 37){
            b_result = 'A';
        }else if(b_check == 'N' && b_temp >= 37){
            b_result = 'B';
        }else if(b_check == 'Y' && b_temp < 37){
            b_result = 'C';
        }else{
            b_result = 'D';
        }

        if(c_check == 'Y' && c_temp >= 37){
            c_result = 'A';
        }else if(c_check == 'N' && c_temp >= 37){
            c_result = 'B';
        }else if(c_check == 'Y' && c_temp < 37){
            c_result = 'C';
        }else{
            c_result = 'D';
        }

        int count_A = 0;

        if(a_result == 'A') count_A++;
        if(b_result == 'A') count_A++;
        if(c_result == 'A') count_A++;
            
        if(count_A >= 2){
            System.out.print("E");
        }else{
            System.out.print("N");
        }

    }
}