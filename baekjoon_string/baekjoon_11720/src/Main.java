import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String str = br.readLine();

        for(int i=0; i<N; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        System.out.println(sum);
    }
}
