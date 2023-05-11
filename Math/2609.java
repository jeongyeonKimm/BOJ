import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int gcd = Math.min(n, m);
        while (gcd > 0) {
            if (n % gcd == 0 && m % gcd == 0) {
                break;
            }
            gcd--;
        }

        int lcm = Math.max(n, m);
        while (true) {
            if (lcm % n == 0 && lcm % m == 0) {
                break;
            }
            lcm++;
        }

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
