import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(int j=0; j<S.length(); j++) {
                for(int r=0; r<R; r++) {
                    sb.append(S.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}