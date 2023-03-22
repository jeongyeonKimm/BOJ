import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int n, t;
    static long start, interval, cars, result, left, right, mid;
    static ArrayList<Long> busTime = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            start = Long.parseLong(st.nextToken());
            interval = Long.parseLong(st.nextToken());
            cars = Long.parseLong(st.nextToken());
            for (int j = 0; j < cars; j++) {
                busTime.add(start + interval * j);
            }
        }

        Collections.sort(busTime);

        if (busTime.get(0) >= t) {
            result = busTime.get(0) - t;
        } else if (busTime.get(busTime.size() - 1) < t) {
            result = -1;
        } else {
            left = 0;
            right = busTime.size() - 1;

            while (left < right) {
                mid = (left + right) / 2;
                if (busTime.get((int) mid) == t) {
                    System.out.println(0);
                    return;
                } else if (busTime.get((int)mid) > t) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            result = busTime.get((int) right) - t;
        }

        System.out.println(result);

    }
}
