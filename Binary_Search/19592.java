import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int testCase, n, x, y, v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            double min = x;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n - 1; i++) {
                v = Integer.parseInt(st.nextToken());
                min = Math.min(1.0 * x / v, min);
            }
            v = Integer.parseInt(st.nextToken());

            if (min > 1.0 * x / v) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            int right = y;

            while (left <= right) {
                int mid = (left + right)  / 2;
                double booster = 1 + 1.0 * (x - mid) / v;
                if (booster >= min) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left > y) System.out.println(-1);
            else System.out.println(left);
        }
    }
}
