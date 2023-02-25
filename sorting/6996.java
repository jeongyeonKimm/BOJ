import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static String sortStr(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new StringBuilder(new String(s)).toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            System.out.print(a + " & " + b + " are ");
            if (!sortStr(a).equals(sortStr(b))) {
                System.out.print("NOT ");
            }
            System.out.println("anagrams.");
        }
    }
}
