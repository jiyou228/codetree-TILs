import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int len = str.length();
        int num = 0;

        for(int i = 0; i < len; i++){
            if(str.charAt(i) == c){
                num++;
            }
        }

        System.out.print(num);
    }
}