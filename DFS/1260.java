import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int n, m, v;

    public static void dfs(int[][] map, boolean[] visited, int i) {
        visited[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (!visited[j] && map[i][j] == 1) {
                dfs(map, visited, j);
            }
        }
    }

    public static void bfs(int[][] map, boolean[] visited, int i) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(i);
        visited[i] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && map[now][j] == 1) {
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        int[][] map = new int[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(map, visited, v);
        System.out.println();

        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }

        bfs(map, visited, v);
    }
}
