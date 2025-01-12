import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] str_arr = str.toCharArray();
        int len = str.length();

        char ch01 = str_arr[0];
        char ch02 = str_arr[1];

        for(int i = 0; i < len; i++){
            if(str_arr[i] == ch01){
                str_arr[i] = ch02;
            }
            else if(str_arr[i] == ch02){
                str_arr[i] = ch01;
            }
        }

        str = String.valueOf(str_arr);

        System.out.print(str);
         
    }
}