import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lanLength = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            lanLength[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lanLength[i]);
        }

        max++;  // mid가 0이 되어 lanLength[i]를 0으로 나누는 것 방지

        long min = 0;

        while (min < max) {
            long mid = (min + max) / 2;

            int count = 0;
            for (int i = 0; i < k; i++) {
                count += lanLength[i] / mid;
            }

            /**
             * UpperBound 방식
             *
             * mid 길이로 잘랐을 때 개수가 필요한 랜선 개수보다 작으면
             * 자르고자 하는 최대 길이를 줄이고
             * 그렇지 않다면 최소 길이를 늘림
             */
            if (count < n) max = mid;
            else min = mid + 1;
        }

        System.out.println(max - 1);    // 구해야 하는 것이 랜선의 최대길이이므로 max - 1
    }
}
