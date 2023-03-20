import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        Long left = Long.valueOf(0);
        Long right = n;

        while (left <= right) {
            Long mid = (left + right) / 2;
            if (Math.pow(mid, 2) < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(left);
    }
}
