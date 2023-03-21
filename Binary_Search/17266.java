import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] lights;

    public static boolean possible(int target) {
        int prev = 0;   // 이전 가로등이 비춘 마지막 지점, 0 지점부터 모두 비춰주어야 하기 때문에 0부터 시작

        for (int i = 0; i < lights.length; i++) {
            /**
             * 가로등이 있는 지점에서 비출 수 있는 높이(target)을 뺀 값이 
             * 이전 가로등이 비춘 마지막 지점에 도달했다면 prev 갱신
             */
            if (lights[i] - target <= prev) {
                prev = lights[i] + target;
            }
            /**
             * 가로등이 있는 지점에서 비출 수 있는 높이(target)을 뺀 값이 
             * 이전 가로등이 비춘 마지막 지점에 도달하지 못했다면 모든 지점을 비출 수 없음
             */
            else {
                return false;
            }
        }

        /**
         * 마지막 지점도 가로등이 비출 수 있는지 확인해야 하므로
         * 마지막 가로등이 비출 수 있는 끝 지점에서 굴다리의 끝 좌표를 뺐을 때
         * 0보다 작거나 같아야 마지막 지점도 비춰짐
         */
        return n - prev <= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        lights = new int[m];
        for (int i = 0; i < m; i++) {
            lights[i] = sc.nextInt();
        }

        int left = 1;
        int right = n;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            // mid 높이로 모든 지점 비출 수 있다면 result 갱신 후 더 낮은 높이도 가능한지 확인
            if (possible(mid)) {
                result = mid;
                right = mid - 1;
            } 
            // mid로 모든 지점 비출 수 없다면 높이 높여서 재탐색
            else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}
