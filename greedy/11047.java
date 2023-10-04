import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> coinTypes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            coinTypes.add(coin);
        }

        int count = 0;
        for (int i = coinTypes.size() - 1; i >= 0; i--) {
            if (coinTypes.get(i) <= k) {
                count += (k / coinTypes.get(i));
                k %= coinTypes.get(i);
            }
        }

        System.out.println(count);
    }
}
