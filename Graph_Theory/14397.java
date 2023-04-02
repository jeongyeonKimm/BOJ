import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 0};
    static int[] dy_odd = {0, 1, 1, 1, 0, -1};
    static int[] dy_even = {-1, 0, 1, 0, -1, -1};
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int beachLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 6; k++) {
                    int nx = i + dx[k];
                    int ny;
                    if (i % 2 == 0) {
                        ny = j + dy_even[k];
                    } else {
                        ny = j + dy_odd[k];
                    }
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        if (map[i][j] == '#' && map[nx][ny] == '.') {
                            beachLength++;
                        }
                    }
                }
            }
        }

        System.out.println(beachLength);
    }
}
