import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Problem implements Comparable<Problem> {
    int sub1;
    int sub2;

    public Problem(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    @Override
    public int compareTo(Problem other) {
        if (this.sub2 == other.sub2) {
            return Integer.compare(this.sub1, other.sub1);
        }
        return Integer.compare(this.sub2, other.sub2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Problem> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            arr.add(new Problem(sub1, sub2));
        }

        Collections.sort(arr);

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i).sub2 <= l && k != 0) {
                result += 140;
                k--;
            } else if (arr.get(i).sub1 <= l && k != 0) {
                result += 100;
                k--;
            }
            if (k == 0) break;
        }

        System.out.println(result);
    }
}
