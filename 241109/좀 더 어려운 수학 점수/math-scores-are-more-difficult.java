import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        if(a_math > b_math){
            System.out.print("A");
        }else if(a_math == b_math && a_eng > b_eng){
            System.out.print("A");
        }else if(a_math == b_math && b_eng > a_eng){
            System.out.print("B");
        }else{
            System.out.print("B");
        }
    }
}