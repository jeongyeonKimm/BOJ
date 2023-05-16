import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a == 0) && (b == 0) && (c == 0)) break;

            boolean flag = false;
            if (((a > b) && (b > c)) || ((a > c) && (c > b))) {
                flag = (a * a) == (b * b + c * c);
            } else if (((b > a) && (a > c)) || ((b > c) && (c > a))) {
                flag = (b * b) == (a * a + c * c);
            } else {
                flag = (c * c) == (a * a + b * b);
            }

            if (flag) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
