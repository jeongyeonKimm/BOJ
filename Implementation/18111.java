import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int maxHeight = 0;
        int minHeight = 256;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (maxHeight < map[i][j]) maxHeight = map[i][j];
                if (minHeight > map[i][j]) minHeight = map[i][j];
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int i = minHeight; i <= maxHeight; i++) {
            int count = 0;
            int block = b;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (map[j][k] < i) {
                        block -= (i - map[j][k]);
                        count += (i - map[j][k]);
                    } else if (map[j][k] > i) {
                        block += (map[j][k] - i);
                        count += ((map[j][k] - i) * 2);
                    }
                }
            }

            if (block < 0) break;

            if (count <= time) {
                time = count;
                height = i;
            }
        }

        System.out.println(time + " " + height);
    }
}
