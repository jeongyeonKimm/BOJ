import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n, k;

    private static boolean[] isVisited;
    private static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        isVisited = new boolean[200001];
        count = new int[200001];

        bfs(n);

        System.out.println(count[k]);
    }

    private static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        isVisited[x] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur - 1 >= 0) {
                if (!isVisited[cur - 1]) {
                    q.offer(cur - 1);
                    isVisited[cur - 1] = true;
                    count[cur - 1] = count[cur] + 1;
                }
            }

            if (cur + 1 < 200001) {
                if (!isVisited[cur + 1]) {
                    q.offer(cur + 1);
                    isVisited[cur + 1] = true;
                    count[cur + 1] = count[cur] + 1;
                }
            }

            if (2 * cur < 200001) {
                if (!isVisited[2 * cur]) {
                    q.offer(2 * cur);
                    isVisited[2 * cur] = true;
                    count[2 * cur] = count[cur] + 1;
                }
            }
        }
    }
}
