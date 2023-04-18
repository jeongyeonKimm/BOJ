import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index = 1;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            for ( ; index <= value; index++) {
                stack.push(index);
                sb.append("+").append("\n");
            }
            if (stack.peek() == value) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}
