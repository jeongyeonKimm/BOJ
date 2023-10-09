import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        Map<String, String> sitesAndPasswordsMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            String site = info[0];
            String password = info[1];
            sitesAndPasswordsMap.put(site, password);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String findPassword = sitesAndPasswordsMap.get(br.readLine());
            sb.append(findPassword).append("\n");
        }

        System.out.println(sb);
    }
}
