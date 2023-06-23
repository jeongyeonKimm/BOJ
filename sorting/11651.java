import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point2 {
    private int x;
    private int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Point2> points = new ArrayList<Point2>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Point2 p = new Point2(x, y);
            points.add(p);
        }

        Collections.sort(points, new Comparator<Point2>() {
            @Override
            public int compare(Point2 o1, Point2 o2) {
                if (o1.getY() == o2.getY()) {
                    return o1.getX() - o2.getX();
                }
                return o1.getY() - o2.getY();
            }
        });

        for (Point2 point : points) {
            System.out.println(point.getX() + " " + point.getY());
        }
    }
}
