import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        int save = -1;

        int len = str.length();

        for(int i = 0; i < len; i++){
            if(str.charAt(i) == ch){
                save = i;
                break;
            }
            
            
        }

        if(save != -1){
            System.out.print(save);
        }else{
            System.out.print("No");
        }
    }
}