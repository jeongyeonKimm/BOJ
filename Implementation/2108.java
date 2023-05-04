import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];

        int sum = 0;
        int median = 10000; // 중앙값
        int mode = 10000;   // 최빈값
        int max = -4001;    // 최댓값
        int min = 4001; // 최솟값

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            sum += x;
            arr[x + 4000]++;
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
        }

        int count = 0;  // 중앙값 빈도 누적 수
        int maxMode = 0;    // 최빈값의 최댓값
        boolean flag = true; // 이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐 경우 false

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                /**
                 * [중앙값 찾기]
                 * 누적 횟수가 전체 길이의 절반에 못미친다면
                 */
                if (count < (n + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                /**
                 * [최빈값 찾기]
                 * 이전 최빈값보다 현재 값의 빈도수가 더 높은 경우 
                 */
                if (maxMode < arr[i]) {
                    maxMode = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (maxMode == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
