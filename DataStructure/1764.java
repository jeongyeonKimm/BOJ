import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> notListen = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            notListen.add(br.readLine());
        }

        Set<String> notLook = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            notLook.add(br.readLine());
        }

        notListen.retainAll(notLook);

        StringBuilder sb = new StringBuilder();
        sb.append(notListen.size()).append("\n");

        for (String s : notListen) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
