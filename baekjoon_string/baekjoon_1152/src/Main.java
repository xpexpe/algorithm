import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String sp[] = S.split(" ");

        int count = 0;
        for(var i : sp)	if(i != "")	count++;

        System.out.println(count);
    }
}