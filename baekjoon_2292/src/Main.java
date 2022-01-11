import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 1;
        int j = 1;
        int count = 0;
        do {
          N -= i;
          i = 6 * j;
          j++;
          count += 1;
        }while(N > 0);

        System.out.println(count);
    }
}
