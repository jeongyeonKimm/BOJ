import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());

        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                // 하나의 문서를 위치와 중요도를 가진 배열로 큐에 삽입 
                queue.offer(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;  // 인쇄 순번

            while (true) {
                boolean flag = false;   // 현재 문서보다 중요도가 높은 문서 유무
                int[] now = queue.poll();   // 현재 문서
                for (int[] q : queue) {
                    if (q[1] > now[1]) { 
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    queue.add(now); // 현재 문서보다 중요도가 높은 문서가 있으므로 현재 문서를 큐의 맨뒤에 삽입
                } else {
                    count++;
                    if (now[0] == m) break; // 현재 문서가 궁금한 문서이면 반복 종료
                }
            }

            System.out.println(count);
        }
    }
}
