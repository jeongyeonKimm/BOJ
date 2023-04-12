import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static int min = 64;

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

        /**
         * NxM에서 8x8 체스판을 만들 수 있는 경우의 수는
         * 2 * (N - 7) * (M - 7)
         */
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private static void find(int i, int j) {
        char color = map[i][j]; // 첫번째 칸의 색
        int count = 0;

        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if (map[k][l] != color) {
                    count++;
                }
                if (color == 'W') color = 'B';
                else color = 'W';
            }
            if (color == 'W') color = 'B';
            else color = 'W';
        }

        /**
         * 8x8 체스판의 첫번째 칸의 색을 그대로 두고 칠할 때의 개수(count)와
         * 첫번째 칸의 색을 반대 색깔로 바꾸고 칠할 때의 개수(64-count) 중
         * 최소값을 count에 저장
         */
        count = Math.min(count, 64 - count);
        
        min = Math.min(min, count);
    }
}
