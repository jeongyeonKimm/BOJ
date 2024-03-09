import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] meetingTime = new int[n][2];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            meetingTime[i][0] = Integer.parseInt(st.nextToken());
            meetingTime[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetingTime, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int previousEndTime = 0;

        for (int i = 0; i < n; i++) {
            if (previousEndTime <= meetingTime[i][0]) {
                previousEndTime = meetingTime[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
