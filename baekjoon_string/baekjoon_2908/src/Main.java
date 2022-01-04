import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void rev(String str) {
        for(int i=2; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        for(int i=2; i>=0; i--) {
            if(A.charAt(i) > B.charAt(i)) {
                rev(A);
                return;
            }
            else if(A.charAt(i) < B.charAt(i)) {
                rev(B);
                return;
            }
        }

    }
}
