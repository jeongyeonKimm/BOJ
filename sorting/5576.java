import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> w = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            w.add(sc.nextInt());
        }

        ArrayList<Integer> k = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            k.add(sc.nextInt());
        }

        Collections.sort(w);
        Collections.sort(k);

        int sumW = 0;
        int sumK = 0;
        for (int i = 1; i <= 3; i++) {
            sumW += w.get(w.size() - i);
            sumK += k.get(k.size() - i);
        }

        System.out.println(sumW + " " + sumK);
    }
}
