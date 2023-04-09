import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < r; j++) {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
