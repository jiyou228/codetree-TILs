import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();
        int len = str.length();

        int ch = 0;

        for(int i = 0; i < len; i++){
            if(arr[i] == 'e'){
                ch = i;
                break;
            }
        }

        //System.out.println(ch);

        str = str.substring(0, ch) + str.substring(ch+1, len);

        //str = String.valueOf(arr);

        System.out.print(str);
    }
}