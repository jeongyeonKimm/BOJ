import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                arr[word.charAt(i) - 'a']++;
            } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                arr[word.charAt(i) - 'A']++;
            }
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = (char)('A' + i);
            } else if (max == arr[i]){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
