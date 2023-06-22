import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            String result = isBalanced(str);

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (str.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) return "yes";
        else return "no";
    }
}
