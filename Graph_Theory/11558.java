import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            int n = Integer.parseInt(br.readLine());

            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] =  Integer.parseInt(br.readLine());
            }

            int k = 0;
            int idx = 1;
            boolean flag = false;
            boolean[] check = new boolean[n + 1];

            while (!check[idx]) {
                check[idx] = true;
                if (idx == n) {
                    flag = true;
                    break;
                }
                idx = parent[idx];
                k++;
            }

            System.out.println(flag ? k : 0);
        }
    }
}
