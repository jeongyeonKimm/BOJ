import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String x = br.readLine();
            if (x.equals("0")) break;
            int count = 0;
            for (int i = 0; i < (x.length() + 1) / 2; i++) {
                if (x.charAt(i) == x.charAt(x.length() - (i + 1))) {
                    count++;
                }
            }
            if (count == (x.length() + 1) / 2) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
