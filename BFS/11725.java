import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] parent;

    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(x);
        parent[x] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int c : graph.get(cur)) {
                if (parent[c] == 0) {
                    parent[c] = cur;
                    q.offer(c);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        parent = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int start = 1;
        bfs(start);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }
}
