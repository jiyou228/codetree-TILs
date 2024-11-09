import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_age = sc.nextInt();
        char first_gender = sc.next().charAt(0);
        int second_age = sc.nextInt(); 
        char second_gender = sc.next().charAt(0);

        if ((first_age >= 19 && first_gender == 'M') || (second_age >= 19 && second_gender == 'M')){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
}