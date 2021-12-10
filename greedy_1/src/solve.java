import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ABC[] = new int[3];
        // 아이디어 개수 저장
        int LMH[] = new int[3];
        // 문제 개수 저장
        for(int i=0; i<3; i++)  ABC[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<3; i++)  LMH[i] = Integer.parseInt(st.nextToken());

        // 문제 상
        ABC[2] = ABC[2] - LMH[2];
        // 문제 중
        if(ABC[2] - LMH[1] >= 0)    ABC[2] = ABC[2] - LMH[1];
        else    {
            LMH[1]-=ABC[2];
            ABC[2] = 0;
            ABC[1] = ABC[1] - LMH[1];
        }
        // 문제 하
        if(ABC[1] - LMH[0] >= 0)    ABC[1] = ABC[1] - LMH[0];
        else {
            LMH[0]-=ABC[1];
            ABC[1] = 0;
            ABC[0] = ABC[0] - LMH[0];
        }

        boolean YS = true;
        for(int i=0; i<3; i++) if(ABC[i] < 0)   YS = false;

        if(YS) System.out.println("YES");
        else System.out.println("NO");
    }
}
