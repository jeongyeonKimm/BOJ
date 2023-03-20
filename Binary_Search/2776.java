import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < testCases; t++) {
            int n = sc.nextInt();

            int[] numbers = new int[n];
            for (int i = 0; i  < n; i++) {
                numbers[i] = sc.nextInt();
            }
            Arrays.sort(numbers);

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int target = sc.nextInt();

                int left = 0;
                int right = n - 1;
                boolean find = false;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (numbers[mid] == target) {
                        find = true;
                        break;
                    } else if (numbers[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                if (find) sb.append("1\n");
                else sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}
