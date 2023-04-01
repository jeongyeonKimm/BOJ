import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        int min = Integer.MAX_VALUE;    // 최저 주가
        int result = 0; // 최대 이득

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(st.nextToken());
            result = Math.max(x - min, result); // i번째 날에 주식을 판매할 때의 이득과 현재의 최대 이득 중 최대값으로 최대 이득 갱신
            min = Math.min(x, min); // 최저 주가 갱신
        }

        System.out.println(result);
    }
}
