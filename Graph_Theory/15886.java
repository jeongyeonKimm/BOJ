import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] map = new int[n + 1];

        String str = br.readLine();

        for (int i = 1; i <= n; i++) {
            map[i] = str.charAt(i - 1);
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (map[i] == 'E' && map[i + 1] == 'W') {
                count++;
            }
        }

        System.out.println(count);
    }
}
