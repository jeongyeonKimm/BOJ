import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

        String[] splitExp = expression.split("-");

        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i < splitExp.length; i++) {
            String[] strNumbers = splitExp[i].split("\\+");
            int sum = 0;
            for (String strNumber : strNumbers) {
                sum += Integer.parseInt(strNumber);
            }

            if (result == Integer.MAX_VALUE) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
