import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder sb = new StringBuilder();

        int curA = A.length() - 1;
        int curB = B.length() - 1;
        boolean Along = (curA > curB)?true:false;

        int tmp, up=0;

        while(true) {
            if(curA < 0 || curB < 0)    break;

            tmp = Character.getNumericValue(A.charAt(curA--)) +
                    Character.getNumericValue(B.charAt(curB--)) + up;
            sb.append(tmp%10);
            up = tmp/10;
        }
        if(Along)   while(curA >= 0) {
            tmp = Character.getNumericValue(A.charAt(curA--)) + up;
            sb.append(tmp%10);
            up = tmp/10;
        }
        else {
            while(curB >= 0) {
                tmp = Character.getNumericValue(B.charAt(curB--)) + up;
                sb.append(tmp%10);
                up = tmp/10;
            }
        }

        if(up==1) sb.append(up);

        System.out.println(sb.reverse());
    }
}