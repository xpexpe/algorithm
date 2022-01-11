import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] Alpha = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;
        for(var i : Alpha) {
            while(S.contains(i))   {
                count++;
                S = S.replaceFirst(i, ",");
            }
        }

        for(int i=0; i<S.length(); i++) if(Character.isAlphabetic(S.charAt(i))) count++;
        System.out.println(count);
    }
}
