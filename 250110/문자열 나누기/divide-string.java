import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자열 정의
        String[] str = new String[10];
        String strAll = "";
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        //문자열 붙이기
        for(int i = 0; i < n; i++){
            strAll += str[i];
        }

        int len = strAll.length();

        for(int i = 0; i < len; i++){
            System.out.print(strAll.charAt(i));
            if((i+1)%5 == 0)
                System.out.println();
        }
    }
}