import java.util.Scanner;

public class Greedy10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int buttonTypes [] = {300, 60, 10};

        if (t % 10 != 0) {
            System.out.println(-1);
        }
        else {
            for (int i = 0; i < buttonTypes.length; i++) {
                int button = buttonTypes[i];
                System.out.print(t / button + " ");
                t %= button;
            }
        }
    }
}
