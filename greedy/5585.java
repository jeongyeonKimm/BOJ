import java.util.Scanner;

public class Greedy5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int balance = 1000 - money;
        int coinTypes [] = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        for (int i = 0; i < coinTypes.length; i++) {
            int coin = coinTypes[i];
            cnt += (balance / coin);
            balance %= coin;
        }

        System.out.println(cnt);
    }
}
