import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] temp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);

        Map<Integer, Integer> rank = new HashMap<>();
        int idx = 0;
        for (int num : temp) {
            if (!rank.containsKey(num)) {
                rank.put(num, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int value = rank.get(key);
            sb.append(value).append(" ");
        }

        System.out.println(sb);
    }
}
