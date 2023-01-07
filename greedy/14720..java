import java.util.Scanner;

public class Greedy14720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int milk [] = new int[n];
        int cnt = 0;
        int next = 0;

        for (int i = 0; i < n; i++) {
            milk[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (milk[i] == 0 && next == 0) {
                cnt++;
                next = 1;
            }
            else if (milk[i] == 1 && next == 1) {
                cnt++;
                next = 2;
            }
            else if (milk[i] == 2 && next == 2) {
                cnt++;
                next = 0;
            }
        }

        System.out.println(cnt);
    }
}
