import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0; int min = 0;
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        if(len1 > len2 && len1 > len3){
            max = len1;
            if(len2 > len3){
                min = len3;
            }else{
                min = len2;
            }
        }else if(len1 > len2 && len3 > len1){
            max = len3;
            min = len2;
        }else if(len2 > len1 && len2 > len3){
            max = len2;
            if(len1 > len3){
                min = len3;
            }else{
                min = len1;
            }
        }else if(len2 > len1 && len3 > len2){
            max = len3;
            min = len1;
        }else if(len3 > len1 && len3 > len2){
            max = len3;
            if(len1 > len2){
                min = len2;
            }else{
                min = len1;
            }
        }else if(len3 > len1 && len2 > len3){
            max = len2;
            min = len1;
        }

        System.out.print(max - min);
    }
}