import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int t, m, n, k;
    public static int[][] map;
    public static boolean[][] visited;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] {x, y});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            x = cur[0];
            y = cur[1];
            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int test = 0; test < t; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            int result = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        bfs(i, j);
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }
}
