import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < 12; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.get(x).add(y);
            arr.get(y).add(x);
        }

        int spica = 0;

        for (int i = 1; i <= 12; i++) {
            boolean one = false;
            boolean two = false;
            boolean three = false;
            if (arr.get(i).size() == 3) {
                for (int j = 0; j < 3; j++) {
                    int x = arr.get(arr.get(i).get(j)).size();
                    if (x == 1 && !one) one = true;
                    if (x == 2 && !two) two = true;
                    if (x == 3 && !three) three = true;
                }
            }
            if (one && two && three) spica = i;
        }

        System.out.println(spica);
    }
}
