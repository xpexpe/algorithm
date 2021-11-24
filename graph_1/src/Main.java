import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<LinkedList> graph = new ArrayList<>();

        for(int i=0; i<=N; i++) graph.add(new LinkedList<Integer>());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int linknode = Integer.parseInt(st.nextToken());

            graph.get(node).addLast(linknode);
            graph.get(linknode).addLast(node);
        }

        for(int i=1; i<=N; i++) {
            Iterator<Integer> it = graph.get(i).iterator();
            while(it.hasNext())
                int num = it.next();
                System.out.print(in + " ");
            System.out.println();
        }
    }
}
