import java.io.*;
import java.util.StringTokenizer;



public class Main {

    public static int atoi(char c) {
        switch(c) {
            case 'A':
            case 'B':
            case 'C':
                return 3;
            case 'D':
            case 'E':
            case 'F':
                return 4;
            case 'G':
            case 'H':
            case 'I':
                return 5;
            case 'J':
            case 'K':
            case 'L':
                return 6;
            case 'M':
            case 'N':
            case 'O':
                return 7;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 8;
            case 'T':
            case 'U':
            case 'V':
                return 9;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 10;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int mintime = 0;

        for(int i=0; i<S.length(); i++) {
            mintime += atoi(S.charAt(i));
        }

        System.out.println(mintime);
    }
}
