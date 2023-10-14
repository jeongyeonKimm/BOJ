import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void divide(int row, int col, int size) {
        if (checkColor(row, col, size)) {
            if (arr[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        divide(row, col, newSize);
        divide(row, col + newSize, newSize);
        divide(row + newSize, col, newSize);
        divide(row + newSize, col + newSize, newSize);
    }

    public static boolean checkColor(int row, int col, int size) {
        int color = arr[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
