import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static boolean primeN[];

    static void isPrime() {
        primeN[0] = primeN[1] = true;
        for(int i=2; i<primeN.length; i++) {
            if(!primeN[i]) {
                for(int j=i+i; j<primeN.length; j=j+i) {
                    primeN[j] = true;
                }
            }
        }
    }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            primeN = new boolean[N+1];
            isPrime();

            int i=2;
            while(true) {
                if (N == 1) break;
                if(primeN[i]) {
                    i++;
                    continue;
                }
                if(N%i == 0) {
                    System.out.println(i);
                    N = N / i;
                }
                else    i++;
            }
        }
                    /*
        while(true) {
            if(N == 1)  break;
            for(int i=2; i<N; i++) {
                if(isPrime(N)) {
                    System.out.println(N);
                    return;
                }
                if(isPrime(i)) {
                    while(N % i == 0) {
                        System.out.println(i);
                        N = N / i;
                    }
                }
            }
        */
}
