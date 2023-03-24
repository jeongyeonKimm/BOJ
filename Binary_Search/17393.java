import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long[] ink, viscosity;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        ink = new long[n];
        viscosity = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ink[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            viscosity[i] = Long.parseLong(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n - 1; i++) {
            int left = i;
            int right = n - 1;
            long value = ink[i];
            int index = i;

            while(left <= right) {
                int mid = (left + right) / 2;
                if (viscosity[mid] <= value) {
                    index = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int temp = index - i;
            sb.append(temp).append(" ");
        }
        sb.append(0);
        System.out.println(sb);
    }
}
