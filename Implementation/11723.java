import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        int S = 0;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if (op.equals("all")) {
                S = (1 << 21) - 1;
            } else if (op.equals("empty")) {
                S = 0;
            } else {
                int x = Integer.parseInt(st.nextToken());
                if (op.equals("add")) {
                    S |= (1 << x);
                } else if (op.equals("remove")) {
                    S &= ~(1 << x);
                } else if (op.equals("check")) {
                    sb.append((S & (1 << x)) == (1 << x) ? 1 : 0).append("\n");
                } else if (op.equals("toggle")) {
                    S ^= (1 << x);
                }
            }
        }

        System.out.println(sb);
    }

    /*
    public static Set<Integer> s = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            operate(br.readLine());
        }

        System.out.println(sb);
    }

    private static void operate(String str) {
        StringTokenizer st = new StringTokenizer(str);
        String command = st.nextToken();
        int x;

        switch (command) {
            case "add":
                x = Integer.parseInt(st.nextToken());
                s.add(x);
                break;
            case "remove":
                x = Integer.parseInt(st.nextToken());
                s.remove(x);
                break;
            case "check":
                x = Integer.parseInt(st.nextToken());
                if (s.contains(x)) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
                break;
            case "toggle":
                x = Integer.parseInt(st.nextToken());
                if (s.contains(x)) {
                    s.remove(x);
                } else {
                    s.add(x);
                }
                break;
            case "all":
                s.clear();
                for (int i = 1; i <= 20; i++) {
                    s.add(i);
                }
                break;
            case "empty":
                s.clear();
                break;
        }
    }
    */
}
