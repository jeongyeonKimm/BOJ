import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n, m;
    public static int[][] arr = new int[50][50];
    public static boolean[][] visited = new boolean[50][50];

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void dfs (int x, int y, int start, int end, char ch) {
        visited[x][y] = true;

        for (int i = start; i < end; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < n && 0 <= ny & ny < m) {
                if (!visited[nx][ny] && arr[nx][ny] == ch) {
                    dfs(nx, ny, start, end, ch);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = false;
            }
        }

        int result = 0;

        // 가로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && arr[i][j] == '-') {
                    dfs(i, j,  0, 2, '-');
                    result++;
                }
            }
        }

        // 세로
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[j][i] && arr[j][i] == '|') {
                    dfs(j, i,  2, 4, '|');
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
