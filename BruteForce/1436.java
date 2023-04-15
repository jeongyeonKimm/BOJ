import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;
        int number = 666;

        while (cnt != n) {
            number++;
            String s = String.valueOf(number);
            if (s.contains("666")) {
                cnt++;
            }
        }

        System.out.println(number);
    }
}
