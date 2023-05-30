import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] dp = new int[11][11];
    public static int combination(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];
        else if (r == 0 || r == n) return dp[n][r] = 1;
        else return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(combination(n, k));
    }
}
