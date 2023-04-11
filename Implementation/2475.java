import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            sum += Math.pow(x, 2);
        }

        System.out.println((int)(sum % 10));
    }
}
