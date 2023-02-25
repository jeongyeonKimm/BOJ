import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[][] map = new int[3][3];
    public static boolean[][] visited = new boolean[3][3];

    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (map[x][y] == -1) {
            System.out.println("HaruHaru");
            System.exit(0);
        }

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i] * map[x][y];
            int ny = y + dy[i] * map[x][y];
            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println("Hing");

    }
}
