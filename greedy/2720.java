import java.util.Scanner;

public class Greedy2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int coinTypes [] = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int balance = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < coinTypes.length; j++) {
                int coin = coinTypes[j];
                sb.append(balance / coin).append(' ');
                balance %= coin;
            }
            System.out.println(sb);
        }
    }
}
