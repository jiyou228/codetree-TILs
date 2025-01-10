import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //String[] str1 = new String[100];     
    //String[] str2 = new String[100];
    int cnt = 0;
    String a = sc.next();
    String b = sc.next();

    String str1 = a + b;
    String str2 = b + a;

    int len = str1.length();
    
    for(int i = 0; i < len; i++){
        if (str1.charAt(i) == str2.charAt(i)){
            cnt++;
    }
    }

    if(cnt == len){
        System.out.print("true");
    }else{
        System.out.print("false");
    }
    
    
    
}
}