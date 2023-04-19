import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;

    /**
     * 에라토스테네스의 체
     *
     * k=2부터 sqrt(N) 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들 제외
     */
    public static void makePrime(int N) {
        prime = new boolean[N + 1];

        if (N < 2) return;

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j <prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 1) return false;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 내가 푼 방법 - O(n * (n^1/2))
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) System.out.println(i);
        }

        /**
         * [에라토스테네스의 체 이용] - O(Nlog(logN))
         * 
         * makePrime(n);
         *
         * for (int i = 0; i < prime.length; i++) {
         *     if (prime[i] == false) {
         *         System.out.println(i);
         *     }
         * }
         */
    }
}
