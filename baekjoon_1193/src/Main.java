import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        int x=1, y=1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int sum = 2;
        int count = 1;

        while(true) {
            if(count == X)  break;

            if(sum % 2 == 0) {
                if(x==1) {
                    y++;
                    sum++;
                } else {
                    x--;
                    y++;
                }
            }
            else {
                if(y==1) {
                    x++;
                    sum++;
                } else {
                    x++;
                    y--;
                }
            }

            count++;
        }

        System.out.println(x + "/" + y);
    }
}
