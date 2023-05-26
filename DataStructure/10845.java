import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (command.equals("front")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            } else if (command.equals("back")) {
                if (queue.isEmpty()) System.out.println(-1);
                else {
                    int size = queue.size();
                    for (int j = 0; j < size; j++) {
                        int num = queue.remove();
                        if (j == size - 1) {
                            System.out.println(num);
                        }
                        queue.offer(num);
                    }
                }
            }
        }
    }
}
