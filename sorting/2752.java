import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (int i = 0; i < 3; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
