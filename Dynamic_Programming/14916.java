import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        /**
         * 5로 나누어 떨어지는 수가 될 때까지 2를 빼는 작업 반복
         */
        while (n > 0) {
            if (n % 5 == 0) {
                cnt += (n / 5);
                break;
            }
            n -= 2;
            cnt += 1;
            /**
             * 5 보다 작은 수들은 5로 나누어 떨어지지 않으므로 2를 빼는 작업을 하다가
             * n이 0보다 작아지면(n = 1, n = 3의 경우에 발생) cnt를 -1로 바꿈
             * -> n < 0이므로 반복문 조건에 안맞아 반복 종료
             */
            if (n < 0) {
                cnt = -1;
            }
        }

        System.out.println(cnt);
    }
}
