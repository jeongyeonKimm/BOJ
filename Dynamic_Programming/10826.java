import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // n의 최대가 10000이기 때문에 int, long 으로 커버 불가 -> 더 큰 자료형 BigInteger 사용
        BigInteger[] fib = new BigInteger[n + 2];   // 크기를 n + 2로 하는 이유는 n이 0일 때 fib[0] = 0, fib[1] = 1 값을 넣어둘 수 있게 하기 위해서
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 2].add(fib[i - 1]);
        }

        bw.write(String.valueOf(fib[n]));

        bw.flush();
        br.close();
        bw.close();
    }
}
