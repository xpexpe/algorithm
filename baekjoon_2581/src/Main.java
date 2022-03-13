import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int min = -1;
    static int sum = 0;

    public static void find(int num) {
        if(num == 1)    return;
        for(int i=2; i<num; i++) {
            if(num % i == 0)    return;
        }
        if(min == -1)   min = num;
        sum += num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for(int i=M; i<=N; i++) {
            find(i);
        }

        if(min == -1) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }
}
