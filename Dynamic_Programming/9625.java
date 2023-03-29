import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] countA = new int[46];
        int[] countB = new int[46];

        // 첫 화면은 A
        countA[0] = 1;
        countB[0] = 0;
        
        for (int i = 1; i <= k; i++) {
            countA[i] = countB[i - 1];  // A의 개수는 이전 단계의 B의 개수와 동일
            countB[i] = countA[i - 1] + countB[i - 1];  // B의 개수는 이전 단계의 A의 개수와 B의 개수의 합과 동일
        }

        System.out.println(countA[k] + " " + countB[k]);
    }
}
