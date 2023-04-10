import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += (str.charAt(j) - '0');
        }
        System.out.println(sum);
    }
}
