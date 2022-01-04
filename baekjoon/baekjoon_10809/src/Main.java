import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int N[] = new int[26];
        for(int i=0; i<26; i++) N[i] = -1;

        for(int i=0; i<S.length(); i++) {
            if(N[(int)S.charAt(i) - 'a'] == -1)
                N[(int)S.charAt(i) - 'a'] = i;
        }

        for(var i : N) System.out.print(i + " ");
    }
}