import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        double result = 0;
        for (int i = n - 1; i >= 0; i--) {
            boolean flagR = false;
            boolean flagC = false;

            if (r < Math.pow(2, i)) {
                flagR = true;
            } else {
                r = (int) (r - Math.pow(2, i));
            }
            if (c < Math.pow(2, i)) {
                flagC = true;
            } else {
                c = (int) (c - Math.pow(2, i));
            }

            if (flagR && flagC) {
                result += (0 * Math.pow(2, i) * Math.pow(2, i));
            } else if (flagR && !flagC) {
                result += (1 * Math.pow(2, i) * Math.pow(2, i));
            } else if (!flagR && flagC) {
                result += (2 * Math.pow(2, i) * Math.pow(2, i));
            } else {
                result += (3 * Math.pow(2, i) * Math.pow(2, i));
            }
        }

        System.out.println((int) result);
    }
}
