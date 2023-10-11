import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Map<String, Integer> closet = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String type = br.readLine().split(" ")[1];
                closet.put(type, closet.getOrDefault(type, 0) + 1);
            }
            int result = 1;
            for (Integer value : closet.values()) {
                result *= (value + 1);
            }
            System.out.println(result - 1);
        }
    }
}
