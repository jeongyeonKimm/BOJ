import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxIdx = 0;
        for (int i = 1; i <= n; i++) {
            int idx = i;
            int count = 0;
            boolean[] check = new boolean[n + 1];
            while (!check[idx]) {
                check[idx] = true;
                idx = arr[idx];
                count++;
            }
            if (max < count) {
                maxIdx = i;
                max = count;
            }
        }

        System.out.println(maxIdx);
    }
}
