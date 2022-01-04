import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[];
    static ArrayList<LinkedList<Integer>> graph = new ArrayList<>();

    public static void DFS(int num) {
        if(visited[num] == false) {
            visited[num] = true;
            Iterator<Integer> it = graph.get(num).iterator();
            while(it.hasNext()) {
                int i = it.next();
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        for(int i=0; i<=N; i++)  visited[i] = false;

        for(int i=0; i<=N; i++)  graph.add(new LinkedList<>());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }
        DFS(1);

        int n=0;
        for(int i = 0; i<=N; i++) {
            if (visited[i] == true) n++;
        }
        System.out.println(n);
    }
}
