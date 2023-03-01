import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int r, c;
    public static int[][] map = new int[5][5];
    public static int count = 0;
    public static int depth = 0;

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {1, -1, 0, 0};

    public static boolean result = false;

    public static void dfs(int r, int c, int depth, int count) {
        if (depth <= 3 && count >= 2) {
            result = true;
            return;
        }

        if (depth >= 3 && count < 2) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];
            if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                if (map[nx][ny] != -1) {
                    map[r][c] = -1;
                    if (map[nx][ny] == 1) {
                        dfs(nx, ny, depth + 1, count + 1);
                    }
                    else {
                        dfs(nx, ny, depth + 1, count);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        dfs(r, c, depth, count);

        if (result) System.out.println(1);
        else System.out.println(0);
    }
}
