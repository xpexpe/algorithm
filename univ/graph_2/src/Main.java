import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<LinkedList> graph = new ArrayList<>();
        for(int i=0; i<=N; i++)  graph.add(new LinkedList<Integer>());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        boolean visited[] = new boolean[N+1];
        for(int i=0; i<=N; i++) visited[i] = false;

        int depth[] = new int[N+1];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(p);
        visited[p] = true;
        depth[p] = 0;
        boolean find = false;


        while(!queue.isEmpty()) {
            int sel = queue.remove();
            Iterator<Integer> it = graph.get(sel).iterator();
            while(it.hasNext()) {
                int num = it.next();
                if(num == q)    find = true;
                if(!visited[num]) {
                    depth[num] = depth[sel] + 1;
                    queue.add(num);
                    visited[num] = true;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(find) {
            bw.write("아는 사람");
            for(int i=1; i<depth[q]; i++) bw.write("의 아는 사람");
        }
        else bw.write("모르는 사람");

        bw.flush();
    }
}
