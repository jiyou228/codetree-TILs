import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }
        char str = sc.next().charAt(0);
        int cnt=0;

        for(int i = 0; i < 10; i++){
            int len = 0;
            len = arr[i].length();
            if(arr[i].charAt(len-1) == str){
                System.out.println(arr[i]);
                cnt++;
                
            }
            
        }
        if(cnt == 0){
                    System.out.print("None");
        }
    }
}