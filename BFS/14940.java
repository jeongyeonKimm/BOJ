import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int n, m;
    private static int[][] map;
    private static boolean[][] isVisited;
    private static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        isVisited = new boolean[n][m];
        distance = new int[n][m];

        int goalX = 0;
        int goalY = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    goalX = i;
                    goalY = j;
                }
            }
        }

        bfs(goalX, goalY);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && map[i][j] == 1) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(distance[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            x = cur[0];
            y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                        distance[nx][ny] = distance[x][y] + 1;
                        isVisited[nx][ny] = true;
                        queue.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}
