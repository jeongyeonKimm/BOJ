import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            /**
             * 층 수 구하기
             *
             * n을 h로 나눈 나머지 - 0 ~ h - 1
             * n을 h로 나눈 나머지가 0이면 가장 윗층에 배정
             */
            String floor;
            if (n % h == 0) floor = String.valueOf(h);
            else floor = String.valueOf(n % h);

            /**
             * 호 수 구하기
             * 
             * n을 h로 나눈 나머지 - 0 ~ h - 1
             * n을 h로 나눈 나머지가 0이면 가장 윗층에 배정 -> 다음 호수로 넘어가지 않음
             */
            String room;
            if (n % h == 0) room = String.valueOf(n / h);
            else room = String.valueOf((n / h) + 1);

            // 호 수가 한자리 수일 경우 호 수 앞에 0 붙이기
            if (room.length() < 2) room = "0" + room;

            System.out.println(floor + room);
        }
    }
}
