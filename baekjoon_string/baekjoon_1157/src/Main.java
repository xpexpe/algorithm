import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N [] = new int[26];
        for(int i=0; i<25; i++) N[i] = 0;


        String S = br.readLine().toUpperCase();

        for(int i=0; i<S.length(); i++) {
            N[(int)S.charAt(i) - 'A']++;
        }

        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        for(int i=0; i<26; i++) {            if(N[i] > max) {
                maxindex = i;
                max = N[i];
            }
        }

        int count = 0;
        for(var i : N) if(i == max) count++;

        if(count != 1) System.out.println("?");
        else System.out.println((char)((int)'A'+maxindex));

    }
}
