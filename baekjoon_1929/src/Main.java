import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int M, N;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        ArrayList<Boolean> arr = new ArrayList<>(N+1);

        // 0, 1 - 소수 아님
        arr.add(false);
        arr.add(false);

        for(int i=2; i<=N; i++) arr.add(true);

        for(int i=2; (i*i)<=N; i++) {
            if(arr.get(i)) {
                for (int j = i * i; j <= N; j += i)  arr.set(j, false);
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i=M; i<=N; i++) {
            if(arr.get(i))  sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
