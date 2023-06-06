import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static BigInteger factorial(int x) {
        BigInteger fac = new BigInteger("1");
        while (x > 0) {
            fac = fac.multiply(BigInteger.valueOf(x));
            x -= 1;
        }
        return fac;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger fac = factorial(n);

        int count = 0;
        while (fac.compareTo(BigInteger.valueOf(0)) > 0) {
            if (fac.remainder(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(0)) == 0) {
                count++;
            } else {
                break;
            }
            fac = fac.divide(BigInteger.valueOf(10));
        }

        System.out.println(count);
    }
}
