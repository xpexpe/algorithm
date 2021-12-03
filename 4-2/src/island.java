import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class island {
    static boolean visited[][];
    static LinkedList<String> [][] graph;
    static int land[][];

    public static void graphset(int h, int w) {
        for(int y=1; y<=h; y++) {
            for(int x=1; x<=w; x++) {
                if(land[y][x] == 0) continue;
                for(int i=y-1 ;i<=y+1; i++) {
                    for(int j=x-1; j<=x+1; j++) {
                        if(land[i][j] == 1)
                            graph[y][x].add(i+","+j);
                    }
                }
            }
        }
    }

    public static int findsize(int y, int x) {
        if(land[y][x] == 0) return 0;

        for(int i=0; i<visited.length; i++) for(int j=0; j<visited[i].length; j++)  visited[i][j] = false;
        // visited[] init

        int size = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(y+","+x);
        StringTokenizer st;
        while(!queue.isEmpty()) {
            String str = queue.remove();

            int qy, qx;
            st = new StringTokenizer(str, ",");
            qy = Integer.parseInt(st.nextToken());
            qx = Integer.parseInt(st.nextToken());


            Iterator<String> it = graph[qy][qx].iterator();
            while(it.hasNext()) {
                String s = it.next();
                int sy, sx;
                st = new StringTokenizer(s, ",");
                sy = Integer.parseInt(st.nextToken());
                sx = Integer.parseInt(st.nextToken());

                if(visited[sy][sx] == false)    {
                    queue.add(sy + "," + sx);
                    visited[sy][sx] = true;
                    size++;
                }
            }
        }
        return size;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        visited = new boolean[h+1][w+1];
        graph = new LinkedList[h+1][w+1];
        for(int y=1; y<=h; y++) {
            for (int x=1; x<=w; x++) {
                graph[y][x] = new LinkedList<>();
            }
        }

        land = new int[h+2][w+2];
        for(int y=1; y<=h; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x=1; x<=w; x++) {
                land[y][x] = Integer.parseInt(st.nextToken());
            }
        }
        graphset(h, w);

        int max = Integer.MIN_VALUE;
        for(int y=1; y<=h; y++) {
            for (int x=1; x<=w; x++) {
                int tmp = findsize(y, x);
                if(tmp > max) max = tmp;
            }
        }
        System.out.println(max);
    }
}
