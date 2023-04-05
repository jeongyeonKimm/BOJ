import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n + 1][n + 1];

        int val = 1;
        int total = 0;  // 전체 친구 관계 수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = val;
            map[b][a] = val;
            total++;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int before = total;
            val++;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {  
                    if (map[i][j] > 0 && map[i][j] < val && i != j) {   // i와 j가 친구 관계인 경우
                        for (int k = 1; k <= n; k++) {  // j의 친구를 찾기 위한 반복문
                            if (map[j][k] > 0 && map[j][k] < val && i != k) {   // j와 k가 친구인 경우
                                if (map[i][k] == 0) {   // j의 친구인 k가 i의 친구가 아니면 친구 관계 만들어주고 전체 친구 관계 수 증가 
                                    map[i][k] = val;
                                    map[k][i] = val;
                                    total++;
                                }
                            }
                        }
                    }
                }
            }
            int dayTotal = total - before;  // 하루에 생성된 친구 관계 수
            arr.add(dayTotal);
            if (total == n * (n - 1) / 2) { // 모든 사람들이 친구 관계가 된 경우
                break;
            }
        }

        System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
