import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int idx = 0;
        boolean flag = false;
        boolean[] check = new boolean[n + 1];

        while (!check[idx]) {
            check[idx] = true;
            if (idx == k) {
                flag = true;
                break;
            }
            idx = arr[idx];
            count++;
        }

        System.out.println(flag ? count : -1);
    }
}
