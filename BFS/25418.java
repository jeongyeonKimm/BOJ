import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int a, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        Queue<int[]> q = new ArrayDeque<>();
        boolean[] visited = new boolean[k + 1];

        q.add(new int[] {a, 0});
        visited[a] = true;

        while(!q.isEmpty()) {
            int[] now = q.poll();
            if (now[0] == k) {
                System.out.println(now[1]);
                return;
            }
            if (now[0] * 2 <= k) {
                visited[now[0] * 2] = true;
                q.add(new int[] {now[0] * 2, now[1] + 1});
            }
            if (!visited[now[0] + 1]) {
                q.add(new int[] {now[0] + 1, now[1] + 1});
            }
        }
    }
}
