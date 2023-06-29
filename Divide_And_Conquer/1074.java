import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result = 0;

    public static void find(int size, int r, int c) {
        if (size == 1) return;

        if (r < size / 2 && c < size / 2) {
            find(size / 2, r, c);
        } else if (r < size / 2 && c >= size / 2) {
            result += (size / 2) * (size / 2);
            find(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            result += (size / 2) * (size / 2) * 2;
            find(size / 2, r - size / 2, c);
        } else {
            result += (size / 2) * (size / 2) * 3;
            find(size / 2, r - size / 2, c - size / 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        find((int) Math.pow(2, n), r, c);
        System.out.println(result);
    }
}
