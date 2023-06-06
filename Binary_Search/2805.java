import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] trees = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        int left = 0;
        int right = max;

        while (left < right) {
            int mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (mid < trees[i]) {
                    sum += (trees[i] - mid);
                }
            }
            if (sum < m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left - 1);
    }
}
