import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < l; i++) {
            BigInteger num = new BigInteger(String.valueOf((str.charAt(i) - 'a' + 1)));
            num = num.multiply(BigInteger.valueOf(31).pow(i));
            sum = sum.add(num);
        }

        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }
}
