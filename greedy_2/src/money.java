import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class money {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        // N : 화폐의 개수, K : K원
        // K원을 만들 수 있는 화폐의 최소 개수를 구하여라

        int money[] = new int[N];
        int check=0;
        for(int i=0; i<N; i++) {
            money[i] = Integer.parseInt(br.readLine());
            if(money[i] < K)    check = i;
        }

        int many = 0;
        for(int i=check; i>=0; i--) {
            many += K/money[i];
            K = K % money[i];
        }

        System.out.println(many);
    }
}
