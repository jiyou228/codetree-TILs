public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        double mi = 160934;

        double result1 = ft * 9.2;
        double result2 = mi * 1.3;

        System.out.printf("9.2ft = %.1fcm", result1);
        System.out.print("/n");
        System.out.printf("1.3mi = %.1fcm", result2);
    }
}