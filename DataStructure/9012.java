import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    if (!stack.isEmpty()) stack.pop();
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag) System.out.println("NO");
            else if (!stack.isEmpty()) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
