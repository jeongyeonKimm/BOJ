import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) System.out.println(1);
        else {
            int num = 1;
            int count = 1;
            while (true) {
                num += 6 * count;
                count++;
                if (n <= num) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
