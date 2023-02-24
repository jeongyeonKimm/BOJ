import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            sum += x;
            arr.add(x);
        }

        Collections.sort(arr);

        int avg = sum / arr.size();
        System.out.println(avg);
        System.out.println(arr.get((arr.size() / 2)));
    }
}
