import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);

            if (arr.get(3) - arr.get(1) >= 4) {
                System.out.println("KIN");
            }
            else {
                int sum = 0;
                for (int k = 1; k <= 3; k++) {
                    sum += arr.get(k);
                }

                System.out.println(sum);
            }
        }
    }
}
