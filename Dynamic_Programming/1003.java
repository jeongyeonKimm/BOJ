import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[] cntZero = new int[41];
        int[] cntOne = new int[41];

        cntZero[0] = 1;
        cntOne[1] = 1;

        for (int i = 2; i <= 40; i++) {
            cntZero[i] = cntZero[i - 1] + cntZero[i - 2];
            cntOne[i] = cntOne[i - 1] + cntOne[i - 2];
        }

        for (int t = 0; t < testCase; t++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(cntZero[n] + " " + cntOne[n]);
        }
    }
}
