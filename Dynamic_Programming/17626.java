import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        /*
         * Bottom-Up 방식
         *
         * dp[i] 값을 i를 만드는데 쓰이는 제곱수의 개수(중복된 숫자 포함)
         * dp[i]는 i 보다 작은 모든 제곱수 j 중 최소값이 되는 dp[i - j * j]에 + 1 한 값
         */
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = i;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = dp[min] + 1;
        }

        System.out.println(dp[n]);
    }
}
