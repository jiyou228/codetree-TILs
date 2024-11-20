import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 65;

        for(int i = 0; i < n; i++){
            
                for(int k = 0; k < i; k++){
                    System.out.print("  ");
                }
                for(int k = 0; k < n-i; k++){
                    System.out.print((char)s+" ");
                    s++;
                    if(s == 91){
                        s = 65;
                    }
                }
            
            System.out.println();
        }

    }
}