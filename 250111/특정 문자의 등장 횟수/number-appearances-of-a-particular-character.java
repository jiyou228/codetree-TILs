import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cnt_ee = 0;
        int cnt_eb = 0;

        int len = str.length();

        for(int i = 0; i < len - 1; i++){
            if(str.substring(i, i + 2).equals("ee")){
                cnt_ee++;
            } 
            if(str.substring(i, i + 2).equals("eb")){
                cnt_eb++;
            } 
            
        }

        System.out.print(cnt_ee + " " + cnt_eb);
    }
}